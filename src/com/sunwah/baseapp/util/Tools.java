package com.sunwah.baseapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 工具类
 * 
 * @author MARK
 * 
 */
public class Tools {

	/**
	 * 
	 * 字符串转换成日期
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date stringToDate(String date, String pattern) {
		if (date == null || date.equals(""))
			return null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date result = null;
		try {
			result = format.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * 将字符串前补充指定字符为指定的长度
	 * 
	 * @param source
	 * @param cStr
	 * @param len
	 * @return
	 */
	public static String fillStr(String source, String cStr, int len) {
		int strLen = source.length();
		String ret = "";
		if (strLen > len)
			ret = source.substring(0, len);
		else {
			ret = source;
			while (strLen != len) {
				ret = cStr + ret;
				strLen = ret.length();
			}
		}

		return ret;
	}
	
	/**
	 * 
	 * 格式化日期
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Date formatDate(Date date, String pattern) {
		if (date == null || date.equals(""))
			return null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date result = null;
		try {
			result = format.parse(format.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * Description ： 格式化显示日期型数据
	 * 
	 * @param Date
	 *            dt_in ：日期型数据boolean bShowTimePart_in ： 是否显示时间部分
	 * 
	 * @return String 格式化后的日期格式
	 */
	public static String DoFormatDate(java.util.Date dt_in, String pattern) {
		if (pattern != null && !pattern.equals(""))
			return (new SimpleDateFormat(pattern)).format(dt_in);
		else
			return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(dt_in);
	}
	
	/**
	 * 处理NULL字符串
	 * 
	 * @param object
	 * @param defaultStr
	 * @return
	 */
	public static String getString(Object object, String defaultStr) {
		return ifNull(object, defaultStr).toString();
	}
	
	/**
	 * 处理NULL值
	 * 
	 * @param object
	 * @param defaultObj
	 * @return
	 */
	public static Object ifNull(Object object, Object defaultObj) {
		return object == null ? defaultObj : object;
	}
	
	/**
	 * 根据分隔符拆分字符串为LIST
	 * 
	 * @param str
	 * @param spliter
	 * @return
	 */
	public static List<String> doSplit(String str, String spliter) {
		List<String> resultList = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(str, spliter, false);
		while (st.hasMoreElements()) {
			resultList.add(st.nextToken());
		}
		return resultList;
	}
	
	//树状List转换成xml
	/**
	 * 功能：将List数据解析成xml数据
	 * 参数说明：
	 * listData 为需要转换成xml数据的列表数据
	 * rootId 为树状结构中，为顶级的节点id
	 * idFieldName 为列表数据中子id字段名
	 * parentIdFieldName 为列表数据中的父id字段名
	 * nodeName 为生成的xml的节点名称
	 * nodeAttr 为生成的xml的节点的各个属性跟对应的字段的一个JSONArray，对这个参数的结构式有一定要求的
	 * 如：String nodeAttr ="[{attr:\"dept_id\",field:\"DEPT_ID\"},{attr:\"parent_id\",field:\"PARENT_ID\"},{attr:\"name\",field:\"DEPT_NAME\"}]";
	 * 表示在生成的每个节点中会有dept_id、parent_id、name这三个属性，它们的数据来源分别是列表中的DEPT_ID、PARENT_ID和DEPT_NAME
	 * 
	 * @throws JSONException 
	 */
	public static String getListToXML(List listData,String rootId,String idFieldName,String parentIdFieldName,String nodeName,String nodeAttr) throws JSONException
	{
		String xmlStr="";
		Map objMap;
		for (Object object : listData) {
			objMap = (HashMap) object;
			if(objMap.get(idFieldName).toString().equals(rootId) && !rootId.equals("0"))
			{
				xmlStr = xmlStr + "<" + nodeName +" layout=\"bothHanging\"";
				JSONArray tagFArray = new JSONArray(nodeAttr);
		    	for(int i=0;i<tagFArray.length();i++)
		    	{
		    		JSONObject jsonObject =new JSONObject(tagFArray.get(i).toString());
		    		xmlStr = xmlStr + " " + jsonObject.get("attr").toString() + "=\"" + objMap.get(jsonObject.get("field").toString()) +"\"";
		    	}
		    	xmlStr = xmlStr + ">";
		    	for (Object obj : listData) {
		    		Map objM = (HashMap) obj;
		    		if(objM.get(parentIdFieldName)!=null && objM.get(parentIdFieldName).toString().equals(rootId))
					{
						xmlStr = xmlStr + getListToXML(listData,objM.get(idFieldName).toString(),idFieldName,parentIdFieldName,nodeName,nodeAttr);
					}
		    	}
		    	xmlStr = xmlStr + "</" + nodeName + ">";
			}
		}
		return xmlStr;
	}
	
	public static String getDayOfWeek(Date date)
	{
		final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五","星期六" };
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)-1;
		if(dayOfWeek<0)dayOfWeek=0;
		
		return dayNames[dayOfWeek];
	}
	
	/** 
	* 获得指定日期的后一天 
	* @param specifiedDay 
	* @return 
	*/ 
	public static String getSpecifiedDayAfter(String specifiedDay){ 
		Calendar c = Calendar.getInstance(); 
		Date date=null; 
		try { 
		date = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay); 
		} catch (ParseException e) { 
		e.printStackTrace(); 
		} 
		c.setTime(date); 
		int day=c.get(Calendar.DATE); 
		c.set(Calendar.DATE,day+1); 
	
		String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()); 
		return dayAfter; 
	} 
	/** 
	* 获得指定日期的年份 
	* @param specifiedDay 
	* @return int
	 * @throws ParseException 
	*/
	public static int getYearFromDate(String specifiedDay) throws ParseException
	{
		Calendar ca = Calendar.getInstance();
		ca.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay));
		return ca.get(Calendar.YEAR);
	}
}
