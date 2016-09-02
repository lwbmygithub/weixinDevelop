var smsTimeout=90;

function smsTimeoutCheck(){
	setTimeout(function(){
		smsTimeout--;
		if(smsTimeout==0){
			$('#code_btn').text("获取短信验证码");
			$('#code_btn').removeAttr("disabled");
		}else{
			smsTimeoutCheck();
			$('#code_btn').text("请在"+smsTimeout+"s内输入验证码");
			
			
		}
	},1000);
}

$(function(){
	
	$('#submit_btn').click(function() {
		
		if(!checkNotEmpty('requestTopic')){
			return false;
		}
		
		if(!checkNotEmpty('requestContent')){
			return false;
		}
		
		if($('#requestContent').val().length>1000){
//			alert("诉求内容请控制在1000字以内。");
			alert($('#tips1').val());
			return false;
		}
		
		if(!checkNotEmpty('contactName')){
			return false;
		}
		
		if(!checkNotEmpty('contactTel')){
			return false;
		} 
		
		if(!verifyMobile($('#contactTel').val())){
//			alert("请在联系方式栏正确填写您的手机号码。"); 
/*			alert($('#tips2').val());
			$('#contactTel').focus();
			return false;*/
			alert($('#tips0').val());
			self.location = ctx + "/bind/account";
		}
		
		return true;
	});
	
	$('#code_btn').click(function() {
		if(!verifyMobile($('#contactTel').val())){
			alert("请填写正确的手机号码！");
			$('#contactTel').focus();
			return false;
		}
		smsVerify($('#contactTel').val(),$('#pageTokenSms').val());
		return false;
	});
});

function checkNotNull(id,content) {
	var obj = $("#" + id);
	if(obj && (obj.val() == null || obj.val() == "")) {
		alert(content + "不能为空！");
		obj.focus();
		return false;
	}else {
		return true;
	}
}

function checkRadio(name,content) {
	var obj = $("input[name=" + name + "]:checked");
	if(obj && obj.val() != null && obj.val() != "") {
		return true;
	}else {
		alert("请选择" + content + "!");
		$("input[name=" + name + "]").get(0).focus();
		return false;
	}
}

function smsVerify(phone,pageTokenSms){
	$('#code_btn').attr("disabled","disabled");
	$.ajax({
		  type: 'POST',
		  url: $('#api-smsVerify').val(),
		  data: "phone="+phone+"&pageTokenSms="+pageTokenSms,
		  beforeSend:function(){
			  smsTimeout=90;
			  smsTimeoutCheck();
		  },
		  success: function(){
				//smsTimeoutCheck();
		  },
		  error :function(){
			  $('#code_btn').removeAttr("disabled");
		  },
		  dataType: 'json'
	});
}