/**
 * 
 */
package com.sunwah.baseapp.service;

import java.util.List;

import com.sunwah.baseapp.common.QueryCriteria;

/**
 * @author MARK
 * 
 */
public interface QueryManager {
	/**
	 * 分页查询
	 * 
	 * @param queryNameForList
	 *            查询列表语句名称
	 * @param queryNameForCount
	 *            查询总记录数语句名称
	 * @param startingIndex
	 *            查询起始位置
	 * @param pageSize
	 *            每页最大记录数
	 * @param criteria
	 *            查询条件
	 * @return
	 */
	QueryResult query(String queryNameForList, String queryNameForCount,
			int startingIndex, int pageSize, QueryCriteria criteria);
	
	QueryResult query(String queryNameForList,QueryCriteria criteria);
	/**
	 * 无条件查询
	 * 
	 * @param queryName
	 *            查询语句名称
	 * @return
	 */
	List queryForList(String queryName);

	/**
	 * 条件查询
	 * 
	 * @param queryName
	 *            查询语句名称
	 * @param criteria
	 *            查询条件
	 * @return
	 */
	List queryForList(String queryName, QueryCriteria criteria);

	
	QueryResult queryByLimit(String queryNameForList, String queryNameForCount,
			int startingIndex, int pageSize, QueryCriteria criteria);
	QueryResult queryByLimitBySize(String queryNameForList, String queryNameForCount,
			int startingIndex, int pageSize, QueryCriteria criteria);
	int InserForInt(String queryName, QueryCriteria criteria);

	int updateForInt(String queryName, QueryCriteria criteria);
}
