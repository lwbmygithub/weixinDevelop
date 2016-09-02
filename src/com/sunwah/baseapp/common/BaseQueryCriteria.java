package com.sunwah.baseapp.common;

import java.io.Serializable;

/**
 * 用于单条件查询
 * @author weico
 *  
 */

public class BaseQueryCriteria<PK extends Serializable> implements QueryCriteria {
	private PK parameters;

	public PK getParameters() {
		return parameters;
	}

	public void setParameters(PK parameters) {
		this.parameters = parameters;
	}


}
