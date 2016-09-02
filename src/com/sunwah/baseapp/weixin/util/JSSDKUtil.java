package com.sunwah.baseapp.weixin.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import net.sf.json.JSONObject;

public class JSSDKUtil {
	public static String appID = "wx4f116a6f5e9b40b3";
	public static String GET_TICKET = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
	private String noncestr;
	private String ticket;
	private String timestamp;
	private String url;
    private String signature;
    
    
	
	public String getTicket() {
		return ticket;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getNoncestr() {
		return noncestr;
	}

	public void setNoncestr(String noncestr) {
		this.noncestr = noncestr;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	

	public String getSignature() {
		return signature;
	}

	public String getjsTicket(){
		String token = WeixinUtil.getToken();
		String url = GET_TICKET.replace("ACCESS_TOKEN", token);
		JSONObject obj = WeixinUtil.httpRequest(url, "GET", null);
		String ticket = obj.getString("ticket");
		return ticket;
	}
	
	public void getSignatureAlgorithm(String url){
		  Date date = new Date();
		  long time = date.getTime();

		//mysq 时间戳只有10位 要做处理
		  String timestamp = time + "";
		  timestamp = timestamp.substring(0, 10);
		  String noncestr = "weixinrandomstr";
		  this.setTimestamp(timestamp);
		  this.setNoncestr(noncestr);
		  String ticket = getjsTicket();
		  this.setTicket(ticket);
		  this.setUrl(url);
		  String comboString = "jsapi_ticket=" + ticket +"&noncestr=" + noncestr + "&timestamp=" + timestamp + 
		  										 "&url=" + url;
		  MessageDigest md = null;  
	       String tmpStr = null;  
	  
	        try {  
	            md = MessageDigest.getInstance("SHA-1");  
	            // 将三个参数字符串拼接成一个字符串进行sha1加密  
	            byte[] digest = md.digest(comboString.getBytes());  
	            tmpStr = byteToStr(digest);  
	        } catch (NoSuchAlgorithmException e) {  
	            e.printStackTrace();  
	        }  
		  
		 this.setSignature(tmpStr);
	}
	
	/** 
     * 将字节数组转换为十六进制字符串 
     *  
     * @param byteArray 
     * @return 
     */  
    private static String byteToStr(byte[] byteArray) {  
        String strDigest = "";  
        for (int i = 0; i < byteArray.length; i++) {  
            strDigest += byteToHexStr(byteArray[i]);  
        }  
        return strDigest;  
    }  
  
    /** 
     * 将字节转换为十六进制字符串 
     *  
     * @param mByte 
     * @return 
     */  
    private static String byteToHexStr(byte mByte) {  
        char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };  
        char[] tempArr = new char[2];  
        tempArr[0] = Digit[(mByte >>> 4) & 0X0F];  
        tempArr[1] = Digit[mByte & 0X0F];  
  
        String s = new String(tempArr);  
        return s;  
    }  
	
	public static void main(String[] args){
		JSSDKUtil a = new JSSDKUtil();
		System.out.println(a.getTicket());
		//a.getSignatureAlgorithm();
		System.out.println(a.getSignature());
	}
}
