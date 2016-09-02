/**
 * 
 */
package com.sunwah.baseapp.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.sunwah.baseapp.common.QueryCriteria;

/**
 * @author MARK
 * 
 */
public class TestLogin extends SqlMapClientDaoSupport implements QueryDao {

	
	@Override
	public List queryForList(String queryName, QueryCriteria criteria) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		return this.getSqlMapClientTemplate().queryForList(queryName, map);
	}
	
	@Override
	public List queryForList(String queryName) {
		return this.getSqlMapClientTemplate().queryForList(queryName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunwah.baseapp.dao.QueryDao#queryForCount(java.lang.String,
	 * com.sunwah.baseapp.common.QueryCriteria)
	 */
	@Override
	public int queryForCount(String queryName, QueryCriteria criteria) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("criteria", criteria);
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				queryName, map);
		return count.intValue();
	}

	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunwah.baseapp.dao.QueryDao#queryForList(java.lang.String, int,
	 * int, com.sunwah.baseapp.common.QueryCriteria)
	 */
	@Override
	public List queryForList(String queryName, int startingIndex, int pageSize,
			QueryCriteria criteria) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pageSize", new Integer(pageSize + startingIndex));
		map.put("criteria", criteria);
		List results = getSqlMapClientTemplate().queryForList(queryName, map,
				startingIndex, pageSize);
		return results;
	}

	@Override
	public int InserForInt(String queryName, QueryCriteria criteria) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateForInt(String queryName, QueryCriteria criteria) {
		// TODO Auto-generated method stub
		return 0;
	}
}
