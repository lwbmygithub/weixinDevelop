package com.sunwah.baseapp.common;

/**
 * 字典数据常量类
 * 
 * @author MARK 
 * 
 */
public final class DictionaryConstants {

	/** ---------------------是否发布---------------------- */
	public static final String IS_PUBLISH_DICT_TYPE_CODE = "IS_PUBLISH";
	public static final String IS_PUBLISH_Y = "Y";
	public static final String IS_PUBLISH_N = "N";

	/** ---------------------访问级别---------------------- */
	public static final String ACCESS_LEVEL_DICT_TYPE_CODE = "ACCESS_LEVEL";
	public static final String ACCESS_LEVEL_PUBLIC = "PUBLIC";
	public static final String ACCESS_LEVEL_REGISTERED = "REGISTERED";

	/** ---------------------状态---------------------- */
	public static final String STATE_DICT_TYPE_CODE = "STATE";
	public static final String STATE_ENABLED = "ENABLED";
	public static final String STATE_DISABLED = "DISABLED";

	/** ---------------------在线状态---------------------- */
	public static final String IS_ON_LINE_DICT_TYPE_CODE = "IS_ON_LINE";
	public static final String IS_ON_LINE_Y = "Y";
	public static final String IS_ON_LINE_N = "N";

	/** ---------------------功能类型---------------------- */
	public static final String FUNCTION_TYPE_DICT_TYPE_CODE = "FUNCTION_TYPE";
	public static final String FUNCTION_TYPE_FOLDER = "FOLDER";
	public static final String FUNCTION_TYPE_MENU = "MENU";
	public static final String FUNCTION_TYPE_RESOURCE = "RESOURCE";

	/** ---------------------功能级别---------------------- */
	public static final String FUNCTION_LEVEL_DICT_TYPE_CODE = "FUNCTION_LEVEL";
	public static final String FUNCTION_LEVEL_ZERO = "0";
	public static final String FUNCTION_LEVEL_ONE = "1";
	public static final String FUNCTION_LEVEL_TWO = "2";
	public static final String FUNCTION_LEVEL_THREE = "3";
	public static final String FUNCTION_LEVEL_FOUR = "4";
	
	/** ---------------------移动执法权限---------------------- */
	public static final String MOBILE_EXECUTE_PRIVATE_CODE = "MOBILE_EXECUTE";
	public static final String MOBILE_EXECUTE_PRIVATE_Y = "Y";
	public static final String MOBILE_EXECUTE_PRIVATE_N = "N";
	
	/** ---------------------企业信息---------------------- */
	/** -----CORPORATION--START------- */
	/** --------企业基本信息字典------------ */
	public static final String CORPORATION_TYPE_DICT_TYPE_CODE = "COR_TYPE";
	public static final String TOPIC_INFO_DICT_TYPE_CODE = "TOPIC_INFO";
	public static final String ECONOMY_TYPE_DICT_TYPE_CODE = "ECONOMY_TYPE";
	public static final String SECURITY_SUPERVISE_GRADE_DICT_TYPE_CODE = "SECURITY_SUPERVISE_GRADE";	
	public static final String PERSONNEL_TYPE_DICT_TYPE_CODE="PERSONNEL_TYPE";
	public static final String CERTIFICATE_NAME_CODE="CERTIFICATE_NAME";	//证书名称
	public static final String RISK_GRADE_DICT_TYPE_CODE="RISK_GRADE";
	public static final String COMPANY_RANGE_DICT_TYPE_CODE="COMPANY_RANGE_TYPE";
	public static final String GOV_RANGE_DICT_TYPE_CODE="GOV_RANGE_TYPE";
	public static final String PER_TYPE_DICT_TYPE_CODE="PER_TYPE";
	public static final String EQUIPMENT_NAME_TYPE_DICT_TYPE_CODE="EQUIPMENT_NAME_TYPE";
	public static final String CHEMICAL_AREA_DICT_TYPE_CODE="CHEMICAL_AREA";
	public static final String EVA_GRADE_DICT_TYPE_CODE="EVA_GRADE";
	public static final String UPDATE_WEEKLY_DICT_TYPE_CODE = "UPDATE_WEEKLY";
	public static final String UPDATE_WEEKLY_YES = "YES";
	public static final String UPDATE_WEEKLY_NO = "NO";
	public static final String SAFETY_TYPE_CODE="SAFETY_PEOPLE_TYPE";
	public static final String SAFETY_TYPE_ONE = "1";
	public static final String SAFETY_TYPE_TWO = "2";
	public static final String LETEER_NAME_CODE="LETTER_TYPE";
	public static final String COR_OTHER_TYPE_CODE="COR_OTHER_TYPE";//企业附属类型
	public static final String SAFETY_PRODUCT_RULE_CODE = "SAFETY_PRODUCT_RULE";
	public static final String EVA_DEPT_DICT_TYPE_CODE="EVA_DEPT";	//FF 2010-12-2 评估单位
	public static final String HAZARD_FACTOR_TYPE_CODE="HAZARD_FACTOR_TYPE";	//FF 2010-12-4 危害因素类别
	public static final String IS_RECTIFY_DICT_TYPE_CODE="IS_RECTIFY";			//FF 2010-12-4 是否完成整改
	 /** --------应急预案-评价和预案状态------------ */
	public static final String EM_TYPE_DICT_TYPE_CODE="EM_TYPE";
	public static final String EM_MODE_DICT_TYPE_CODE="EM_MODE";
	public static final String SECU_TYPE_DICT_TYPE_CODE="SECU_TYPE";
	/**-----------------应急设备---------------------------*/
	public static final String EM_EQUIPMENT_TYPE_CODE="EM_EQUIPMENT_TYPE";
	public static final String SPECIAL_EQUIPMENT_CODE="SPECIAL_EQUIPMENT";
	/**-----------------应急专家职称-----------------------*/
	public static final String EXPERT_TITLE_CODE="EXPERT_TITLE";
	/**-------------------性别-------------------------------*/
	public static final String SEX_CODE="SEX";
	/**-------------------学历-------------------------------*/
	public static final String EDUCATION_LEVEL_CODE="EDUCATION_LEVEL";
	/**-------------------队伍类型--------------------*/
	public static final String EM_TEAM_TYPE_CODE="EM_TEAM_TYPE";
	/** ---------安全检查-安全隐患状态------------ */
	public static final String COMPLETE_STATUS_DICT_TYPE_CODE="COMPLETE_STATUS";
	public static final String HIDDEN_TRO_STATE_DICT_TYPE_CODE="HIDDEN_TRO_STATE";
	public static final String HIDDEN_TRO_STATE_YES="YES";
	public static final String HIDDEN_TRO_STATE_NO="NO";
	/**-------------------------安监人员--------------------------------*/
	public static final String LAW_ENFORCEMENT_FLAG_CODE="LAW_ENFORCEMENT_FLAG";	//FF 2010-12-8 是否为执法人员
	public static final String LAW_ENFORCEMENT_FLAG_Y = "Y";	//是执法人员
	public static final String LAW_ENFORCEMENT_FLAG_N = "N";	//不是执法人员
	/**-----------------检查登记-隐患类型-----------------------*/
	public static final String HIDDEN_TRO_TYPE_CODE="HIDDEN_TRO_TYPE";
	/** ---------设备设施-是否构成重大危险源状态------------ */
	public static final String DANGER_STATE_DICT_TYPE_CODE="DANGER_STATE";
	public static final String DANGER_STATE_YES="YES";
	public static final String DANGER_STATE_NO="NO";
	/** ---------危险化学品-有无危险化学品状态------------ */
	public static final String DAN_STATUS_DICT_TYPE_CODE="DAN_STATUS";
	public static final String DAN_STATUS_YES="YES";
	public static final String DAN_STATUS_NO="NO";
	public static final String MATER_PRO_DICT_TYPE_CODE="MATER_PRO";
	public static final String MATER_PRO_TWO_DICT_TYPE_CODE="MATER_PRO_TWO";
	public static final String DAN_TYPE_DICT_TYPE_CODE="DAN_TYPE";
	/** ---------许可证照信息-有效期限状态------------ */
	public static final String TERM_STATE_DICT_TYPE_CODE="TERM_STATE";
	public static final String TERM_STATE_YES="YES";
	public static final String TERM_STATE_NO="NO";
	/** ---------持证上岗信息-有效期限状态------------ */
	public static final String TERM_STATES_DICT_TYPE_CODE="TERM_STATES";
	public static final String TERM_STATES_YES="YES";
	public static final String TERM_STATES_NO="NO";
	/**-----CORPORATION--END------- */
	
	/** ---------------------反馈类型---------------------- */
	public static final String CONTENT_FEEDBACK_TYPE_CODE = "FEEDBACK_TYPE";
	public static final String CONTENT_FEEDBACK_TYPE_ZERO = "0";
	public static final String CONTENT_FEEDBACK_TYPE_ONE = "1";
	public static final String CONTENT_FEEDBACK_TYPE_TWO = "2";
	public static final String CONTENT_FEEDBACK_TYPE_THREE = "3";
	/** ---------------------域类型---------------------- */
	public static final String REALM_TYPE_DICT_TYPE_CODE = "REALM_TYPE";
	public static final String REALM_TYPE_ZERO = "0";
	public static final String REALM_TYPE_ONE = "1";
	public static final String REALM_TYPE_TWO = "2";
	public static final String REALM_TYPE_THREE = "3";
	
	/** ---------------------部门类型---------------------- */
	public static final String DEPT_TYPE_DICT_TYPE_CODE = "DEPT_TYPE";
	public static final String DEPT_TYPE_ONE = "TYPE1";
	public static final String DEPT_TYPE_TWO = "TYPE2";
	public static final String DEPT_TYPE_THREE = "TYPE3";
	
	/** ---------------------反馈管理---------------------- */
	public static final String FEEDBACK_STATUS_DICT_TYPE_CODE = "FEEDBACK_STATUS";
	public static final String ROLE_DICT_TYPE_CODE = "ROLE";
	
	/** ---------------------案件管理---------------------- */
	public static final String CASES_TYPE_DICT_TYPE_CODE = "CASES_TYPE";
	public static final String CASES_STATUS_DICT_TYPE_CODE = "CASES_STATUS";
	
	/** ---------------------整改登记管理---------------------- */
	public static final String CHECK_STATUS_DICT_TYPE_CODE = "CHECK_STATUS";
	public static final String CHECK_ITEM_STATUS_DICT_TYPE_CODE = "CHECK_ITEM_STATUS";
	public static final String CHECK_INFO_STATUS_DICT_TYPE_CODE = "CHECK_INFO_STATUS";

	/** ---------------------短信来源---------------------- */
	public static final String MESSAGE_SOURCE_DICT_TYPE_CODE = "MESSAGE_SOURCE";
	public static final String MESSAGE_SOURCE_ZERO = "0";
	public static final String MESSAGE_SOURCE_ONE = "1";
	public static final String MESSAGE_SOURCE_TWO = "2";
	public static final String MESSAGE_SOURCE_THREE = "3";
	/** ---------------------短信发送标志---------------------- */
	public static final String SEND_FLAG_DICT_TYPE_CODE = "SEND_FLAG";
	public static final String SEND_FLAG_ZERO = "0";
	public static final String SEND_FLAG_ONE = "1";
	public static final String SEND_FLAG_TWO = "2";
	public static final String SEND_FLAG_THREE = "3";
	/** ---------------------企业性质---------------------- */
	public static final String COR_PROPERTY_DICT_TYPE_CODE = "COR_PROPERTY";
	public static final String COR_PROPERTY_ZERO = "0";
	public static final String COR_PROPERTY_ONE = "1";
    public static final String COR_PROPERTY_TWO = "2";
    
    /** ---------------------企业性质---------------------- */
    public static final String PEOPLE_POST_DICT_TYPE_CODE = "GOV_PEOPLE_POST";
    /**-----------------作业岗位------------**/
	public static final String WORK_STATION_DICT_TYPE_CODE ="WORK_STATION";
	/**------------------外来文件上传来文单位----------**/
	public static final String DOCUMENT_ADD_DICT_TYPE_CODE="DOCUMENT_ADD";
	
	/**--------------------------来文管理（江门应急）-----------------------------------*/
	public static final String DOCUMENT_STATUS_CODE="DOCUMENT_STATUS";
	/**-------------------印发文件上传添加文件号类型-------------------**/
	public static final String DOC_NUMBER_TYPE_DICT_TYPE_CODE="DOC_NUMBER_TYPE";
    /** ---------------------文书管理---------------------- */
	public static final String WRIT_FROM_DICT_TYPE_CODE = "WRIT_FROM";
	/** ---------------------整改状态---------------------- */
	public static final String RECTIFY_STATUS_CODE="RECTIFY_STATUS";
    /**------------------------危化类型---------------------**/
	public static final String DAN_CHEMICAL_DICT_TYPE ="CHEMICAL_TYPE";
	/**------------------------证照名称---------------------------------**/
	public static final String LICENSE_NAME_DICT_TYPE_CODE="LICENSE_NAME";
	 /**------------------------周期性企业检查规则状态---------------------**/
	public static final String RULE_STATUS_DICT_TYPE_CODE ="RULE_STATUS";
	public static final String RULE_STATUS_CODE_ZERO ="0";
	public static final String RULE_STATUS_CODE_ONE ="1";
	 /**------------------------周期性企业检查任务批次状态---------------------**/
	public static final String BATCH_STATUS_DICT_TYPE_CODE ="BATCH_STATUS";
	public static final String BATCH_STATUS_CODE_ZERO ="0";
	public static final String BATCH_STATUS_CODE_ONE ="1";
	public static final String BATCH_STATUS_CODE_TWO ="2";
	/**------------------------企业检查状态---------------------**/
	public static final String COR_CHECK_STATUS_DICT_TYPE_CODE ="COR_CHECK_STATUS";
	public static final String COR_CHECK_STATU_CODE_ZERO ="0";
	public static final String COR_CHECK_STATU_CODE_ONE ="1";
	/**------------------------分组状态---------------------**/
	public static final String SELECT_STATUS_DICT_TYPE_CODE ="SELECT_STATUS";
	public static final String SELECT_STATU_CODE_ZERO ="0";
	public static final String SELECT_STATU_CODE_ONE ="1";
	/**------------------------外来文件处理--缓急程度---------------------**/
	public static final String EMERGENCY_DICT_TYPE_CODE ="EMERGENCY_LEVEL";
	/**-------------------------外来文件传阅性-----------------------**/
	public static final String DOC_ENCYCLIC_TYPE_CODE="DOC_ENCYCLIC_TYPE";
	/**------------------------印发文件处理--发文单位---------------------**/
	public static final String PRINT_DOC_UINT_FROM_DICT_TYPE_CODE ="PRINT_DOC_UNIT_FROM";
	public static final String DOCUMENT_TYPE_CODE = "DOCUMENT_TYPE";
	public static final String REVIEW_STATUS_CODE="REVIEW_STATUS";
	/**------------------------规章制度--所属类型---------------------**/
	public static final String OWNER_TYPE_CODE="OWNER_TYPE";
	/**-----------------------------个人通讯录人员类型---------------------------------*/
	public static final String COMMUNITY_PEOPLE_TYPE_CODE="COMMUNITY_PEOPLE_TYPE";
	/**--------------------------------------区域通用通讯录类型-----------------------------------------*/
	public static final String REALM_GROUP_TYPE_CODE ="REALM_GROUP_TYPE";
	public static final String ADDRESS_PEOPLE_TYPE_CODE="ADDRESS_PEOPLE_TYPE";
	
	/**------------------------意见反馈--是否处理---------------------**/
	public static final String OPINIONS_HANDLE_STATE_CODE="OPINIONS_HANDLE_STATE";
	public static final String DEAL_STATUS_CODE = "DEAL_STATUS";
	
	/** -----------------------应急专家类型  Richard 2011年1月14日------------------------------ */
	public static final String EMERGENCY_EXPERT_TYPE_CODE="EXPERT_TYPE";
	
	
	
	/** ------------------------FF 2011-1-6 应急资源、队伍------------------------ **/
	/** ---应急资源级别--- */
    public static final String EMERGENCY_RESOURCES_LEVEL_DICT_TYPE_CODE ="CLASS_LEVEL";
    public static final String EMERGENCY_RESOURCES_UNIT_TYPE = "UNIT_TYPE"; 
    public static final String EMERGENCY_RESOURCES_DICT_TYPE_CODE = "TYPE_NAME";
    public static final String EMER_RESOURCE_STATE_ENABLED = "ENABLED";
    /** ---应急资源类型--- */
	public static final String EMERGENCY_RESOURCE_DICT_TYPE_CODE = "TYPE_ID";
	public static final String EMERGENCY_RESOURCE_TYPE_FOLDER = "FOLDER";
	public static final String EMERGENCY_RESOURCE_TYPE_MENU = "MENU";
	public static final String EMERGENCY_RESOURCE_TYPE_RESOURCE = "RESOURCE";
	
	/** ---应急救援队伍类型 --- */
	public static final String EM_SUCCOR_TYPE_CODE="EM_SUCCOR_TYPE";
	public static final String TEAM_OWNER_TYPE_CODE="TEAM_OWNER_TYPE";
	/** ---资源、专家所属类型 --- */
	public static final String EXPERT_OWNER_CODE ="OWNER_TYPE";		//FF 2009-6-12 专家所属
	public static final String RESOURCE_OWNER_CODE = "OWNER_TYPE";	//FF 2009-6-12 资源所属
	/** ---应急仓库 ---*/
	public static final String DEPOT_OWNER_CODE="DEPOT_OWNER";
	/** ---化学品类型 ---*/
	public static final String CHEMICAL_CATEGORY_CODE="CHEMICAL_CATEGORY";
	/** ---应急预案类型 ---*/
	public static final String ER_PLANNING_TYPE_CODE="ER_PLANNING_TYPE";
	
	public static final String REPORT_AGING_CODE="REPORT_AGING";
	
	public static final String EVENT_LEVEL_CODE="EVENT_LEVEL";
	
    /** ------------------------FF 2011-1-6 应急资源、队伍------------------------ **/
	/**----------------------------------避难场所 FF 2009-11-11------------------*/
	public static final String SHELTER_TYPE_CODE = "SHELTER_TYPE";
	public static final String SHELTER_OWNER_CODE="SHELTER_OWNER";
	
	/**------------------------------配置专家学历和性别---------------------------------*/
	public static final String EDUCATION_BACKGROUND_CODE="EDUCATION_BACKGROUND";  
	public static final String HEALTH_CONDITION_CODE = "HEALTH_CONDITION";		//FF 2009-12-17 专家健康状况
	public static final String POSITIONAL_TITLE_CODE = "POSITIONAL_TITLE";		//FF 2009-12-17 专家职称
	public static final String WORK_MAJOR_CODE = "WORK_MAJOR";					//FF 2009-12-18 专家专业领域
	
	public static final String EM_CASE_STATUS_CODE="EM_CASE_STATUS";
	
	public static final String EM_CASE_TYPE_CODE="EM_CASE_TYPE";
	
	public static final String EM_CASE_LEVEL_CODE="EM_CASE_LEVEL";
	
	public static final String EVENT_SOURCE_ID_CODE="EVENT_SOURCE_ID";
	
	public static final String RECEIVE_DOC_CODE_CODE="RECEIVE_DOC_CODE";
	
	public static final String ONDUTY_LOG_STATUS_CODE="ONDUTY_LOG_STATUS";
	
	public static final String ER_PLANNING_STATUS_CODE="ER_PLANNING_STATUS";     //应急预案状态
	
	public static final String TO_DO_EVENT_TYPE_CODE="TO_DO_EVENT_TYPE";
	public static final String PROVINCE_REPORT_SECRET_LEVEL_CODE="PROVINCE_REPORT_SECRET_LEVEL";       //报省信息-秘密等级
	public static final String TEMPLATE_TYPE_DICT_TYPE_CODE = "TEMPLATE_TYPE";//模板种类
	public static final String TEMPLATE_TYPE_CODE_EVENT ="EVENT_TEMPLATE";
	public static final String OPERATE_TYPE_DICT_TYPE_CODE = "OPERATE_TYPE";//操作类型
	public static final String OPERATE_TYPE_CODE_INFO_APPROVE ="INFO_APPROVE";//信息呈批
	public static final String OPERATE_TYPE_CODE_PROVINCE_INFO ="PROVINCE_INFO";//信息专报正文
	public static final String OPERATE_TYPE_CODE_READ_INFO ="READ_INFO";//呈阅
	public static final String OPERATE_TYPE_CODE_DOCUMENT_DEAL="DOCUMENT_DEAL";  //文件处理
	public static final String OPERATE_TYPE_CODE_PRO_INFO_DRAFT="PRO_INFO_DRAFT";  //信息专报拟稿
	
	public static final String APP_PROGRESS_STATUS_CODE="APP_PROGRESS_STATUS";
	
	public static final String DUTY_TYPE_DICT_TYPE_CODE ="DUTY_TYPE";//值班类型
	public static final String DUTY_TYPE_NORMAL_TYPE ="1";//正班类型
	
	
	public static final String IS_VALID ="IS_VALID";//是否有效
	public static final String IS_VALID_Y ="Y";//是否有效
	
	public static final String APPROVED_YN ="APPROVED_YN";//是否需要审核，Y-需要，N-不需要 Mazole 2011-4-21
	
	public static final String EVENT_SHIFT_STATUS_CODE="EVENT_SHIFT_STATUS";
	public static final String TRANSFER_BATCH_STATUS_CODE="TRANSFER_BATCH_STATUS";
	//预案应急联络人员类型  2011-5-12
	public static final String ER_PEOPLE_DUTY="ER_PEOPLE_DUTY";
	
	//网络报送字典
	public static final String WEB_REPORT_STATUS="WEB_REPORT_STATUS";
	
	//分级字典分组类型
	public static final String GROUP_TYPE="GROUP_TYPE";
	
	//2011-07-01
	public static final String  MESSAGE_STATUS="MESSAGE_STATUS";
	public static final String  MESSAGE_PUBLIC_TYPE="MESSAGE_PUBLIC_TYPE";
}
