package com.sunwah.baseapp.weixin.constant;

public interface Constant {

	/**
	 *  appID
	 */
	public static String APPID = "wx4f116a6f5e9b40b3";
	
	/**
	 *  appSecret
	 */
	public static String APPSECRET = "b03bf575089ab9c8090ee4ae6bfb00f5";
	
	/**
	 *   token
	 */
	public static String TOKEN = "lwbweixintest111";
	
	/**
	 *  回应消息类型：文本消息
	 */
	public static String RESP_MESSAGE_TYPE_TEXT = "text";
	
	/**
	 *  请求消息类型：文本消息
	 */
	public static String REQ_MESSAGE_TYPE_TEXT = "text";
	
	/**
	 *  回应消息类型：新闻消息
	 */
	public static String RESP_MESSAGE_TYPE_NEWS = "news";
	
	/** 
     * 请求消息类型：事件 
     */  
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";  
  
    /** 
     * 事件类型：subscribe(关注) 
     */  
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";  
  
    /** 
     * 事件类型：unsubscribe(取消关注) 
     */  
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";  
  
    /** 
     * 事件类型：CLICK(自定义菜单点击事件) 
     */  
    public static final String EVENT_TYPE_CLICK = "CLICK";  
    
    /**
     *  没有找到服务时的回复内容
     */
     public static final String  INDEX_RESP_CONTENT = "没有找到对应的服务";
     
     /**
      *  临时二维码请求
      */
     public static final String QR_SECEN = "QR_SCENE";
     
     /**
      *  永久二维码请求
      */
     public static final String QR_LIMIT_SCENE = "QR_LIMIT_SCENE";
}
