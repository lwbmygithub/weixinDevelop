package com.sunwah.baseapp.weixin.model;

import java.util.Date;

public class Menu implements Comparable{
	
		private String key;
		private Integer level;
		private String name;
		private String parentKey;
		private Integer order;
		private Date createDate;
		private Date modifyDate;
		private String url;
		private String openId;
		private String type;
		
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public Integer getLevel() {
			return level;
		}
		public void setLevel(Integer level) {
			this.level = level;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	    
		public String getParentKey() {
			return parentKey;
		}
		public void setParentKey(String parentKey) {
			this.parentKey = parentKey;
		}
		
		public Integer getOrder() {
			return order;
		}
		public void setOrder(Integer order) {
			this.order = order;
		}
		public Date getCreateDate() {
			return createDate;
		}
		public void setCreateDate(Date createDate) {
			this.createDate = createDate;
		}
		public Date getModifyDate() {
			return modifyDate;
		}
		public void setModifyDate(Date modifyDate) {
			this.modifyDate = modifyDate;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getOpenId() {
			return openId;
		}
		public void setOpenId(String openId) {
			this.openId = openId;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			if(this == o){
				return 0;
			}else if(o != null && o instanceof Menu){
				Menu m = (Menu) o;
				if(order  <= m.order){
					return -1;
				}else{
					return 1;
				}
			}else{
				 return -1;
			}
		}
		
		
		
}
