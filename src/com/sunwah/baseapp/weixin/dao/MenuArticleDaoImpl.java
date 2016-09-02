package com.sunwah.baseapp.weixin.dao;


import com.sunwah.baseapp.dao.GenericDaoImpl;
import com.sunwah.baseapp.weixin.model.MenuArticle;

public  class MenuArticleDaoImpl extends GenericDaoImpl<MenuArticle, Integer> implements MenuArticleDao {

	public MenuArticleDaoImpl() {
		super(MenuArticle.class);
		// TODO Auto-generated constructor stub
	}

}
