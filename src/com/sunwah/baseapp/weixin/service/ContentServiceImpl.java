package com.sunwah.baseapp.weixin.service;

import java.util.List;

import com.sunwah.baseapp.weixin.dao.ContentDao;
import com.sunwah.baseapp.weixin.model.Content;

public class ContentServiceImpl implements ContentService{
	
	ContentDao contentDao;
	
	
	
	public ContentDao getContentDao() {
		return contentDao;
	}



	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}



	@Override
	public List<Content> getContentByCont(String content) {
		// TODO Auto-generated method stub
		return this.contentDao.findByProperty("content", content);
	}

}
