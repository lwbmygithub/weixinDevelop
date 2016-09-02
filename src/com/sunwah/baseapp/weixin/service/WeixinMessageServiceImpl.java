package com.sunwah.baseapp.weixin.service;

import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.util.WeixinUtil;

import net.sf.json.JSONObject;

public class WeixinMessageServiceImpl implements WeixinMessageService {

	
	public String SendMessage(String jsonString) {
		// TODO Auto-generated method stub
		 String resultStr = "";  
		String accessToken = WeixinUtil.getToken();
		
		 if (accessToken != null) {  
	            // 调用接口创建菜单  
	            int result = SendMessage(jsonString, accessToken);  
	            // 判断菜单创建结果  
	            if (0 == result) {  
	                resultStr = "消息发送成功";  
	            } else {  
	                resultStr = "消息发送失败，错误码：" + result;   
	            }  
	        }  
		 
	        return resultStr;  
	}
	
	public static int SendMessage(String jsonString, String accessToken){
		int result = 0;
		//拼装群发消息的url
		 String url = UrlConstant.SEND_MESSAGE.replace("ACCESS_TOKEN", accessToken);
		 JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", jsonString);
		 
		 if (null != jsonObject) {  
	            if (0 != jsonObject.getInt("errcode")) {  
	                result = jsonObject.getInt("errcode");  
	            }  
	        }
		 
		 return result;
	}
	
	public static void main(String[] args){
		String jsonString = "{\"filter\":{\"is_to_all\":true },\"text\":{\"content\":\"good morning,every body!!!!!!\"},\"msgtype\":\"text\"}";
	    WeixinMessageServiceImpl messageServiceImpl = new WeixinMessageServiceImpl();
	    String result = messageServiceImpl.SendMessage(jsonString);
	    System.out.println(result);
	}

}
