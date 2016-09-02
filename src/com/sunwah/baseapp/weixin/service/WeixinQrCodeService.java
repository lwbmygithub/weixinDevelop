package com.sunwah.baseapp.weixin.service;

import net.sf.json.JSONObject;

public interface WeixinQrCodeService {
		public JSONObject createQrScene(int exSeconds, int sceneId);
		public JSONObject createQrLimitScene();
		public void showQrCode(String ticket);
}
