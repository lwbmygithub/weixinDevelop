package com.sunwah.baseapp.weixin.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;


import com.sunwah.baseapp.weixin.constant.UrlConstant;
import com.sunwah.baseapp.weixin.model.Menu;
import com.sunwah.baseapp.weixin.util.WeixinUtil;

public class WeixinMenuServiceImpl implements WeixinMenuService {
	private MenuService menuService;
	
	

	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	private String CreateMenu(String jsonMenu) {
		// TODO Auto-generated method stub
		 String resultStr = "";  
	        // 调用接口获取token  
	        String token = WeixinUtil.getToken();
	       // System.out.println("-----------------------access_token:" + token + "----------------") ;
	        if (token != null) {  
	            // 调用接口创建菜单  
	            int result = createMenu(jsonMenu, token);  
	            // 判断菜单创建结果  
	            if (0 == result) {  
	                resultStr = "菜单创建成功";  
	            } else {  
	                resultStr = "菜单创建失败，错误码：" + result;  
	            }  
	        }  
	  
	        return resultStr;  
	}

	/** 
     * 创建菜单 
     *  
     * @param jsonMenu 
     *            菜单的json格式 
     * @param accessToken 
     *            有效的access_token 
     * @return 0表示成功，其他值表示失败 
     */  
    public static int createMenu(String jsonMenu, String accessToken) {  
  
        int result = 0;  
        // 拼装创建菜单的url  
        String url = UrlConstant.MENU_CREATE.replace("ACCESS_TOKEN", accessToken);  
        // 调用接口创建菜单  
        JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", jsonMenu);  
  
        if (null != jsonObject) {  
            if (0 != jsonObject.getInt("errcode")) {  
                result = jsonObject.getInt("errcode");  
            }  
        }  
  
        return result;  
    }  

	public String deleteMenu() {
		// TODO Auto-generated method stub
		 String resultStr = "";  
	      // 调用接口获取token  
	      String token = WeixinUtil.getToken();
	     
	      if (token != null) {  
	            // 调用接口创建菜单  
	            int result = deleteMenu(token);  
	            // 判断菜单创建结果  
	            if (0 == result) {  
	                resultStr = "菜单删除成功";  
	            } else {  
	                resultStr = "菜单删除失败，错误码：" + result;  
	            }  
	        }  
	  
	        return resultStr;  
	} 
	
	public static int deleteMenu(String token){
		 int result = 0;  
	        // 拼装创建菜单的url  
	        String url = UrlConstant.MENU_DELETE.replace("ACCESS_TOKEN", token);  
	        // 调用接口创建菜单  
	        JSONObject jsonObject = WeixinUtil.httpRequest(url, "GET", null);  
	  
	        if (null != jsonObject) {  
	            if (0 != jsonObject.getInt("errcode")) {  
	                result = jsonObject.getInt("errcode");  
	            }  
	        }  
	  
	        return result;  
	}

	public String CreatePersonalMenu(String jsonMenu) {
		// TODO Auto-generated method stub
		 String resultStr = "";  
	        // 调用接口获取token  
	        String token = WeixinUtil.getToken();
	       // System.out.println("-----------------------access_token:" + token + "----------------") ;
	        if (token != null) {  
	            // 调用接口创建菜单  
	            int result = CreatePersonalMenu(jsonMenu, token);  
	            // 判断菜单创建结果  
	            if (0 == result) {  
	                resultStr = "个性菜单创建成功";  
	            } else {  
	                resultStr = "个性菜单创建失败，错误码：" + result;  
	            }  
	        }  
	  
	        return resultStr;  
	}
	
	public static int CreatePersonalMenu(String jsonMenu, String token){
		 int result = 0;  
	        // 拼装创建菜单的url  
	        String url = UrlConstant.MENU_PERSONAL_CREATE.replace("ACCESS_TOKEN", token);  
	        // 调用接口创建菜单  
	        JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", jsonMenu);  
	        
	        try{
	        if (null != jsonObject) {  
	            if (0 != jsonObject.getInt("errcode")) {  
	                result = jsonObject.getInt("errcode");  
	            }  
	        }  }catch(Exception e){
	        	
	        }
	  
	        return result;  
	}

	//根据数据库生成菜单
	@Override
	public String CreateMenu(){
		List<Menu> allMenus = this.menuService.getMenuByOpenId("origin");
		List<Menu> FirstLevelMenus = new ArrayList<Menu>();
		List<Menu> SecondLevelMenus = new ArrayList<Menu>();
		
		//将菜单分层级
		for(int i=0;i<allMenus.size();i++){
			Menu aMenu = allMenus.get(i);
			if(aMenu.getLevel() == 1){
				FirstLevelMenus.add(aMenu);
			}else if(aMenu.getLevel() == 2){
				SecondLevelMenus.add(aMenu);
			}
		}
		
		//将一级菜单进行排序
		Collections.sort(FirstLevelMenus);
		
	    //将一级菜单封装json
		List<Map> fmenuMapList = new ArrayList<Map>();
		for(int i=0;i<FirstLevelMenus.size();i++){
			Map aMenuMap = new HashMap();
			aMenuMap.put("name",  FirstLevelMenus.get(i).getName());
			aMenuMap.put("key", FirstLevelMenus.get(i).getKey());
			aMenuMap.put("type", FirstLevelMenus.get(i).getType());
			aMenuMap.put("url", FirstLevelMenus.get(i).getUrl());
			List<Map> subMenuMapList = getSubMenuList(FirstLevelMenus.get(i).getKey(), SecondLevelMenus);
			aMenuMap.put("sub_button", subMenuMapList);
			fmenuMapList.add(aMenuMap);
		}
		
		//最终json Map
		Map menuMap = new HashMap();
		menuMap.put("button", fmenuMapList);
		
		//将map 转换成json
		JSONObject json = JSONObject.fromObject(menuMap);
		// 生成json String
		String jsonString = json.toString();
		
		System.out.println(deleteMenu());
		System.out.println(CreateMenu(jsonString));
		return "success";
	}
	
	
	// 获取某个key值一级菜单的子菜单Map List
	private List<Map> getSubMenuList(String key, List<Menu> secondLevelMenus ){
		
		//根据一级菜单的key获取它的子菜单
		List<Menu> subMenuList = new ArrayList<Menu>();
		for(int i=0; i< secondLevelMenus.size(); i++){
				if(secondLevelMenus.get(i).getParentKey().equals(key)){
					 subMenuList.add(secondLevelMenus.get(i));
				}
		}
		//将子菜单排序
        Collections.sort(subMenuList);
        
        //获取子菜单Map列表（用来转换成json）
		List<Map> subMenuMapList = new ArrayList<Map>();
		for(int i=0;i<subMenuList.size();i++){
				Map aMenuMap = new HashMap();
				aMenuMap.put("name",  subMenuList.get(i).getName());
				aMenuMap.put("key", subMenuList.get(i).getKey());
				aMenuMap.put("type", subMenuList.get(i).getType());
				aMenuMap.put("url", subMenuList.get(i).getUrl());
				subMenuMapList .add(aMenuMap);
			}
			
			return subMenuMapList;
		}

	@Override
	public String CreatePersonalMenu() {
		// TODO Auto-generated method stub
		List<Menu> allMenus = this.menuService.getMenuByOpenId("内部人员");
		List<Menu> FirstLevelMenus = new ArrayList<Menu>();
		List<Menu> SecondLevelMenus = new ArrayList<Menu>();
		
		//将菜单分层级
		for(int i=0;i<allMenus.size();i++){
			Menu aMenu = allMenus.get(i);
			if(aMenu.getLevel() == 1){
				FirstLevelMenus.add(aMenu);
			}else if(aMenu.getLevel() == 2){
				SecondLevelMenus.add(aMenu);
			}
		}
		
		//将一级菜单进行排序
		Collections.sort(FirstLevelMenus);
		
	    //将一级菜单封装json
		List<Map> fmenuMapList = new ArrayList<Map>();
		for(int i=0;i<FirstLevelMenus.size();i++){
			Map aMenuMap = new HashMap();
			aMenuMap.put("name",  FirstLevelMenus.get(i).getName());
			aMenuMap.put("key", FirstLevelMenus.get(i).getKey());
			aMenuMap.put("type", FirstLevelMenus.get(i).getType());
			aMenuMap.put("url", FirstLevelMenus.get(i).getUrl());
			List<Map> subMenuMapList = getSubMenuList(FirstLevelMenus.get(i).getKey(), SecondLevelMenus);
			aMenuMap.put("sub_button", subMenuMapList);
			fmenuMapList.add(aMenuMap);
		}
		
		//最终json Map
		Map menuMap = new HashMap();
		menuMap.put("button", fmenuMapList);
		
		Map personalMap = new HashMap();
		personalMap.put("tag_id", 100);
		
		menuMap.put("matchrule", personalMap);
		
		//将map 转换成json
		JSONObject json = JSONObject.fromObject(menuMap);
		// 生成json String
		String jsonString = json.toString();
		
		System.out.println(CreatePersonalMenu(jsonString));
		return "success";
	}
}
