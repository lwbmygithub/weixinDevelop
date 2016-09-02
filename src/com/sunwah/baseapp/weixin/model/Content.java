package com.sunwah.baseapp.weixin.model;

public class Content {
		private Integer id;
		private String content;
		private String msgType;
		private String respContent;
	    private ArticleData article;
		
	    
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public ArticleData getArticle() {
			return article;
		}
		public void setArticle(ArticleData article) {
			this.article = article;
		}
		
		
		
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getMsgType() {
			return msgType;
		}
		public void setMsgType(String msgType) {
			this.msgType = msgType;
		}
		public String getRespContent() {
			return respContent;
		}
		public void setRespContent(String respContent) {
			this.respContent = respContent;
		}
		
		
}
