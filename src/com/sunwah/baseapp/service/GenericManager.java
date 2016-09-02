package com.sunwah.baseapp.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface GenericManager<T, PK extends Serializable> {
	List<T> getAll();

	T get(PK id);

	boolean exists(PK id);

	T save(T object);

	void saveOrUpdate(T object);
	
	void saveOrUpdateAll(Collection<T> collections);//Mazole2011-3-24
	
	void removeAll(Collection<T> collections);//Mazole2011-3-24
	void update(T object);

	T merge(T object);

	void remove(PK id);

	/**
	 * 根据单个字段值查询
	 * 
	 * @param propertyName
	 *            字段名称
	 * @param value
	 *            字段值
	 * @return
	 */
	List<T> findByProperty(String propertyName, String value);
	List<T> findByProperty(String propertyName, Object value);

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
}
