package com.sunwah.baseapp.weixin.service;

import com.sunwah.baseapp.weixin.dao.ArticleDao;
import com.sunwah.baseapp.weixin.model.ArticleData;

public class ArticleServiceImpl implements ArticleService{

	ArticleDao articleDao;
	
	
	public ArticleDao getArticleDao() {
		return articleDao;
	}



	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}



	@Override
	public ArticleData getArticleById(Integer Id) {
		// TODO Auto-generated method stub
		return this.articleDao.get(Id);
	}

}
