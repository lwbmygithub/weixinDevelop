package com.sunwah.baseapp.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sunwah.baseapp.dao.GenericDao;

public class GenericManagerImpl<T, PK extends Serializable> implements
		GenericManager<T, PK> {
	protected final Log log = LogFactory.getLog(getClass());

	protected GenericDao<T, PK> genericDao;

	public GenericManagerImpl(final GenericDao<T, PK> genericDao) {
		this.genericDao = genericDao;
	}

	public List<T> getAll() {
		return genericDao.getAll();
	}

	public T get(PK id) {
		return genericDao.get(id);
	}

	public boolean exists(PK id) {
		return genericDao.exists(id);
	}

	public T save(T object) {
		return genericDao.save(object);
	}
	
	public T merge(T object) {
		return genericDao.merge(object);
	}

	public void saveOrUpdate(T object) {
		genericDao.saveOrUpdate(object);
	}
	
	public void saveOrUpdateAll(Collection<T> collections){
		genericDao.saveOrUpdateAll(collections);
	}
	public void removeAll(Collection<T> collections){
		genericDao.removeAll(collections);
	}
	
	public void update(T object) {
		genericDao.update(object);
	}

	public void remove(PK id) {
		genericDao.remove(id);
	}
	
	@Override
	public List<T> findByProperty(String propertyName, String value) {
		return genericDao.findByProperty(propertyName, value);
	}

	@Override
	public List<T> findByProperty(String propertyName, Object value) {
		return genericDao.findByProperty(propertyName, value);
	}

	@Override
	public List<T> findByNamedParam(String queryString,
			Map<String, Object> queryParams) {
		return genericDao.findByNamedParam(queryString, queryParams);
	}

}
