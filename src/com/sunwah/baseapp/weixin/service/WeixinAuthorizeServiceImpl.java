package com.sunwah.baseapp.weixin.service;

import com.sunwah.baseapp.weixin.constant.Constant;
import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.util.WeixinUtil;

import net.sf.json.JSONObject;

public class WeixinAuthorizeServiceImpl implements WeixinAuthorizeService {

	@Override
	public JSONObject codeToAccessToken(String code) {
		// TODO Auto-generated method stub
		String url_temp1 = UrlConstant.CODE_ACCESS_TOKEN.replace("APPID", Constant.APPID);
		String url_temp2 = url_temp1.replace("SECRET", Constant.APPSECRET);
		String url = url_temp2.replace("CODE", code);
		return WeixinUtil.httpRequest(url, "GET", null);
	}

	@Override
	public JSONObject getUserInfo(String accessToken, String openId) {
		// TODO Auto-generated method stub
		String url_temp1 = UrlConstant.AUTH_GET_USER_INFO.replace("ACCESS_TOKEN", accessToken);
		String url = url_temp1.replace("OPENID", openId);
		return WeixinUtil.httpRequest(url, "GET", null);
	}

}
