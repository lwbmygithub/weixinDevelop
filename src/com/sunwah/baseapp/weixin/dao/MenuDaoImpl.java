package com.sunwah.baseapp.weixin.dao;



import com.sunwah.baseapp.dao.GenericDaoImpl;
import com.sunwah.baseapp.weixin.model.Menu;

public class MenuDaoImpl extends GenericDaoImpl<Menu, String> implements MenuDao {

	public MenuDaoImpl() {
		super(Menu.class);
		// TODO Auto-generated constructor stub
	}

}
