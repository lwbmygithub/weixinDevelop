package com.sunwah.baseapp.weixin.service;

import java.util.List;

import com.sunwah.baseapp.weixin.model.MenuContent;

public interface MenuContentService {
		List<MenuContent> getContentByCont(String content);
}	
