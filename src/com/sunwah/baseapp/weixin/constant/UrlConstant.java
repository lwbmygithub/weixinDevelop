package com.sunwah.baseapp.weixin.constant;

public interface UrlConstant {
	
	//创建菜单
	public static String MENU_CREATE = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
	//删除菜单
	public static String MENU_DELETE = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	//创建个性化菜单
	public static String MENU_PERSONAL_CREATE = "https://api.weixin.qq.com/cgi-bin/menu/addconditional?access_token=ACCESS_TOKEN";
	//群发消息
	public static String SEND_MESSAGE = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
	//创建标签
	public static String CREATE_TAG = "https://api.weixin.qq.com/cgi-bin/tags/create?access_token=ACCESS_TOKEN";
	//获取已创建标签
	public static String GET_TAG = "https://api.weixin.qq.com/cgi-bin/tags/get?access_token=ACCESS_TOKEN";
	//批量为用户打标签
	public static String BATCH_TAG = "https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging?access_token=ACCESS_TOKEN";
	//批量为用户取消标签
	public static String BATCH_UN_TAG = "https://api.weixin.qq.com/cgi-bin/tags/members/batchuntagging?access_token=ACCESS_TOKEN";
	//获取用户列表
	public static String GET_USER = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";
	//获取临时素材
	public static String GET_MEDIA = "https://api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";
    //网页授权 用code换取网页授权access_token
	public static String CODE_ACCESS_TOKEN = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
	//网页授权 拉取用户信息
	public static String AUTH_GET_USER_INFO = " https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    //临时二维码请求
	public static String CREATE_QR_CODE = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=ACCESS_TOKEN";
    //获取二维码图片
	public static String SHOW_QR_CODE = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=TICKET";
   //接口调用次数清零操作
	public static String CLEAR_QUOTA = "https://api.weixin.qq.com/cgi-bin/clear_quota?access_token=ACCESS_TOKEN";
}
