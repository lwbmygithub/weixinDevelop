<%@page contentType=" text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>广州市12345</title>
<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, minimal-ui">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta content="telephone=no" name="format-detection">
<link type="text/css" rel="stylesheet" rev="stylesheet" href="../appCss/gzwx.css">
<script type="text/javascript" src="../appJs/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script type="text/javascript" src="../appJs/gzCommon.js"></script>
<script type="text/javascript" src="../appJs/ajaxfileupload.js"></script>
<script type="text/javascript" src="../appJs/appeal.js" charset="gb2312"></script>
<script charset="utf-8" src="http://map.qq.com/api/js?v=2.exp&amp;key=FS3BZ-HINRP-6ATDT-VUGNZ-NVJU5-2EFVN&amp;libraries=convertor"></script><script src="http://open.map.qq.com/c/=/apifiles/2/4/20/main.js,apifiles/2/4/20/mods/convertor.js" type="text/javascript"></script>

<style type="text/css">@media screen{.smnoscreen {display:none}} @media print{.smnoprint{display:none}}</style></head>

<body onload="initMap();">
<header class="bar bar-nav"><h1 class="title3">求助/投诉/举报问题</h1></header>
<div class="content">
    <div class="mbz10">
        <form class="input-group2" method="post" id="form0"  action="./handleSubmit.action"  enctype="multipart/form-data">
      
          
      
          <div><label><span class="star">*</span>事发地址</label><span class="alit">(注：如定位的地址不属于事发地址，请作出修改)</span></div>
          <input type="text" id="requestArea2" name="requestArea2" placeholder="请选择或输入地址" style="background-color: #FFFFFF;" onchange="codeAddress()">
          <div id="mapDiv" style="width: 100%; height: 200px; position: relative; margin: 0px 0px 20px; border: 1px solid rgb(221, 221, 221); overflow: hidden; -webkit-transform: translateZ(0px); background-color: rgb(229, 227, 223);"><div style="position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;"><div n="targetElement" style="position: absolute; left: 0px; top: 0px; overflow: hidden; width: 100%; height: 100%; z-index: 0;"><div n="moveElement" style="position: absolute; left: 0px; top: 0px; z-index: 1; transform-origin: 168px 99px 0px; transform: matrix(1, 0, 0, 1, -227, -106);"><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 200;"><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 101;"></div></div><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 201;"><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 102;"><div style="position: absolute; left: 377px; top: 171px; width: 50px; height: 39px; border: 0px none; overflow: hidden; z-index: 0; cursor: default;"><img draggable="false" class="csssprite" dn="2" style="position: absolute; border: 0px; padding: 0px; margin: 0px; top: 0px; left: -24px; -webkit-user-select: none; width: 73px; height: 39px; min-width: 73px; max-width: 73px; min-height: 39px; max-height: 39px;" src="http://open.map.qq.com/apifiles/2/4/20/theme/default/imgs/marker.png"></div></div><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 103;"></div></div><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 202;"><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 104;"></div><div draggable="false" style="-webkit-transform: translateZ(0px); position: absolute; left: -108px; top: -91px; z-index: 105; margin: 0px; padding: 0px; -webkit-user-select: none; width: 1008px; height: 594px; background-image: url(data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAQAIBRAA7); background-color: transparent;"></div><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 106; cursor: default;"><div style="position: absolute; left: 384px; top: 170px; width: 24px; height: 37px; border: 0px none; overflow: hidden; z-index: 0;"><img draggable="false" class="csssprite" dn="2" style="position: absolute; border: 0px; padding: 0px; margin: 0px; top: 1px; left: 0px; -webkit-user-select: none; width: 73px; height: 39px; min-width: 73px; max-width: 73px; min-height: 39px; max-height: 39px;" src="http://open.map.qq.com/apifiles/2/4/20/theme/default/imgs/marker.png" usemap="#smimap0"><map name="smimap0" id="smimap0"><area href="javascript:void(0);" shape="poly" coords="7,-1,13,-1,17,0,22,6,22,7,22,13,21,15,20,17,18,18,15,21,13,24,12,25,12,27,11,30,11,32,10,32,10,28,9,27,9,25,8,24,0,14,0,6" title="" style="cursor: pointer;"></map></div></div><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 107; cursor: default;"></div></div><div style="-webkit-transform: translateZ(0px); position: absolute; left: 0px; top: 0px; z-index: 99;"></div><div style="position: absolute; left: 0px; top: 0px; z-index: 0;"><div style="position: absolute; left: 0px; top: 0px; z-index: 1;"><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 166px; top: 69px;"><img src="http://m0.map.gtimg.com/hwap?z=13&amp;x=13350&amp;y=9274&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 166px; top: 197px;"><img src="http://m3.map.gtimg.com/hwap?z=13&amp;x=13350&amp;y=9273&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 294px; top: 69px;"><img src="http://m1.map.gtimg.com/hwap?z=13&amp;x=13351&amp;y=9274&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 294px; top: 197px;"><img src="http://m0.map.gtimg.com/hwap?z=13&amp;x=13351&amp;y=9273&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 422px; top: 69px;"><img src="http://m2.map.gtimg.com/hwap?z=13&amp;x=13352&amp;y=9274&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 422px; top: 197px;"><img src="http://m1.map.gtimg.com/hwap?z=13&amp;x=13352&amp;y=9273&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 550px; top: 69px;"><img src="http://m3.map.gtimg.com/hwap?z=13&amp;x=13353&amp;y=9274&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div><div style="width: 128px; height: 128px; -webkit-transform: translateZ(0px); position: absolute; left: 550px; top: 197px;"><img src="http://m2.map.gtimg.com/hwap?z=13&amp;x=13353&amp;y=9273&amp;styleid=1000&amp;scene=0&amp;version=108" draggable="false" style="width: 128px; height: 128px; -webkit-user-select: none; padding: 0px; margin: 0px; border: 0px; position: absolute;"></div></div></div></div></div><img src="/wx12345/images/geo.png" onpositionupdate="return;" style="width: 30px; margin: 15px; z-index: 0; position: absolute; right: 0px; bottom: 0px;"><div onpositionupdate="return;" style="position: absolute; z-index: 1000000; margin: 2px 5px 0px 2px; left: 0px; bottom: 0px;"><a title="到腾讯地图查看此区域" target="_blank" href="http://map.qq.com/?center=113.374391%2C23.11879&amp;l=13" style="position: static; overflow: visible; float: none; display: inline;"><div style="cursor: pointer; position: relative; overflow: hidden; width: 80px; height: 18px;"><img draggable="false" class="csssprite" dn="2" style="position: absolute; border: 0px; padding: 0px; margin: 0px; top: 0px; left: 0px; -webkit-user-select: none; width: 80px; height: 18px; min-width: 80px; max-width: 80px; min-height: 18px; max-height: 18px;" src="http://open.map.qq.com/apifiles/2/4/20/theme/logo_hd.png"></div></a></div><div draggable="false" onresize="return;" style="position: absolute; z-index: 1000000; -webkit-user-select: none; left: 87px; bottom: 0px;"><div style="position: absolute; width: 100%; height: 100%; opacity: 0.7;"><div style="width: auto; height: 100%; margin-left: 1px; background-color: rgb(245, 245, 245);"></div></div><div style="font-family: Arial, sans-serif; white-space: nowrap; font-size: 10px; color: rgb(34, 34, 34); line-height: 16px; direction: ltr; text-align: right; font-weight: normal; font-style: normal; position: relative; padding: 0px 5px; background-color: transparent;"><span style="font-family: Arial, sans-serif; white-space: nowrap; font-size: 10px; color: rgb(34, 34, 34); line-height: 16px; direction: ltr; text-align: right; font-weight: normal; font-style: normal; background-color: transparent;">©2016 Tencent - GS(2016)930号 - Data© NavInfo</span><a style="font-family: Arial, sans-serif; white-space: nowrap; font-size: 10px; color: rgb(34, 34, 34); line-height: 16px; direction: ltr; text-align: right; font-weight: normal; font-style: normal; display: none; text-decoration: underline; cursor: pointer; background-color: transparent;">地图数据</a></div></div><div draggable="false" class="smnoprint" controlwidth="40" controlheight="79" style="margin: 10px; -webkit-user-select: none; position: absolute; left: 0px; bottom: 99px;" onpositionupdate="return;"><div controlwidth="40" controlheight="79" style="position: absolute; left: 0px; top: 0px;"><div style="-webkit-tap-highlight-color: rgba(0, 0, 0, 0); box-shadow: rgba(0, 0, 0, 0.498039) 0px 0px 6px; border-top-left-radius: 2px; border-top-right-radius: 2px; border-bottom-right-radius: 2px; border-bottom-left-radius: 2px;"><div style="display: none; background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAkCAYAAADsHujfAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAFpJREFUeNrs1lEKABAQhGErl+SAHHO97hMlsfHPu/pqapaoavCQGJzEDSStPMqlDPtstQrVAAECBMjtiL2+s+neHXsKqAYIkDd2hK8iECBAgHw/8VRzIl2AAQAt2xg7/YiREwAAAABJRU5ErkJggg==);"></div><div style="display: none; background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAkCAYAAADsHujfAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAGtJREFUeNrsmFEKACEIRJtlL1kHrGO6N8iQ/Rji+RvKw4HRVEQ0h3iaSdiAvMW8TE8hDSCAAAKIm8X/NYpP6whpAAHkLh/pYxwlrTm375U6Nh1R8V/D8gwIIIDccQ3ILDwbAdYdkcvp6hNgAD0pFkRpTmarAAAAAElFTkSuQmCC);"></div><div title="放大" style="border-width: 0px; position: relative; margin: 0px; padding: 0px; width: 40px; height: 40px; border-top-left-radius: 2px; border-top-right-radius: 2px; border-bottom-right-radius: 0px; border-bottom-left-radius: 0px; background-color: rgb(255, 255, 255);"><div style="width: 100%; height: 100%; background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAkCAYAAADsHujfAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAFpJREFUeNrs1lEKABAQhGErl+SAHHO97hMlsfHPu/pqapaoavCQGJzEDSStPMqlDPtstQrVAAECBMjtiL2+s+neHXsKqAYIkDd2hK8iECBAgHw/8VRzIl2AAQAt2xg7/YiREwAAAABJRU5ErkJggg==); background-size: 17px 18px; background-position: 50% 50%; background-repeat: no-repeat;"></div></div><div style="display: none; background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAkCAYAAADsHujfAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAEtJREFUeNrs1rENQCEIQEExf0kd0D8mti6g0eReR3cJBURmlhuq5ZJAQEBAQEB2961D6/3oKf7HCKsBAXkeEr54EBAQEBCQw00BBgDNaApD+8SrFQAAAABJRU5ErkJggg==);"></div><div style="display: none; background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAkCAYAAADsHujfAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAE9JREFUeNrs1zEKACAIhWGNLpkH1GPa3q5I/G9z6kMhUTNTJmTJkAABAgQIECDV2U/dvYqV0QAB8tc/csxaHw/3eR1R7hogQIAAAVKcK8AA0bwKRZZHKJsAAAAASUVORK5CYII=);"></div><div title="缩小" style="border-width: 0px; position: relative; margin: 0px; padding: 0px; width: 40px; height: 40px; border-top-left-radius: 0px; border-top-right-radius: 0px; border-bottom-right-radius: 2px; border-bottom-left-radius: 2px; background-color: rgb(255, 255, 255);"><div style="width: 100%; height: 100%; background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACIAAAAkCAYAAADsHujfAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAEtJREFUeNrs1rENQCEIQEExf0kd0D8mti6g0eReR3cJBURmlhuq5ZJAQEBAQEB2961D6/3oKf7HCKsBAXkeEr54EBAQEBCQw00BBgDNaApD+8SrFQAAAABJRU5ErkJggg==); background-size: 17px 18px; background-position: 50% 50%; background-repeat: no-repeat;"></div></div></div></div></div><div class="smnoprint" onpositionupdate="return;" style="margin: 5px; cursor: pointer; z-index: 0; position: absolute; right: 0px; top: 0px;"><div style="float: left;"><div draggable="false" title="显示街道地图" style="color: rgb(255, 255, 255); font-family: Arial, sans-serif; font-size: 13px; -webkit-user-select: none; padding: 1px 6px; direction: ltr; overflow: hidden; text-align: center; line-height: 20px; border: 1px solid rgb(113, 123, 135); box-shadow: rgba(0, 0, 0, 0.4) 0px 2px 4px; font-weight: bold; background-color: rgb(38, 154, 234);">地图</div></div><div style="float: left;"><div draggable="false" title="显示卫星地图" style="color: rgb(51, 51, 51); font-family: Arial, sans-serif; font-size: 13px; -webkit-user-select: none; padding: 1px 6px; direction: ltr; overflow: hidden; text-align: center; line-height: 20px; border-width: 1px 1px 1px 0px; border-top-style: solid; border-right-style: solid; border-bottom-style: solid; border-top-color: rgb(113, 123, 135); border-right-color: rgb(113, 123, 135); border-bottom-color: rgb(113, 123, 135); box-shadow: rgba(0, 0, 0, 0.4) 0px 2px 4px; font-weight: normal; background-color: rgb(255, 255, 255);">卫星</div><div style="z-index: -1; padding-top: 2px; border-width: 0px 1px 1px; border-right-style: solid; border-bottom-style: solid; border-left-style: solid; border-right-color: rgb(113, 123, 135); border-bottom-color: rgb(113, 123, 135); border-left-color: rgb(113, 123, 135); text-align: left; position: absolute; right: 0px; top: 24px; display: none; background-color: rgb(255, 255, 255);"><div draggable="false" title="显示带有街道名称的卫星地图" style="color: rgb(0, 0, 0); font-family: Arial, sans-serif; font-size: 11px; -webkit-user-select: none; padding: 1px 5px 3px; direction: ltr; text-align: left; white-space: nowrap; cursor: pointer; background-color: rgb(255, 255, 255);"><input type="checkbox" style="vertical-align: middle; margin: 0px 3px 0px 0px; cursor: pointer;"><label style="vertical-align: middle; cursor: pointer;">地名</label></div></div></div></div></div></div>
          
          
          <label>照片上传<span class="alit" id="textTip">（注：最多可上传5张图片）</span></label>
          <div id="imageDiv" class="magx"><img id="addImg"  src="../appImage/tpic.png" width="50px" height="50px" onclick="chooseImg();">
			<span id="respSpan"></span>
          </div>
          <input type="file" name="file" accept="image/*" capture="camera" id="file_upload" onchange="ajaxFileUploadFunction();" style="display:none;"/>
         
          <input type="submit" value="提交" class="btn3" />
          
          <input type="hidden" name="filePath1" id="filePath1">
          <input type="hidden" name="filePath2" id="filePath2">
          <input type="hidden" name="filePath3" id="filePath3">
          <input type="hidden" name="filePath4" id="filePath4">
          <input type="hidden" name="filePath5" id="filePath5">
        </form>   
    </div>
</div>

 
<script type="text/javascript" src="../appJs/gzwx.js"></script>
<script type="text/javascript">

 function fileSelect() {
        document.getElementById("file_upload").click(); 
 }

function ajaxFileUploadFunction(){
	$.ajaxFileUpload({
	url:'http://www.lwbtest.com.ngrok.cc/weixinDevelop/weixin/handleSubmit.action',
	secureuri:false,
	fileElementId:'file_upload',
	dataType:'text',
	success:function(data,status)
	{
		var respSpan = document.getElementById("respSpan");
		respSpan.innerHTML = "图片上传成功";
			
	},
	error:function(data,status,e){
		
	}
});
}

var citylocation,map,marker,geocoder,geocoder2 = null;
var markersArray = [];

//判断是否支持定位
function checkGeolocation() {
	if (navigator.geolocation){
		var customZoomDiv = document.createElement("img");
	    var customZoomControl = new CustomZoomControl(customZoomDiv, map);
	    map.controls[qq.maps.ControlPosition.RIGHT_BOTTOM].push(customZoomDiv);
	    getLocation();
	}
}

//取当前位置
function getLocation(){
	navigator.geolocation.getCurrentPosition(showPosition);
}

//显示当前位置
function showPosition(position){
	var lat=position.coords.latitude; 
	var lng=position.coords.longitude;
	qq.maps.convertor.translate(new qq.maps.LatLng(lat,lng), 1, function(res){
		latlng = res[0];
  
		map.panTo(latlng);
		addMarker(latlng);
		geocoder.getAddress(latlng);
	});
}

//自定义定位控件
function CustomZoomControl(controlDiv, map) {
    controlDiv.index = 1;//设置在当前布局中的位置
    controlDiv.style.width = "30px";
    controlDiv.style.high = "30px";
    controlDiv.style.margin = "15px";
    controlDiv.src = '/wx12345/images/geo.png';
    controlDiv.onclick=function() {
    	deleteOverlays();
    	getLocation();
    }
}

//初始化加载腾讯地图
function initMap() {
	map = new qq.maps.Map(document.getElementById("mapDiv"),{
        center: new qq.maps.LatLng(23.13559,113.335367),
        zoom: 13
    });
	markersArray = [];
    qq.maps.event.addListener(map, 'click', function(event) {
    	deleteOverlays();
    	map.panTo(event.latLng);
    	addMarker(event.latLng);
    	geocoder.getAddress(event.latLng);
    });
    geocoder = new qq.maps.Geocoder({
        complete : function(result){
			document.getElementById("requestArea2").value = result.detail.address;
        }
    });
    geocoder2 = new qq.maps.Geocoder({
        complete : function(result){
        	deleteOverlays();
        	map.panTo(result.detail.location);
        	addMarker(result.detail.location);
        }
    });
    checkGeolocation();
}

//添加标记
function addMarker(location) {
    var marker = new qq.maps.Marker({
        position: location,
        map: map
    });
    markersArray.push(marker);
}

//删除标记
function deleteOverlays() {
	if (markersArray) {
    	for (var i=0;i<markersArray.length;i++) {
            markersArray[i].setMap(null);
        }
        markersArray.length = 0;
    }
}

//地址解析
function codeAddress() {
	var address = document.getElementById("requestArea2").value;
    geocoder2.getLocation(address);
}


var imageSize = 0;

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
    		appId: 'wx4f116a6f5e9b40b3', // 必填，公众号的唯一标识
    		timestamp: timestamp , // 必填，生成签名的时间戳
    		nonceStr: noncestr, // 必填，生成签名的随机串
    		signature: signature,// 必填，签名，见附录1
    		jsApiList: ['chooseImage',
		'previewImage',
		'uploadImage',
		'downloadImage'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
		});

var images = {
    localId: [],
    serverId: []
};
function chooseImg() {
	wx.chooseImage({
		count: 5,
		success: function (res) {
			images.localId = res.localIds;
			if(res.localIds.length > (5-imageSize)) {
				if(imageSize == 0) {
					alert("最多只能上传5张图片，请重新选择");
				}else {
					alert("您之前已选择" + imageSize + "张图片，还可选择" + (5-imageSize) + "张，请重新选择");
				}
			} else {
				for(var i=0;i<res.localIds.length;i++) {
					var img = document.createElement('img'),divH = document.createElement('div'),spanC = document.createElement('span');
					img.className = "imgSizeCl"; 
					img.src = res.localIds[i];
					spanC.onclick = function(){
						imageSize --;
						var id = $(this).attr("id");
						$("#filePath" + (id*1+1)).val("");
						$(this).parent().remove();
					};
					spanC.setAttribute("id", i);
					divH.className='box';spanC.className='colse';
					divH.appendChild(img);divH.appendChild(spanC);
					$(divH).insertBefore("#addImg");
				}
				uploadFile(0);
			}
		}
	});
}

function uploadFile(i){
	if(images.localId != null && images.localId.length > i) {
		var media_id = "";
    	wx.uploadImage({
        	localId: images.localId[i], // 需要上传的图片的本地ID，由chooseImage接口获得
    		isShowProgressTips: 1, // 默认为1，显示进度提示
    		success: function (ress) {
    			media_id = ress.serverId; // 返回图片的服务器端ID
    			if($("#filePath1").val() == "") {
    				$("#filePath1").val(media_id);
    			}else if($("#filePath2").val() == "") {
    				$("#filePath2").val(media_id);
    			}else if($("#filePath3").val() == "") {
    				$("#filePath3").val(media_id);
    			}else if($("#filePath4").val() == "") {
    				$("#filePath4").val(media_id);
    			}else if($("#filePath5").val() == "") {
    				$("#filePath5").val(media_id);
    			}
    			imageSize ++;
    			i++;
    			uploadFile(i);
    		}
    	});
	}
}

function downloadImage(){
	wx.downloadImage({
    serverId: $("#filePath1").val(), // 需要下载的图片的服务器端ID，由uploadImage接口获得
    isShowProgressTips: 1, // 默认为1，显示进度提示
    success: function (res) {
        var localId = res.localId; // 返回图片下载后的本地ID
    }
});
}


</script>

</body></html>