/**
 * 
 */
package com.sunwah.baseapp.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sunwah.baseapp.common.QueryCriteria;
import com.sunwah.baseapp.dao.QueryDao;

/**
 * @author MARK
 * 
 */
public class QueryManagerImpl implements QueryManager {
	private final Log log = LogFactory.getLog(getClass());
	private QueryDao queryDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunwah.baseapp.service.QueryManager#query(java.lang.String,
	 * java.lang.String, int, int, com.sunwah.baseapp.common.QueryCriteria)
	 */
	@Override
	public QueryResult query(String queryNameForList, String queryNameForCount,
			int startingIndex, int pageSize, QueryCriteria criteria) {
		QueryResult queryResult = new QueryResult();
		queryResult.setResults(queryDao.queryForList(queryNameForList,
				startingIndex, pageSize, criteria));
		//criteria.
		int size = queryDao.queryForCount(queryNameForCount, criteria);
		int maxPage = size % pageSize != 0 ? size / pageSize + 1 : size
				/ pageSize;
		queryResult.setMaxPage(maxPage);
		log.debug("size:" + size);
		log.debug("maxPage:" + maxPage);
		return queryResult;
	}
	@Override
	public QueryResult queryByLimit(String queryNameForList, String queryNameForCount,
			int startingIndex, int pageSize, QueryCriteria criteria) {
		QueryResult queryResult = new QueryResult();
		queryResult.setResults(queryDao.queryForList(queryNameForList, criteria));
		//criteria.
		int size = queryDao.queryForCount(queryNameForCount, criteria);
		int maxPage = size % pageSize != 0 ? size / pageSize + 1 : size
				/ pageSize;
		queryResult.setMaxPage(maxPage);
		log.debug("size:" + size);
		log.debug("maxPage:" + maxPage);
		return queryResult;
	}
	
	@Override
	public QueryResult query(String queryNameForList,QueryCriteria criteria) {
		QueryResult queryResult = new QueryResult();
		queryResult.setResults(queryDao.queryForList(queryNameForList,criteria));
		return queryResult;
	}
	
	@Override
	public List queryForList(String queryName, QueryCriteria criteria) {
		return this.queryDao.queryForList(queryName, criteria);
	}

	@Override
	public List queryForList(String queryName) {
		return this.queryDao.queryForList(queryName);
	}
	
	@Override
	public int InserForInt(String queryName, QueryCriteria criteria) {
		Integer count = this.queryDao.InserForInt(queryName, criteria);
		return count.intValue();
	}
	
	
	@Override
	public int updateForInt(String queryName, QueryCriteria criteria) {
		Integer count = this.queryDao.updateForInt(queryName, criteria);
		return count.intValue();
	}
	

	public void setQueryDao(QueryDao queryDao) {
		this.queryDao = queryDao;
	}
	@Override
	public QueryResult queryByLimitBySize(String queryNameForList,
			String queryNameForCount, int startingIndex, int pageSize,
			QueryCriteria criteria) {
		QueryResult queryResult = new QueryResult();
		queryResult.setResults(queryDao.queryForList(queryNameForList, criteria));
		//criteria.
		int size = queryDao.queryForCount(queryNameForCount, criteria);
		int maxPage = size % pageSize != 0 ? size / pageSize + 1 : size
				/ pageSize;
		queryResult.setMaxPage(maxPage);
		log.debug("size:" + size);
		log.debug("maxPage:" + maxPage);
		return queryResult;
	}
}
