package com.sunwah.baseapp.weixin.service;

import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONObject;

import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.util.WeixinUtil;

public class WeixinUserServiceImpl implements WeixinUserService {


	@Override
	public List getUserList() {
		// TODO Auto-generated method stub
		String token = WeixinUtil.getToken();
		String url = UrlConstant.GET_USER.replace("ACCESS_TOKEN", token);
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "GET", null);
		JSONObject data = (JSONObject)jsonObject.get("data");
		List<String> userList = (List)data.get("openid");
		return userList;
	}

	public static void main(String[] args) {
		new WeixinUserServiceImpl().getUserList();
	}

}
