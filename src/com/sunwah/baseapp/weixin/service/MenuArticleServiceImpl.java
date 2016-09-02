package com.sunwah.baseapp.weixin.service;

import com.sunwah.baseapp.weixin.dao.MenuArticleDao;
import com.sunwah.baseapp.weixin.model.MenuArticle;

public class MenuArticleServiceImpl implements MenuArticleService{

	MenuArticleDao menuArticleDao;
	
	



	public MenuArticleDao getMenuArticleDao() {
		return menuArticleDao;
	}





	public void setMenuArticleDao(MenuArticleDao menuArticleDao) {
		this.menuArticleDao = menuArticleDao;
	}





	@Override
	public MenuArticle getArticleById(Integer Id) {
		// TODO Auto-generated method stub
		return this.menuArticleDao.get(Id);
	}

}
