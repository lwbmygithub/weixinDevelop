package com.sunwah.baseapp.weixin.service;

import net.sf.json.JSONObject;

import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.util.WeixinUtil;

public class WeixinMediaServiceImpl implements WeixinMediaService {

	@Override
	public void getMedia(String mediaId) {
		// TODO Auto-generated method stub
		String token = WeixinUtil.getToken();
		String url_temp = UrlConstant.GET_MEDIA.replace("ACCESS_TOKEN", token);
		String url = url_temp.replace("MEDIA_ID", mediaId);
		WeixinUtil.httpRequestGetMedia(url, null);
	}
	
	public static  void main(String[] args){
		WeixinMediaServiceImpl a = new WeixinMediaServiceImpl();
		a.getMedia("wbKdqV4jDJev7QYqff4jl2_eLd9LikY11bNCE7z4h9qK3NGNsCgwLOrT1P5gjOQl");
	}

}
