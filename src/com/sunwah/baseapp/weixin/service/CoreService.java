package com.sunwah.baseapp.weixin.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CoreService {
	public void processRequest(HttpServletRequest request, HttpServletResponse response);
}
