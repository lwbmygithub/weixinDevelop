package com.sunwah.baseapp.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface GenericDao<T, PK extends Serializable> {
	/**
	 * 获取所有数据(包含重复数据)
	 * 
	 * @return
	 */
	List<T> getAll();

	/**
	 * 获取所有数据(不包含重复数据)
	 * 
	 * @return
	 */
	List<T> getAllDistinct();

	/**
	 * 按主键查询
	 * 
	 * @param id
	 *            主键值
	 * @return
	 */
	T get(PK id);

	boolean exists(PK id);

	/**
	 * 创建
	 * 
	 * @param object
	 * @return
	 */
	T save(T object);

	/**
	 * 更新
	 * 
	 * @param object
	 * @return
	 */
	T merge(T object);
	
	/**
	 * 更新
	 * 
	 * @param object
	 * @return
	 */
	void update(T object);

	/**
	 * 创建或更新
	 * 
	 * @param object
	 * @return
	 */
	void saveOrUpdate(T object);
	
	/**
	 * 批量创建或更新
	 * 
	 * @param object
	 * @return
	 */
	void saveOrUpdateAll(Collection<T> collections);
	
	/**
	 * 批量删除
	 * 
	 * @param object
	 * @return
	 */
	void removeAll(Collection<T> collections);
	
	/**
	 * 按主键删除
	 * 
	 * @param id
	 *            主键值
	 */
	void remove(PK id);

	/**
	 * 条件查询
	 * 
	 * @param queryName
	 *            HQL语句在映射文件中的ID
	 * @param queryParams
	 *            查询条件
	 * @return
	 */
	List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams);

	/**
	 * 条件查询
	 * 
	 * @param queryString
	 *            查询HQL
	 * @param queryParams
	 *            查询条件
	 * @return
	 */
	List<T> findByNamedParam(String queryString, Map<String, Object> queryParams);

	/**
	 * 根据单个字段值查询
	 * 
	 * @param propertyName
	 *            字段名称
	 * @param value
	 *            字段值
	 * @return
	 */
	List<T> findByProperty(String propertyName, Object value);
	List<T> findByProperty(String propertyName, String value);
	
	void deleteObject(Object ob);
	
	void deleteObjectByString(String userid,String loginname);
	void deleteUserByTecDept(String userid,String classes);

	void deleteObjectByString(String contentid);
	
	List getClasses(String depId);
	public void deleteObjectByDip(String dId);

	public List<T> getBYHQL(String hql);


}