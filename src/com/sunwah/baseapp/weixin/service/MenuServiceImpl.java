package com.sunwah.baseapp.weixin.service;

import java.util.List;

import com.sunwah.baseapp.weixin.dao.MenuDaoImpl;
import com.sunwah.baseapp.weixin.model.Menu;

public class MenuServiceImpl implements MenuService {
	private MenuDaoImpl menuDao;
	
	
	public MenuDaoImpl getMenuDao() {
		return menuDao;
	}


	public void setMenuDao(MenuDaoImpl menuDao) {
		this.menuDao = menuDao;
	}


	@Override
	public Menu getMenu(String key) {
		// TODO Auto-generated method stub
		return this.menuDao.get(key);
	}


	@Override
	public List<Menu> getAllMenu() {
		// TODO Auto-generated method stub
		return this.menuDao.getAll();
	}


	@Override
	public List<Menu> getMenuByOpenId(String openId) {
		// TODO Auto-generated method stub
		return this.menuDao.findByProperty("openId", openId);
	}

}
