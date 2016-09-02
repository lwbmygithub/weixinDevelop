package com.sunwah.baseapp.weixin.action;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.sunwah.baseapp.weixin.service.WeixinAuthorizeService;
import com.sunwah.baseapp.weixin.service.WeixinMediaService;
import com.sunwah.baseapp.weixin.service.WeixinQrCodeService;
import com.sunwah.baseapp.weixin.util.JSSDKUtil;


public class WeixinJSSDKAction extends ActionSupport{
	
	    private static JSSDKUtil util = new JSSDKUtil();
	    private String url;
	    private WeixinMediaService weixinMediaService;
	    private String requestArea2;
	    private String filePath1;
	    private String code;
	    private WeixinAuthorizeService weixinAuthorizeService;
	    private File file;
	    private String fileFileName;
	    private WeixinQrCodeService weixinQrCodeService;
	    
	    
	    
	    /*
	     * 		这里定义的是文件的类型,如果不需要获取文件类型的话,可以不定义.  
	     *     命名规则跟xxxFileName类似,这里一定要定义成xxxContentType形式. 
	     */
	    private String fileContentType;
	    /*
	     *     这个变量是重名名后的文件名
	     */
	    private String newFileName;
	    
	    
	
		public File getFile() {
			return file;
		}

		public void setFile(File file) {
			this.file = file;
		}

		public String getFileFileName() {
			return fileFileName;
		}

		public void setFileFileName(String fileFileName) {
			this.fileFileName = fileFileName;
		}

		public String getFileContentType() {
			return fileContentType;
		}

		public void setFileContentType(String fileContentType) {
			this.fileContentType = fileContentType;
		}

		public WeixinAuthorizeService getWeixinAuthorizeService() {
			return weixinAuthorizeService;
		}

		public void setWeixinAuthorizeService(
				WeixinAuthorizeService weixinAuthorizeService) {
			this.weixinAuthorizeService = weixinAuthorizeService;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getRequestArea2() {
			return requestArea2;
		}

		public void setRequestArea2(String requestArea2) {
			this.requestArea2 = requestArea2;
		}

		public String getFilePath1() {
			return filePath1;
		}

		public void setFilePath1(String filePath1) {
			this.filePath1 = filePath1;
		}

		public WeixinMediaService getWeixinMediaService() {
			return weixinMediaService;
		}

		public void setWeixinMediaService(WeixinMediaService weixinMediaService) {
			this.weixinMediaService = weixinMediaService;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public void getData(){
			util.getSignatureAlgorithm(url);
			String noncestr = util.getNoncestr();
			String ticket = util.getTicket();
			String timestamp = util.getTimestamp();
		    String signature = util.getSignature();
		    JSONObject obj = new JSONObject();
		    obj.put("noncestr", noncestr);
		    obj.put("ticket", ticket);
		    obj.put("timestamp", timestamp);
		    obj.put("signature", signature);
		    String jsonString = obj.toString();
		    HttpServletResponse response = ServletActionContext.getResponse();
		    try {
				PrintWriter out = response.getWriter();
				out.print(jsonString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public String testQrCode(){
			JSONObject result = this.weixinQrCodeService.createQrScene(300, 123);
			String ticket = result.getString("ticket");
			this.weixinQrCodeService.showQrCode("asdfas");
			return "success";
		}
		
		public String handleSubmit(){
			System.out.println(this.getRequestArea2());
			if(filePath1 != null)
				this.getWeixinMediaService().getMedia(filePath1);
			if(file != null)
			return upload();
			
			return "success";
		}
		
		public String handleAuthorize(){
			JSONObject result = this.getWeixinAuthorizeService().codeToAccessToken(code);
			System.out.println(result.toString());
			String accessToken = result.getString("access_token");
			String openId = result.getString("openid");
			JSONObject result1 = this.getWeixinAuthorizeService().getUserInfo(accessToken, openId);
			System.out.println(result1.toString());
			return "success";
		}
		
		public String upload(){
			
				System.out.println("文件名：" + fileFileName);
				System.out.println("文件类型："  + fileContentType);
			
				if(file != null){
				//文件保存目录是WebContent/file目录下
				String realpath = ServletActionContext.getServletContext().getRealPath("/file");
				System.out.println("文件的保存路径：" + realpath);
				
				//文件的后缀
				String suffix = fileFileName.substring(fileFileName.lastIndexOf("."));
				if(fileFileName.lastIndexOf(".") == -1){
					      return INPUT;
				}
				
				//上传以后，会重命名文件的名称，将其命名为全部是数字的文件名，防止可能出现的乱码.
				//当然，只是为了防止出现乱码，一般不会出现乱码
				double randomDouble = Math.random() * 10000;
				int randomInt = (int)randomDouble;
				newFileName = "new" + randomInt + suffix;
				
				File savefile = new File(new File(realpath), newFileName);
				//如果保存的路径不存在，则新建
				if(!savefile.getParentFile().exists())
					savefile.getParentFile().mkdirs();
				
				try{
					//复制文件
					FileUtils.copyFile(file, savefile);
					System.out.println("文件上传成功");
				}catch(IOException e){
					e.printStackTrace();
					System.out.println("文件上传失败");
					return INPUT;
				}
			}
				
				return SUCCESS;
		}

		public WeixinQrCodeService getWeixinQrCodeService() {
			return weixinQrCodeService;
		}

		public void setWeixinQrCodeService(WeixinQrCodeService weixinQrCodeService) {
			this.weixinQrCodeService = weixinQrCodeService;
		}
}
