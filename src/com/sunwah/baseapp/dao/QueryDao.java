/**
 * 
 */
package com.sunwah.baseapp.dao;

import java.util.List;

import com.sunwah.baseapp.common.QueryCriteria;

/**
 * 
 * 使用IBATIS实现查询DAO类
 * 
 * @author MARK
 * 
 */
public interface QueryDao {
	/**
	 * 分页查询
	 * 
	 * @param queryName
	 *            查询语句名称
	 * @param startingIndex
	 *            查询起始记录
	 * @param pageSize
	 *            页面最大记录
	 * @param criteria
	 *            查询条件
	 * @return
	 */
	List queryForList(String queryName, int startingIndex, int pageSize,
			QueryCriteria criteria);

	/**
	 * 获取记录总数
	 * 
	 * @param queryName
	 *            查询语句名称
	 * @param criteria
	 *            查询条件
	 * @return
	 */
	int queryForCount(String queryName, QueryCriteria criteria);
	

	/**
	 * 无条件查询
	 * 
	 * @param queryName
	 *            查询语句名称
	 * @return
	 */
	List queryForList(String queryName);

	/**
	 * 有条件查询
	 * 
	 * @param queryName
	 *            查询语句名称
	 * @param criteria
	 *            查询条件
	 * @return
	 */
	List queryForList(String queryName, QueryCriteria criteria);

	

	int InserForInt(String queryName, QueryCriteria criteria);

	int updateForInt(String queryName, QueryCriteria criteria);
	
	//List queryForList(String queryName, QueryCriteria criteria);
}
