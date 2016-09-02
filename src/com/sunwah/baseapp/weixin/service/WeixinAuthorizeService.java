package com.sunwah.baseapp.weixin.service;

import net.sf.json.JSONObject;

public interface WeixinAuthorizeService {
		JSONObject codeToAccessToken(String code);
		JSONObject getUserInfo(String accessToken, String openId);
}
