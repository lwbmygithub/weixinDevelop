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