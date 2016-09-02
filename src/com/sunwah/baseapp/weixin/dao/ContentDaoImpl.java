package com.sunwah.baseapp.weixin.dao;



import com.sunwah.baseapp.dao.GenericDaoImpl;
import com.sunwah.baseapp.weixin.model.Content;


public  class ContentDaoImpl extends GenericDaoImpl<Content, Integer> implements ContentDao {

	public ContentDaoImpl() {
		super(Content.class);
		// TODO Auto-generated constructor stub
	}

}
