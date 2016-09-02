package com.sunwah.baseapp.weixin.service;

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

import com.sunwah.baseapp.common.SqlConstants;
import com.sunwah.baseapp.service.QueryManager;
import com.sunwah.baseapp.service.QueryResult;
import com.sunwah.baseapp.weixin.entity.Message.resp.Article;
import com.sunwah.baseapp.weixin.entity.Message.resp.NewsMessage;
import com.sunwah.baseapp.weixin.entity.Message.resp.TextMessage;
import com.sunwah.baseapp.weixin.constant.Constant;
import com.sunwah.baseapp.weixin.model.ArticleData;
import com.sunwah.baseapp.weixin.model.Content;
import com.sunwah.baseapp.weixin.model.MenuArticle;
import com.sunwah.baseapp.weixin.model.MenuContent;
import com.sunwah.baseapp.weixin.service.ArticleService;
import com.sunwah.baseapp.weixin.service.ContentService;
import com.sunwah.baseapp.weixin.service.MenuArticleService;
import com.sunwah.baseapp.weixin.service.MenuContentService;
import com.sunwah.baseapp.weixin.util.MessageUtil;
import com.sunwah.baseapp.weixin.util.SignUtil;




public class CoreServiceImpl implements CoreService{
	
	private ArticleService articleService;
	private ContentService contentService;
	private MenuArticleService menuArticleService;
	private MenuContentService menuContentService;
	private QueryManager queryManager;
	private QueryResult queryResult;
	
	

	public QueryResult getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	public QueryManager getQueryManager() {
		return queryManager;
	}

	public void setQueryManager(QueryManager queryManager) {
		this.queryManager = queryManager;
	}

	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	public ContentService getContentService() {
		return contentService;
	}

	public void setContentService(ContentService contentService) {
		this.contentService = contentService;
	}

	public MenuArticleService getMenuArticleService() {
		return menuArticleService;
	}

	public void setMenuArticleService(MenuArticleService menuArticleService) {
		this.menuArticleService = menuArticleService;
	}

	public MenuContentService getMenuContentService() {
		return menuContentService;
	}

	public void setMenuContentService(MenuContentService menuContentService) {
		this.menuContentService = menuContentService;
	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) {
		String method = request.getMethod();
		 if(method.equals("GET")){
			  doGet(request,response);
		 }
		 doPost(request,response);
	}
	
	private void doGet(HttpServletRequest request, HttpServletResponse response){
	    // 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。
			
			//System.out.println(request.getMethod());
			
	        String signature = request.getParameter("signature");  
	        // 时间戳  
	        String timestamp = request.getParameter("timestamp");  
	        // 随机数  
	        String nonce = request.getParameter("nonce");  
	        // 随机字符串  
	        String echostr = request.getParameter("echostr");  
	  
	        PrintWriter out = null;  
	        try {  
	            out = response.getWriter();  
	            // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，否则接入失败  
	            if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
	                out.print(echostr);  
	            }  
	        } catch (Exception e) {  
	         //   e.printStackTrace();  
	        } finally {  
	            out.close();  
	            out = null;  
	        }  
			
		}
		
		private void doPost(HttpServletRequest request, HttpServletResponse response){
			try {  
	            request.setCharacterEncoding("UTF-8");  
	        } catch (UnsupportedEncodingException e) {  
	            e.printStackTrace();  
	        }  
	        response.setCharacterEncoding("UTF-8");  
	  
	        // 调用核心业务类接收消息、处理消息  
	        String respMessage = processPostRequest(request);  
	  
	        // 响应消息  
	        PrintWriter out = null;  
	        try {  
	            out = response.getWriter();  
	            out.print(respMessage);  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            out.close();  
	            out = null;  
	        }  
			
		}
		
		private String processPostRequest(HttpServletRequest request){
			// TODO Auto-generated method stub
			String respMessage = null;  
	        try {  
	           // xml请求解析
	        	Map<String, String> requestMap = MessageUtil.parseXml(request); 
	        	// 发送方账号(open_id)
	        	String fromUserName = requestMap.get("FromUserName");
	        	// 公众账号
	        	String toUserName = requestMap.get("ToUserName");
	        	// 消息类型
	        	String msgType = requestMap.get("MsgType");
	        	
	        	 String respContent = "";  
	        	
	        	//文本请求处理
	        	if(msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)){
	                String content = requestMap.get("Content");
	        		respMessage = handleTextRequest(content, fromUserName, toUserName);
	            //事件请求处理
	            } else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_EVENT)) {  
	                    // 事件类型  
	                    String eventType = requestMap.get("Event");  
	      
	                    if (eventType.equals(Constant.EVENT_TYPE_SUBSCRIBE)) {
	                    	
	                        respContent = getSubscribeInfo();
	                        TextMessage textMessage =  createTextMessage(respContent, fromUserName, toUserName);
	                        respMessage = MessageUtil.textMessageToXml(textMessage);  
	                          
	                    } else if (eventType.equals(Constant.EVENT_TYPE_UNSUBSCRIBE)) {  
	                        // 取消关注,用户接受不到我们发送的消息了，可以在这里记录用户取消关注的日志信息  
	      
	                    }  else if (eventType.equals(Constant.EVENT_TYPE_CLICK)) {  
	      
	                        // 事件KEY值，与创建自定义菜单时指定的KEY值对应  
	                        String eventKey = requestMap.get("EventKey");  
	      
	                        // 自定义菜单点击事件  
	                         respMessage = handleClickEvent(eventKey,fromUserName,toUserName);
	                    }  
	                   
	                }  
	              
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return respMessage;  
		}
		
		//用户输入文字请求服务时公众号作出的响应
		private String handleTextRequest(String content, String fromUserName, String toUserName){
			
			String respMessage = "";
			
			//用户输入1时固定回复最新回复服务信息
			if(content.equals("1")){
				
				 String lastRespContent = getLastRespContent();
				 TextMessage aTextMessage = createTextMessage(lastRespContent, fromUserName, toUserName);
		    	 respMessage = MessageUtil.textMessageToXml(aTextMessage);
		    
		    //其余输入根据数据库内容进行回复
			}else{

			//从数据库中获取对应content的contentList
		    List<Content> contentList  = contentService.getContentByCont(content);
			
		    if(contentList != null && contentList.size() != 0){
		    	
		    	Content aContent = (Content)contentList.get(0);
		    	String respMsgType = aContent.getMsgType();

		    	//回复文字
		    	if(respMsgType.equals(Constant.RESP_MESSAGE_TYPE_TEXT))
		    		respMessage = handleRespText(aContent, fromUserName, toUserName);
		    	// 回复文章
		    	else if(respMsgType.equals(Constant.RESP_MESSAGE_TYPE_NEWS))
		    		respMessage = handleRespArticle(contentList, fromUserName, toUserName);
		    	// 默认回复内容
		    }else{
		    	   TextMessage aTextMessage = createTextMessage(Constant.INDEX_RESP_CONTENT, fromUserName, toUserName);
		    	   respMessage = MessageUtil.textMessageToXml(aTextMessage);
		    }
			}
			
		    return respMessage;
		}
		
		//生成TextMessage函数
		private TextMessage createTextMessage(String content, String fromUserName, String toUserName){
			
			TextMessage textMessage = new TextMessage();
	    	textMessage.setToUserName(fromUserName);
	    	textMessage.setFromUserName(toUserName);
	    	textMessage.setCreateTime(new Date().getTime());
	    	textMessage.setMsgType(Constant.RESP_MESSAGE_TYPE_TEXT);
	    	textMessage.setFuncFlag(0);
	    	textMessage.setContent(content);   	
	    	return textMessage;
	    	
		}
		
		//文字回复处理-回复文字-数据表content里面的msgType字段为"text"时回复对应文字内容
		private String handleRespText(Content content, String fromUserName, String toUserName){
			
			TextMessage textMessage = createTextMessage(content.getRespContent(), fromUserName, toUserName);

	    	String respMessage = MessageUtil.textMessageToXml(textMessage);  
	    	
	    	return respMessage;
		}
		
		//文字回复处理-回复文章-数据表content里面的msgType字段为"news"时回复对应文章内容
		private String handleRespArticle(List<Content> contentList, String fromUserName, String toUserName){
			//创建图文消息
			NewsMessage newsMessage = new NewsMessage();
			newsMessage.setToUserName(fromUserName);
			newsMessage.setFromUserName(toUserName);
			newsMessage.setCreateTime(new Date().getTime());
			newsMessage.setMsgType(Constant.RESP_MESSAGE_TYPE_NEWS);
			newsMessage.setFuncFlag(0);
			List<Article> articleList = new ArrayList<Article>();
			
			for(int i=0; i<contentList.size(); i++){
				ArticleData data = contentList.get(i).getArticle();
				Article article = new Article();
	            article.setDescription(data.getDescription());
	            article.setPicUrl(data.getPicUrl());
	            article.setTitle(data.getTitle());
	            article.setUrl(data.getUrl());
	            articleList.add(article);
			}
			
			newsMessage.setArticleCount(articleList.size());  
	        newsMessage.setArticles(articleList);  
	        String respMessage = MessageUtil.newsMessageToXml(newsMessage);
	        
	        return respMessage;
		}
		
		//获取关注微信公众号时的提示信息
		private String getSubscribeInfo(){
			//获取数据库回复内容
			this.setQueryResult(this.getQueryManager().query(SqlConstants.GET_CONTENT_AND_DESC , null));
			
			// 关注 
	       String  respContent = "感谢您关注偶,这里会给您提供最新的公司资讯和公告！\n";  
	        StringBuffer contentMsg = new StringBuffer();  
	        contentMsg.append("您还可以回复下列内容，体验相应服务").append("\n\n");
	        
	        contentMsg.append("\'");
	    	contentMsg.append("1");
	    	contentMsg.append("\'");
	    	contentMsg.append("---");
	    	contentMsg.append("获取最新回复服务信息");
	   	    contentMsg.append("\n");
	        
	         for(int i=0;i < this.getQueryResult().getResults().size(); i++){
	        	 HashMap resultMap = (HashMap)this.getQueryResult().getResults().get(i);
	        	 String content = (String)resultMap.get("content");
	        	 String desc = (String)resultMap.get("description");
	        	 contentMsg.append("\'");
	        	 contentMsg.append(content);
	        	 contentMsg.append("\'");
	        	 contentMsg.append("---");
	        	 contentMsg.append(desc);
	        	 contentMsg.append("\n");
	         }
	        respContent = respContent+contentMsg.toString();  
	        
	        return respContent;
		}
		
		
	   //获取最新回复服务内容信息
		private String getLastRespContent(){
			//获取数据库回复内容
			this.setQueryResult(this.getQueryManager().query(SqlConstants.GET_CONTENT_AND_DESC , null));
			
			// 关注 
	       String  respContent = "";  
	        StringBuffer contentMsg = new StringBuffer();  
	        contentMsg.append("最新：回复下列内容，体验相应服务").append("\n\n"); 
	        	contentMsg.append("\'");
	        	contentMsg.append("1");
	        	contentMsg.append("\'");
	        	contentMsg.append("---");
	        	contentMsg.append("获取最新回复服务信息");
	       	    contentMsg.append("\n");
	        
	         for(int i=0;i < this.getQueryResult().getResults().size(); i++){
	        	 HashMap resultMap = (HashMap)this.getQueryResult().getResults().get(i);
	        	 String content = (String)resultMap.get("content");
	        	 String desc = (String)resultMap.get("description");
	        	 contentMsg.append("\'");
	        	 contentMsg.append(content);
	        	 contentMsg.append("\'");
	        	 contentMsg.append("---");
	        	 contentMsg.append(desc);
	        	 contentMsg.append("\n");
	         }
	        respContent = respContent+contentMsg.toString();  
	        
	        return respContent; 
		}
		
		//处理菜单点击事件
		private String handleClickEvent(String menuKey, String fromUserName, String toUserName){
			
	         String respMessage = "";
			
			//菜单key为1时固定回复最新回复服务信息
			if(menuKey.equals("1")){
				
				 String lastRespContent = getLastRespContent();
				 TextMessage aTextMessage = createTextMessage(lastRespContent, fromUserName, toUserName);
		    	 respMessage = MessageUtil.textMessageToXml(aTextMessage);
		    
		    //其余菜单key根据数据库内容进行回复
			}else{

			//从数据库中获取对应menuContent的contentList
		    List<MenuContent> contentList  = menuContentService.getContentByCont(menuKey);
			
		    if(contentList != null && contentList.size() != 0){
		    	
		    	MenuContent aContent = (MenuContent)contentList.get(0);
		    	String respMsgType = aContent.getMsgType();

		    	//回复文字
		    	if(respMsgType.equals(Constant.RESP_MESSAGE_TYPE_TEXT))
		    		respMessage = handleClickEventRespText(aContent, fromUserName, toUserName);
		    	// 回复文章
		    	else if(respMsgType.equals(Constant.RESP_MESSAGE_TYPE_NEWS))
		    		respMessage = handleClickEventRespArticle(contentList, fromUserName, toUserName);
		    	// 默认回复内容
		    }else{
		    	   TextMessage aTextMessage = createTextMessage(Constant.INDEX_RESP_CONTENT, fromUserName, toUserName);
		    	   respMessage = MessageUtil.textMessageToXml(aTextMessage);
		    }
			}
			
		    return respMessage;
		}
		
		//菜单点击处理-回复文字-数据表menuContent里面的msgType字段为"text"时回复对应文字内容
		private String handleClickEventRespText(MenuContent menuContent, String fromUserName, String toUserName){
			
			TextMessage textMessage = createTextMessage(menuContent.getRespContent(), fromUserName, toUserName);

	    	String respMessage = MessageUtil.textMessageToXml(textMessage);  
	    	
	    	return respMessage;
		}
		
		//菜单点击处理-回复文章-数据表menuContent里面的msgType字段为"news"时回复对应文章内容
		private String handleClickEventRespArticle(List<MenuContent> contentList, String fromUserName, String toUserName){
			//创建图文消息
			NewsMessage newsMessage = new NewsMessage();
			newsMessage.setToUserName(fromUserName);
			newsMessage.setFromUserName(toUserName);
			newsMessage.setCreateTime(new Date().getTime());
			newsMessage.setMsgType(Constant.RESP_MESSAGE_TYPE_NEWS);
			newsMessage.setFuncFlag(0);
			List<Article> articleList = new ArrayList<Article>();
			
			for(int i=0; i<contentList.size(); i++){
				MenuArticle menuArticle = contentList.get(i).getMenuArticle();
				Article article = new Article();
	            article.setDescription(menuArticle.getDescription());
	            article.setPicUrl(menuArticle.getPicUrl());
	            article.setTitle(menuArticle.getTitle());
	            article.setUrl(menuArticle.getUrl());
	            articleList.add(article);
			}
			
			newsMessage.setArticleCount(articleList.size());  
	        newsMessage.setArticles(articleList);  
	        String respMessage = MessageUtil.newsMessageToXml(newsMessage);
	        
	        return respMessage;
		}

}
