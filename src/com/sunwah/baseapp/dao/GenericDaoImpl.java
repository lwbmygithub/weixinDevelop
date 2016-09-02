package com.sunwah.baseapp.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GenericDaoImpl<T, PK extends Serializable> extends
		HibernateDaoSupport implements GenericDao<T, PK> {
	/**
	 * Log variable for all child classes. Uses LogFactory.getLog(getClass())
	 * from Commons Logging
	 */
	protected final Log log = LogFactory.getLog(getClass());
	private Class<T> persistentClass;

	/**
	 * Constructor that takes in a class to see which type of entity to persist
	 * 
	 * @param persistentClass
	 *            the class type you'd like to persist
	 */
	public GenericDaoImpl(final Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return super.getHibernateTemplate().loadAll(this.persistentClass);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAllDistinct() {
		Collection result = new LinkedHashSet(getAll());
		return new ArrayList(result);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public T get(PK id) {
		return (T) super.getHibernateTemplate().get(this.persistentClass, id);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public boolean exists(PK id) {
		T entity = (T) super.getHibernateTemplate().get(this.persistentClass,
				id);
		return entity != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public T save(T object) {
		return (T) super.getHibernateTemplate().save(object);
	}
	
	public void update(T object) {
		super.getHibernateTemplate().update(object);
	}

	public void saveOrUpdate(T object) {
		super.getHibernateTemplate().saveOrUpdate(object);
	}

	@SuppressWarnings("unchecked")
	public T merge(T object) {
		return (T) super.getHibernateTemplate().merge(object);
	}
	
	public void saveOrUpdateAll(Collection<T> collections){
		super.getHibernateTemplate().saveOrUpdateAll(collections);
	}
	/**
	 * {@inheritDoc}
	 */
	public void remove(PK id) {
		super.getHibernateTemplate().delete(this.get(id));
	}
	/**
	 * {@inheritDoc}
	 */
	public void removeAll(Collection<T> collections) {
		super.getHibernateTemplate().deleteAll(collections);
	}
	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName,
			Map<String, Object> queryParams) {
		String[] params = new String[queryParams.size()];
		Object[] values = new Object[queryParams.size()];
		int index = 0;
		Iterator<String> i = queryParams.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			params[index] = key;
			values[index++] = queryParams.get(key);
		}
		return getHibernateTemplate().findByNamedQueryAndNamedParam(queryName,
				params, values);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByNamedParam(String queryString,
			Map<String, Object> queryParams) {
		String[] params = new String[queryParams.size()];
		Object[] values = new Object[queryParams.size()];
		int index = 0;
		Iterator<String> i = queryParams.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			params[index] = key;
			values[index++] = queryParams.get(key);
		}
		return getHibernateTemplate().findByNamedParam(queryString, params,
				values);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByProperty(String propertyName, Object value) {
		StringBuffer buffer = new StringBuffer(" from ");
		buffer.append(this.persistentClass.getName());
		buffer.append(" as model where model. ");
		buffer.append(propertyName);
		buffer.append(" =? ");
		return getHibernateTemplate().find(buffer.toString(), value);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByProperty(String propertyName, String value) {
		StringBuffer buffer = new StringBuffer(" from ");
		buffer.append(this.persistentClass.getName());
		buffer.append(" as model where model. ");
		buffer.append(propertyName);
		buffer.append(" =? ");
		return getHibernateTemplate().find(buffer.toString(), value);
	}

	@Override
	public void deleteObject(Object ob) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().delete(ob);

	}

	@Override
	public void deleteObjectByString(String userid,String loginname) {
		// TODO Auto-generated method stub
		final String hql="delete com.sunwah.baseapp.realm.model.TecDept a where a.userId="+userid; 
		 this.getHibernateTemplate().execute(new HibernateCallback() {   
			    public Object doInHibernate(Session session)   
			      throws HibernateException, SQLException {   
			     return session.createQuery(hql).executeUpdate();   
			    }   
	});
	}
	//一开始删除不成功的原因 depti_ID的值是102_1有下划线，当成特殊字符了
	@Override
	public void deleteObjectByDip(String deptId) {
		// TODO Auto-generated method stub
		final String hql="delete com.sunwah.baseapp.realm.model.TecDept a where a.classes='"+deptId+"'"; 
		 this.getHibernateTemplate().execute(new HibernateCallback() {   
			    public Object doInHibernate(Session session)   
			      throws HibernateException, SQLException {   
			     return session.createQuery(hql).executeUpdate();   
			    }   
	});
	}
	@Override
	public void deleteObjectByString(String contentid) {
		// TODO Auto-generated method stub
		final String hql="delete PsContent as a where a.contentId="+contentid; 
		 this.getHibernateTemplate().execute(new HibernateCallback() {   
			    public Object doInHibernate(Session session)   
			      throws HibernateException, SQLException {   
			     return session.createQuery(hql).executeUpdate();   
			    }   
	});
	}

	@Override
	public List getClasses(String userId) {
		// TODO Auto-generated method stub
		String Hql="from com.sunwah.baseapp.realm.model.TecDept as u where u.userId="+userId;
		List find = getHibernateTemplate().find(Hql);
		return find;
	}
	
	@Override
	public List<T> getBYHQL(String hql) {
		// TODO Auto-generated method stub
		//String Hql="from com.sunwah.baseapp.realm.model.TecDept as u where u.userId";
		 
		return getHibernateTemplate().find(hql);
	}

	@Override
	public void deleteUserByTecDept(String userid, String classes) {
		// TODO Auto-generated method stub
		final String hql="delete com.sunwah.baseapp.realm.model.TecDept a where a.userId="+userid+"and a.classes='"+classes+"'"; 
		 this.getHibernateTemplate().execute(new HibernateCallback() {   
			    public Object doInHibernate(Session session)   
			      throws HibernateException, SQLException {   
			     return session.createQuery(hql).executeUpdate();   
			    }   
	});
		
	}
	
}
