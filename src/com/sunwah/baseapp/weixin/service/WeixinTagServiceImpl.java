package com.sunwah.baseapp.weixin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.util.WeixinUtil;



public class WeixinTagServiceImpl implements WeixinTagService {
	
		private WeixinUserService weixinUserService;
		
	
		public WeixinUserService getWeixinUserService() {
			return weixinUserService;
		}

		public void setWeixinUserService(WeixinUserService weixinUserService) {
			this.weixinUserService = weixinUserService;
		}

	@Override
	public void createTag(String tagName) {
		// TODO Auto-generated method stub
			HashMap<String, String> tagMap = new HashMap<String, String>();
			tagMap.put("name", tagName);
			HashMap<String, Map> indexMap = new HashMap<String, Map>();
			indexMap.put("tag", tagMap);
			JSONObject jsonObject = JSONObject.fromObject(indexMap);
			String jsonString = jsonObject.toString();
			String token = WeixinUtil.getToken();
			String url = UrlConstant.CREATE_TAG.replace("ACCESS_TOKEN", token);
			JSONObject jsonObj = WeixinUtil.httpRequest(url, "POST", jsonString);
			JSONObject tagObj = jsonObj.getJSONObject("tag");
			String id = tagObj.getString("id");
			String name = tagObj.getString("name");
			System.out.println("标签创建成功，id:" + id + "----名称:" + name);
	}
	
	public static void main(String[] args){
		//new WeixinTagServiceImpl().createTag();
		WeixinTagServiceImpl a = new WeixinTagServiceImpl();
		a.setWeixinUserService(new WeixinUserServiceImpl());
	    a.createTag("测试Tag1");
	  
	 //	a.batchUnTag();
		//a.batchTag();
		a.getTag();
	}

	@Override
	public void getTag() {
		// TODO Auto-generated method stub
		String token = WeixinUtil.getToken();
		String url = UrlConstant.GET_TAG.replace("ACCESS_TOKEN", token);
		JSONObject jsonObj = WeixinUtil.httpRequest(url, "GET", null);
		System.out.println(jsonObj.toString());
	}

	@Override
	public void batchTag() {
		// TODO Auto-generated method stub
		List userList = this.getWeixinUserService().getUserList();
		Map data = new HashMap();
		data.put("openid_list", userList);
		data.put("tagid", 100);
		JSONObject obj = JSONObject.fromObject(data);
		String jsonString = obj.toString();
		String token = WeixinUtil.getToken();
		String url = UrlConstant.BATCH_TAG.replace("ACCESS_TOKEN", token);
		JSONObject jsonObj = WeixinUtil.httpRequest(url, "POST", jsonString);
		System.out.println(jsonObj.toString());
	}

	@Override
	public void batchUnTag() {
		// TODO Auto-generated method stub
		List userList = this.getWeixinUserService().getUserList();
		Map data = new HashMap();
		data.put("openid_list", userList);
		data.put("tagid", 101);
		JSONObject obj = JSONObject.fromObject(data);
		String jsonString = obj.toString();
		String token = WeixinUtil.getToken();
		String url = UrlConstant.BATCH_UN_TAG.replace("ACCESS_TOKEN", token);
		JSONObject jsonObj = WeixinUtil.httpRequest(url, "POST", jsonString);
		System.out.println(jsonObj.toString());
	}

}
