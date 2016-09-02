package com.sunwah.baseapp.weixin.dao;


import com.sunwah.baseapp.dao.GenericDaoImpl;
import com.sunwah.baseapp.weixin.model.ArticleData;

public class ArticleDaoImpl extends GenericDaoImpl<ArticleData, Integer> implements ArticleDao {

	public ArticleDaoImpl() {
		super(ArticleData.class);
		// TODO Auto-generated constructor stub
	}

}
