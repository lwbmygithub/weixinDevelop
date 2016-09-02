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

<script type="text/javascript">
		function setLogin(){
			var loginName = document.getElementById("login_name");
			var password = document.getElementById("login_pwd");
			loginName.style.width = document.body.clientWidth * 0.9  + "px";
			password.style.width = document.body.clientWidth * 0.9  + "px";
			loginName.style.color = "black";
			password.style.color = "black";	
		}
		
		
	
</script>
     <script>

// 当微信内置浏览器完成内部初始化后会触发WeixinJSBridgeReady事件。
document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
	//公众号支付
	jQuery('a#getBrandWCPayRequest').click(function(e){
		WeixinJSBridge.invoke('getBrandWCPayRequest',{
			"appId" : "wx2b029c08a6232582", 	 //公众号名称，由商户传入
			"timeStamp":"1472610932",//时间戳，自1970年以来的秒数
			"nonceStr" : "8nR929JKyT5ar2tf",//随机串
			"package" : "prepay_id=wx201608311035328c31686d330139973400",
			"signType" : "MD5",//微信签名方式:
			"paySign" : "2E65EE25F49CFCFA23D5F1C0C1F62A80"   //微信签名
		},function(res){
			if(res.err_msg == "get_brand_wcpay_request:ok" ) {}
			// 使用以上方式判断前端返回,微信团队郑重提示：res.err_msg将在用户支付成功后返回	ok，但并不保证它绝对可靠。
				alert(res.err_msg); 
			}); 
		});
	}, false);
</script>
</head>
<body id="body" onload="setLogin();" onresize="setLogin();">
<div class="fullscreen per_login">
<div class="alert"></div>
<header class="header">
	<div class="header_bar">
		 <h1 class="logo"><a href="#">应急办微信公众号</a></h1>
         <div class="per_login" id="per_login">
		     <div class="account">
                 <div class="per_name">
                    <!--   <span id="per_name">注册/登录</span>-->
                    <span id="per_name"></span>
                     <i class="arrowIcon"></i>
                 </div>
             </div>
			 <div class="quick_links hide">
			      
             </div>
         </div>
    </div>
</header>
<div class="operate_Bar1 clearfix">
	<div class="text"></div>
	<a class=​"btn-green" id=​"getBrandWCPayRequest" href=​"javascript:​void(0)​;​">​立即购买​</a>​
</div>
<section style="width:100%;">
		  
    
        

    <li>
  	  	
  	  </li>

	<li class="login_free">
       
    </li>

	<!--  <li class="reg_findPwd">
		<a href="register.html">免费注册</a>
		<a href="getPassword.asp">忘记密码</a>
	</li>-->
    
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