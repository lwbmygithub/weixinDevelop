package com.sunwah.baseapp.weixin.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;
import com.sunwah.baseapp.weixin.constant.Constant;
import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.util.WeixinUtil;

public class WeixinQrCodeServiceImpl implements WeixinQrCodeService {

	@Override
	public JSONObject createQrLimitScene() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JSONObject createQrScene(int exSeconds, int sceneId) {
		// TODO Auto-generated method stub
		//生成POST JSON数据
		JSONObject object = new JSONObject();
		object.put("expire_seconds", exSeconds);
		object.put("action_name", Constant.QR_SECEN);
		Map<String, Integer> sceneIdMap = new HashMap<String, Integer>();
		sceneIdMap.put("scene_id", sceneId);
		Map<String, Map<String, Integer>> sceneMap = new HashMap<String, Map<String, Integer>>();
	    sceneMap.put("scene", sceneIdMap);
	    object.put("action_info", sceneMap);
	    //获取access_token
	    String accessToken = WeixinUtil.getToken();
	    //获取url
	    String url = UrlConstant.CREATE_QR_CODE.replace("ACCESS_TOKEN", accessToken);
	    JSONObject resultObject = WeixinUtil.httpRequest(url, "POST", object.toString());
	    return resultObject;
	}

	public static void main(String[] args){
		WeixinQrCodeServiceImpl a =  new WeixinQrCodeServiceImpl();
		JSONObject result = a.createQrScene(120, 23);
		System.out.println(result);
		String ticket = result.getString("ticket");
		a.showQrCode(ticket);
	}

	@Override
	public void showQrCode(String ticket) {
		// TODO Auto-generated method stub
		String url = UrlConstant.SHOW_QR_CODE.replace("TICKET", ticket);
		WeixinUtil.httpRequestGetMedia(url, null);
	}
}
