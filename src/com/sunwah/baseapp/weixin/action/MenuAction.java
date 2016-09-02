package com.sunwah.baseapp.weixin.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.struts2.interceptor.RequestAware;


import com.opensymphony.xwork2.ActionSupport;
import com.sunwah.baseapp.weixin.model.Menu;
import com.sunwah.baseapp.weixin.service.MenuService;
import com.sunwah.baseapp.weixin.service.WeixinMenuService;



public class MenuAction extends ActionSupport implements RequestAware {

	private Map request;
	private MenuService menuService;
	private Menu menu;
	private String key;
	private WeixinMenuService weixinMenuService;
	
	
	public WeixinMenuService getWeixinMenuService() {
		return weixinMenuService;
	}

	public void setWeixinMenuService(WeixinMenuService weixinMenuService) {
		this.weixinMenuService = weixinMenuService;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	@Override
	public void setRequest(Map request) {
		// TODO Auto-generated method stub
		this.request = request;
	}
	
	public String getOneMenu(){
		menu = this.menuService.getMenu(key);
		return "success";
	}
	
	public String createMenu(){
		return this.getWeixinMenuService().CreateMenu();
	}
	
	public String createPersonalMenu(){
		return this.getWeixinMenuService().CreatePersonalMenu();
	}

}
		

