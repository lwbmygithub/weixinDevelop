<%@page contentType=" text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>应急办微信公众号</title>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" name="viewport" />
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<meta content="telephone=yes" name="format-detection" />
<meta content="email=no" name="format-detection" />
<meta name="keywords" content="应急办微信公众号"  />
<meta name="description" content="应急办微信公众号" />
<script src="../appJs/css3-mediaqueries.js" type="text/javascript" ></script>
<script src="../appJs/html5shiv.js" type="text/javascript" ></script>
<script src="../appJs/selectivizr.js" type="text/javascript" ></script>
<link href="../appCss/weixin_public.css" rel="stylesheet">
<link href="../appCss/login.css" rel="stylesheet">
<script src="../appJs/jquery-1.8.3.min.js" type="text/javascript" ></script>
<script src="../appJs/common.js" type="text/javascript" ></script>
<script src="../weixinJs/jweixin-1.0.0.js" type="text/javascript"></script>

<script type="text/javascript">
      
      var noncestr = "";
      var ticket = "";
      var timestamp = "";
      var url = window.location.href;
      var signature = "";
      
       $.ajax({
             type:"GET",
             url:"./getData.action",
             data:{url:url},
             dataType:"json",
             async:false,
             success: function(data){
                    noncestr = data.noncestr;
                    ticket = data.ticket;
                    timestamp = parseInt(data.timestamp);
                    signature = data.signature;
              }});
           
        
        wx.config({
   			debug: true, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
    		appId: 'wx4f116a6f5e9b40b3', // 必填，公众号的唯一标识
    		timestamp: timestamp , // 必填，生成签名的时间戳
    		nonceStr: noncestr, // 必填，生成签名的随机串
    		signature: signature,// 必填，签名，见附录1
    		jsApiList: ['onMenuShareTimeline'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
		});
       
       wx.ready(function(){
    // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
    
      
    	//	wx.chooseImage({
   		//			 count: 3, // 默认9
    	//			sizeType: 'original',  // 可以指定是原图还是压缩图，默认二者都有
    	//			sourceType: 'album', // 可以指定来源是相册还是相机，默认二者都有
   		//			 success: function (res) {
      //   				var localIds = res.localIds; // 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
         				
     //    				wx.previewImage({
   	//							 current: localIds[1], // 当前显示图片的http链接
   	//							 urls: localIds // 需要预览的图片http链接列表
	//					});
						
	//					wx.uploadImage({
   // 							localId: localIds[0], // 需要上传的图片的本地ID，由chooseImage接口获得
   //								 isShowProgressTips: 1, // 默认为1，显示进度提示
  //  							success: function (res) {
 //       						var serverId = res.serverId; // 返回图片的服务器端ID
        						
//        						wx.downloadImage({
 //   									serverId: serverId, // 需要下载的图片的服务器端ID，由uploadImage接口获得
  //  									isShowProgressTips: 1, // 默认为1，显示进度提示
   // 									success: function (res) {
   //    									var localId = res.localId; // 返回图片下载后的本地ID
  // 									 }
	//							});
   	//							 }
		//				});
    //				}
	//		}); 
	
	
	wx.onMenuShareTimeline({
    title: '分享测试', 
    link: 'http://www.baidu.com', // 分享链接
    imgUrl: 'http://img1.gtimg.com/2016/pics/hv1/175/127/2117/137690485.jpg', // 分享图标
    success: function () { 
        // 用户确认分享后执行的回调函数
        alert("分享成功");
    },
    cancel: function () { 
        // 用户取消分享后执行的回调函数
        alert("分享失败");
    }
});           
			
		
});
        
		function setLogin(){
			var loginName = document.getElementById("login_name");
			var password = document.getElementById("login_pwd");
			loginName.style.width = document.body.clientWidth * 0.9  + "px";
			password.style.width = document.body.clientWidth * 0.9  + "px";
			loginName.style.color = "black";
			password.style.color = "black";	
		}
	
</script>
</head>
<body id="body">
<div class="fullscreen per_login">
<div class="alert"></div>
<header class="header">
	<div class="header_bar">
		 <h1 class="logo"><a href="#">应急办微信公众号</a></h1>
         <div class="per_login" id="per_login">
		     <div class="account">
                 <div class="per_name">
                    <!--   <span id="per_name">注册/登录</span>-->
                    <span id="per_name">获取菜单</span>
                     <i class="arrowIcon"></i>
                 </div>
             </div>
			 <div class="quick_links hide">
			      
             </div>
         </div>
    </div>
</header>
<div class="operate_Bar1 clearfix">
	<div class="text">获取菜单</div>
</div>
<section style="width:100%;">
		  
    <form id="loginform" name="loginform"  action="../servlet/handleServlet" method="get">
        

    <li>
  	  	<input type="text" name="key" placeholder="菜单Key" id="login_name" value="" style="border:1px solid #C9C9C9;height:30px;width:100%;"/>
  	  </li>

	<li class="login_free">
        <input type="checkbox" value="ok" name="m.zidong" id="login_auto" checked="checked"  /><label for="login_auto">30天内自动登录</label>
    </li>
	<li class="submit_btn" style="text-align:center">
		<button type="submit" id="login_btn">获取菜单</button></li>
	<!--  <li class="reg_findPwd">
		<a href="register.html">免费注册</a>
		<a href="getPassword.asp">忘记密码</a>
	</li>-->
    <form>
</section>
<div id="tFooter" class="footer">
	<footer >
		<!--  <div class="footer_t">
			<div class="">
				<div class="user_info">
                    <span id="footUserOffline"><a href="login.html">登录</a><a href="register.html">注册</a></span>
                </div>
				<div class="gotop"><a href="javascript:scroll(0,0)">TOP</a></div>
			</div>
		</div>-->
		<div class="footer_l">
			<a href="#">安卓版</a>
			<span>|</span>
			<a href="#">电脑版</a>
            <span>|</span>
            <a href="#">WAP版</a>
            <span>|</span>
			<a href="#">服务协议</a>
		</div>
		<p class="copyRight">
			<span></span>
			<span> </span>
		</p>
	</footer>
</div>
</div>
</body>
</html> 