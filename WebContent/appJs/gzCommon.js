function checkNotEmpty(inputId){
	var doc = window.document, input = doc.createElement('input');
	var me = $('#'+inputId);
	var ph = me.attr('placeholder');
	if (typeof input['placeholder'] == 'undefined') // ������֧��placeholder���� 
	{
		if(ph==me.val()){
			me.focus();
			alert(ph);
			return false;
		}
	}
	if($.trim(me.val())==""){
		me.focus();
		alert(ph);
		return false;
	}
	return true;
}


/**
 * ��֤����
 * @param email
 * @returns
 */
function verifyEmail(email)  
{  
	var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
	return pattern.test(email);
}

/**
 * ��֤�ֻ�,11λ���֣���1��ͷ
 * @param mobile
 * @returns
 */
function verifyMobile(mobile) {
   var pattern = /^1\d{10}$/;
   return pattern.test(mobile);
}

/**
 * ��֤�̻�,����+���룬������0��ͷ��3λ��4λ
 * ������7λ��8λ��������
 * ����������֮�����������ӷ���Ҳ���ԡ�-������
 * ��01088888888,010-88888888,0955-7777777 
 * @param mobile
 * @returns
 */
function verifyPhone(phone) {
   var pattern = /^0\d{2,3}-?\d{7,8}$/;
   return pattern.test(phone);
}

/**
 * ��֤����֤
 * @param cardNo
 * @returns {Boolean}
 */
function verifyIdCard(cardNo) {
	//����֤��������ʽ(15λ)
	var isIDCard1=/^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/;
	//����֤��������ʽ(18λ)
	var isIDCard2=/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{4}$/;
	if(isIDCard1.test(cardNo)) {
		return true;
	}else if(isIDCard2.test(cardNo)) {
		return true;
	}else {
		return false;
	}
}
