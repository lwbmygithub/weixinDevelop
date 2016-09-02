package com.sunwah.baseapp.weixin.model;

public class MenuContent {
		private Integer id;
		private String menuKey;
		private String msgType;
		private String respContent;
	    private MenuArticle menuArticle;
		
	    
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		
		public MenuArticle getMenuArticle() {
			return menuArticle;
		}
		public void setMenuArticle(MenuArticle menuArticle) {
			this.menuArticle = menuArticle;
		}
		public String getMenuKey() {
			return menuKey;
		}
		public void setMenuKey(String menuKey) {
			this.menuKey = menuKey;
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
