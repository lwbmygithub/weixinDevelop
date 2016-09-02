/**
 * 
 */
package com.sunwah.baseapp.common;

/**
 * 定义系统常量类
 * 
 * @author MARK
 * 
 */
public interface Constants {
	// 用户Session KEY
	String SESSION_USER = "user";
	// 验证码Session KEY
	String SESSION_VER_CODE = "verCode";
	// 菜单Session KEY
	String SESSION_MENU = "menu";
	// 父菜单Session KEY
	String SESSION_PARENT_MENU_ID = "parentMenuId";

	// 最大日期值
	String MAXIMAL_DATE = "2099-12-31";
	// 最大时间值
	String MAXIMAL_TIME = "23:59:59";

	// 日期格式定义
	String DATE_PATTERN = "yyyy-MM-dd";

	// 时间格式定义
	String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	// 超级用户ID
	Long ROOT_USER_ID = new Long(0);

	// 初始功能ID
	Long ROOT_FUNCTION_ID = new Long(0);

	// 每页显示最大默认数据量
	int PAGE_SIZE = 10;

	// 默认编码
	String DEFAULT_CHARACTER_ENCODING = "UTF-8";

    //上传附件最大值
	int STRUTS_MULTIPART_MAXSIZE = 5242880;
//*************** 我的企业 ***********************
	//操作员密码
	String MY_COR_PASSW="111111";
	//操作员角色
	String MY_COR_ROLE="1";
	//企业反馈状态 上报确认
	int CURRENT_STATUS=1;
//*************** 企业 ***********************
	//南沙区报表打印
	String NanShaQu_RealmId="101";
	
//*************** 信息发布_反馈范围类型 ***********************
	//企业地区
	String FEEDBACK_TYPE_COM_AREA = "1";
	//行业类型
	String FEEDBACK_TYPE_COM_INDUS = "2";
	//企业风险等级
	String FEEDBACK_TYPE_COM_RISKLEVEL = "3";
	//企业经济类型
	String FEEDBACK_TYPE_COM_ECONOMY = "4";
	//企业类型
	String FEEDBACK_TYPE_COM_ENTERPRISE = "5";
	//企业安全监察等级
	String FEEDBACK_TYPE_COM_SECULEVEL = "6";
	//所属化工区
	String FEEDBACK_TYPE_COM_CHEMICAL = "20";
	//企业人员角色
	String FEEDBACK_TYPE_COM_ROLES = "8";
	//政府部门
	String FEEDBACK_TYPE_GOV_DEPT = "7";
	//区政府领导角色
	String FEEDBACK_TYPE_GOV_LEADER_ROLES = "9";
	//区职能部门角色
	String FEEDBACK_TYPE_GOV_PEOPLE_ROLES = "10";
	//区职能部门
	String FEEDBACK_TYPE_GOV_PEOPLE_DEPT = "18";
	//街镇人员角色
	String FEEDBACK_TYPE_TOWN_ROLES = "11";
	//街镇部门
	String FEEDBACK_TYPE_TOWN_DEPT = "12";
	//区安监局领导
	String FEEDBACK_TYPE_SECU_LEADER = "13";
	//区安监局办公室
	String FEEDBACK_TYPE_SECU_OFFICE = "19";
	//区安监局综合法规科
	String FEEDBACK_TYPE_SECU_SYNTH = "14";
	//区安监局监督管理科
	String FEEDBACK_TYPE_SECU_SUPER = "15";
	//区安监局执法大队
	String FEEDBACK_TYPE_SECU_EXECU = "16";
	//区安监局小虎应急中心
	String FEEDBACK_TYPE_SECU_TIGER = "17";
	
//*************** 政府部门类型 ***********************
	//区政府领导
	String GOV_DEPT_TYPE_LEADER = "1";
	//区职能部门
	String GOV_DEPT_TYPE_FUNCTION = "2";
	//区安监局领导
	String SECU_DEPT_TYPE_LEADER = "301";
	//区安监局办公室
	String SECU_DEPT_TYPE_OFFICE = "5";
	//区安监局综合法规科
	String SECU_DEPT_TYPE_SYNTH = "302";
	//区安监局监督管理科
	String SECU_DEPT_TYPE_SUPER = "303";
	//区安监局执法大队
	String SECU_DEPT_TYPE_EXECU = "304";
	//区安监局小虎应急中心
	String SECU_DEPT_TYPE_TIGER = "305";
	//街镇部门
	String GOV_DEPT_TYPE_TOWN = "4";
	
	// 部门类型已存在
	int DEPT_TYPE_EXIST = 301;
	
	//外来文件类型Type_number
	String DOC_HANDLE_TYPE_NUM="OA01";
	//化学品分类已存在
	int CHEMICAL_CATEGORY_EXIST = 306;
	//**********应急救援队伍自服务***********
	//操作员角色
	String MY_SUCCORTEAM_ROLE="27";
	//**********专家自服务***********
	//操作员角色
	String MY_EXPERT_ROLE="27";
	
	//******************事件操作记录常量***************************
	String CREATE_DOCUMENT="新增来文";
	String CLOSE_DOCUMENT="办结来文";
	String DELETE_DOCUMENT="删除来文";
	String ONDUTY_SUCCESSION="值班接班";
	String DOCUMENT_TO_EVENT="来文转登记";
	String CREATE_EVENT="新增应急事件";
	String UPDATE_EVENT="修改应急事件";
	String CLOSE_EVENT="应急事件归档";
	String DELETE_EVENT="删除应急事件";
	String CREATE_EVENT_HISTORY="新增应急事件续报";
	String CREATE_INFO_REPORT="新增信息呈批";
	String UPDATE_INFO_REPORT="修改信息呈批";
	String DELETE_INFO_REPORT="删除信息呈批";
	String CREATE_PRO_REPORT="新增信息专报";
	String UPDATE_PRO_REPORT="修改信息专报";
	String DELETE_PRO_REPORT="删除信息专报";
	String CREATE_READ_REPORT="新增信息呈阅";
	String UPDATE_READ_REPORT="修改信息呈阅";
	String DELETE_READ_REPORT="删除信息呈阅";
	String CREATE_DOCUMENT_DEAL="新增文件处理";
	String UPDATE_DOCUMENT_DEAL="修改文件处理";
	String DELETE_DOCUMENT_DEAL="删除文件处理";
	String CREATE_DEAL_INFO="新增处置信息";
	String UPDATE_DEAL_INFO="修改处置信息";
	String DELETE_DEAL_INFO="删除处置信息";
	String CREATE_ONDUTY_LOG="新增值班日志";
	String UPDATE_ONDUTY_LOG="修改值班日志";
	String DELETE_ONDUTY_LOG="删除值班日志";
	
	 
	String DEFAULT_DUTY_START_TIME="8:15";
	String DEFAULT_DUTY_END_TIME="18:00";
	
	
	String path="/opt/school/tomcat/webapps/jm_emDuty";
	String jsonListener="/WEB-INF/classes/com/sunwah/json/action/jsonListener.class";
    String SessionListener="/WEB-INF/classes/com/sunwah/baseapp/action/QueryManageAction.class";
	String jsonAction="/WEB-INF/classes/com/sunwah/json/action/jsonListener.class";
	
	String GET_USER_BY_LOGIN_NAME="getUsreByLoginName";
}
