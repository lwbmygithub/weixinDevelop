/**
 * 
 */
package com.sunwah.baseapp.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sunwah.baseapp.common.Constants;

/**
 * 页面资源权限控制类
 * 
 * @author MARK
 * 
 */
public class AuthorizationControlAction extends ActionSupport implements
		SessionAware {
	/**
	 * hello
	 */
	private static final long serialVersionUID = -5171547353110102755L;
	
	protected final Log log = LogFactory.getLog(getClass());

	// 会话
	private Map session;

	// 查询
	private boolean listFlag = false;
	// 查看
	private boolean viewFlag = false;
	// 增加
	private boolean addFlag = false;
	// 修改
	private boolean editFlag = false;
	// 删除
	private boolean deleteFlag = false;
	// 扩展1
	private boolean extFlag1 = false;
	// 扩展2
	private boolean extFlag2 = false;

	/**
	 * 增删改查校验
	 * 
	 * @param listAction
	 * @param viewAction
	 * @param addAction
	 * @param editAction
	 * @param deleteAction
	 */
	public void check(String listAction, String viewAction, String addAction,
			String editAction, String deleteAction) {

	}

	/**
	 * 增删改查+两个扩展校验
	 * 
	 * @param listAction
	 * @param viewAction
	 * @param addAction
	 * @param editAction
	 * @param deleteAction
	 * @param extAction1
	 * @param extAction2
	 */
	public void check(String listAction, String viewAction, String addAction,
			String editAction, String deleteAction, String extAction1,
			String extAction2) {
		this.check(listAction, viewAction, addAction, editAction, deleteAction);
		extFlag1 = this.check(extAction1);
		//extFlag1=true;//为了方便，先写true
		extFlag2 = this.check(extAction2);
	}

	private boolean check(String resourceAction, List resourceList) {
		return (resourceAction != null && resourceList.contains(resourceAction)) ? true
				: false;
	}

	/**
	 * 单个资源权限校验
	 * 
	 * @param resourceAction
	 * @return
	 */
	public boolean check(String resourceAction) {
			return true;
	}

	/**
	 * 
	 */
	public void checkEdit(String editAction,String listAction) {

	}


	public boolean isExtFlag2() {
		return extFlag2;
	}

	public boolean isExtFlag1() {
		return extFlag1;
	}

	public boolean isListFlag() {
		return listFlag;
	}

	public boolean isAddFlag() {
		return addFlag;
	}

	public boolean isViewFlag() {
		return viewFlag;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public boolean isEditFlag() {
		return editFlag;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public Map getSession() {
		return session;
	}
}
