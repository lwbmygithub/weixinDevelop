/**
 * 
 */
package com.sunwah.baseapp.service;

import java.util.List;

/**
 * 查询返回结果
 * 
 * @author MARK
 * 
 */
public class QueryResult {
	// 查询返回记录
	private List results;
	// 总页数
	private int maxPage;

	public List getResults() {
		return results;
	}

	public void setResults(List results) {
		this.results = results;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
}
