package com.sunwah.baseapp.weixin.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sunwah.baseapp.action.QueryManageAction;
import com.sunwah.baseapp.common.SqlConstants;
import com.sunwah.baseapp.weixin.constant.Constant;
import com.sunwah.baseapp.weixin.entity.Message.resp.Article;
import com.sunwah.baseapp.weixin.entity.Message.resp.NewsMessage;
import com.sunwah.baseapp.weixin.entity.Message.resp.TextMessage;
import com.sunwah.baseapp.weixin.model.ArticleData;
import com.sunwah.baseapp.weixin.model.Content;
import com.sunwah.baseapp.weixin.model.MenuArticle;
import com.sunwah.baseapp.weixin.model.MenuContent;
import com.sunwah.baseapp.weixin.service.ArticleService;
import com.sunwah.baseapp.weixin.service.ContentService;
import com.sunwah.baseapp.weixin.service.CoreService;
import com.sunwah.baseapp.weixin.service.MenuArticleService;
import com.sunwah.baseapp.weixin.service.MenuContentService;
import com.sunwah.baseapp.weixin.util.MessageUtil;
import com.sunwah.baseapp.weixin.util.SignUtil;

import org.apache.struts2.ServletActionContext;

public class CoreAction extends QueryManageAction{

	private HttpServletRequest request;
	private HttpServletResponse response;
	private CoreService coreService;
	
	

	
	public CoreService getCoreService() {
		return coreService;
	}




	public void setCoreService(CoreService coreService) {
		this.coreService = coreService;
	}




	public void coreService(){	
		 request = ServletActionContext.getRequest();
		 response = ServletActionContext.getResponse();
		 this.getCoreService().processRequest(request, response);
	}
	
	
	
}
