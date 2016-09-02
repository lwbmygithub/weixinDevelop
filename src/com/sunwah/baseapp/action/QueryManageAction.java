/**
 * 
 */
package com.sunwah.baseapp.action;


import com.sunwah.baseapp.common.Constants;
import com.sunwah.baseapp.common.QueryCriteria;
import com.sunwah.baseapp.service.QueryManager;
import com.sunwah.baseapp.service.QueryResult;

/**
 * 分页查询Action类
 * 
 * @author MARK
 * 
 */
public class QueryManageAction extends AuthorizationControlAction {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 8823085600418387139L;

	// 查询服务接口
	private QueryManager queryManager;
	// 查询结果对象
	private QueryResult queryResult;
	// 当前页数
	private int currentPage = 1;

	/**
	 * 给查询结果对象赋值
	 * 
	 * @param queryNameForList 查询列表语句名称
	 * @param queryNameForCount 查询总记录数语句名称
	 * @param queryCriteria
	 *            查询条件
	 */
	protected void query(String queryNameForList, String queryNameForCount,
			QueryCriteria queryCriteria) {
		queryResult = this.queryManager.query(queryNameForList,
				queryNameForCount, (currentPage - 1) * Constants.PAGE_SIZE,
				Constants.PAGE_SIZE, queryCriteria);
	}
	protected void queryLimit(String queryNameForList, String queryNameForCount,
			QueryCriteria queryCriteria) {
		queryResult = this.queryManager.queryByLimit(queryNameForList,
				queryNameForCount, (currentPage - 1) * Constants.PAGE_SIZE,
				Constants.PAGE_SIZE, queryCriteria);
	}
	protected void queryLimitBySize(String queryNameForList, String queryNameForCount,int size,
			QueryCriteria queryCriteria) {
		queryResult = this.queryManager.queryByLimitBySize(queryNameForList,
				queryNameForCount, (currentPage - 1) * size,
				size, queryCriteria);
	}
	
	protected void queryForResult(String queryNameForList, String queryNameForCount,
			int startingIndex, int pageSize, QueryCriteria criteria) {
		queryResult = this.queryManager.query(queryNameForList,
				queryNameForCount, startingIndex,
				pageSize, criteria);
	}
	protected void query(String queryNameForList,
			QueryCriteria queryCriteria) {
		queryResult = this.queryManager.query(queryNameForList,
				queryCriteria);
	}
	
	protected int inser(String queryNameForList,
			QueryCriteria queryCriteria) {
		Integer count = this.queryManager.InserForInt(queryNameForList,
				queryCriteria);
		return count.intValue();
	}
	
	protected int update(String queryNameForList,
			QueryCriteria queryCriteria) {
		Integer count = this.queryManager.updateForInt(queryNameForList,
				queryCriteria);
		return count.intValue();
	}

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setQueryManager(QueryManager queryManager) {
		this.queryManager = queryManager;
	}

	public QueryManager getQueryManager() {
		return queryManager;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

}
