package com.sunwah.baseapp.weixin.dao;


import com.sunwah.baseapp.dao.GenericDaoImpl;
import com.sunwah.baseapp.weixin.model.MenuContent;

public class MenuContentDaoImpl extends GenericDaoImpl<MenuContent, Integer> implements MenuContentDao {

	public MenuContentDaoImpl() {
		super(MenuContent.class);
		// TODO Auto-generated constructor stub
	}

}
