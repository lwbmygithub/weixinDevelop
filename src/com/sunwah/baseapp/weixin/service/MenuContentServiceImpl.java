package com.sunwah.baseapp.weixin.service;

import java.util.List;

import com.sunwah.baseapp.weixin.dao.MenuContentDao;
import com.sunwah.baseapp.weixin.model.MenuContent;

public class MenuContentServiceImpl implements MenuContentService{
	
	MenuContentDao menuContentDao;
	

	public MenuContentDao getMenuContentDao() {
		return menuContentDao;
	}


	public void setMenuContentDao(MenuContentDao menuContentDao) {
		this.menuContentDao = menuContentDao;
	}


	@Override
	public List<MenuContent> getContentByCont(String content) {
		// TODO Auto-generated method stub
		return this.menuContentDao.findByProperty("menuKey", content);
	}

}
