package com.sunwah.baseapp.weixin.service;

import java.util.List;

import com.sunwah.baseapp.weixin.model.Menu;



public interface MenuService {
     Menu getMenu(String key);
     List<Menu> getAllMenu();
     List<Menu> getMenuByOpenId(String openId);
}
