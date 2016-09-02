/**
 * 
 */
package com.sunwah.baseapp.common;

/**
 * 
 * Action命名常量类,用于页面上的资源(可见性)控制。
 * 
 * @author MARK
 * 
 */

public final class ActionConstants {
	/** ---------------------内容管理---------------------- */
	public static final String CONTENT_MANAGE_FIND_CONTENTS = "findContents";
	public static final String CONTENT_MANAGE_VIEW_CONTENT = "findContent";
	public static final String CONTENT_MANAGE_ADD_CONTENT = "toCreateContent"; 
	public static final String CONTENT_MANAGE_EDIT_CONTENT = "toUpdateContent";
	public static final String CONTENT_MANAGE_DELETE_CONTENT = "deleteContent";
	
	/** ---------------------内容管理---------------------- */
	public static final String CATEGORY_MANAGE_FIND_CATEGORYS = "findCategorys";
	public static final String CATEGORY_MANAGE_VIEW_CATEGORY = "findCategory";
	public static final String CATEGORY_MANAGE_ADD_CATEGORY = "toCreateCategory";
	public static final String CATEGORY_MANAGE_EDIT_CATEGORY = "toUpdateCategory";
	public static final String CATEGORY_MANAGE_DELETE_CATEGORY = "deleteCategory";

	/** ---------------------用户管理---------------------- */
	public static final String USER_MANAGE_FIND_USERS = "findUsers";
	public static final String USER_MANAGE_VIEW_USER = "findUser";
	public static final String USER_MANAGE_ADD_USER = "toCreateUser";
	public static final String USER_MANAGE_EDIT_USER = "toUpdateUser";
	public static final String USER_MANAGE_DELETE_USER = "deleteUser";
	public static final String USER_MANAGE_EDIT_PASSWORD = "toUpdatePassword";
	public static final String USER_MANAGE_DELETE_OWN = "deleteUserAction";
	

	/** ---------------------角色管理---------------------- */
	public static final String ROLE_MANAGE_FIND_ROLES = "findRoles";
	public static final String ROLE_MANAGE_VIEW_ROLE = "findRole";
	public static final String ROLE_MANAGE_ADD_ROLE = "toCreateRole";
	public static final String ROLE_MANAGE_EDIT_ROLE = "toUpdateRole";
	public static final String ROLE_MANAGE_DELETE_ROLE = "deleteRole";

	/** ---------------------功能管理---------------------- */
	public static final String FUNCTION_MANAGE_FIND_FUNCTIONS = "findFunctions";
	public static final String FUNCTION_MANAGE_VIEW_FUNCTION = "findFunction";
	public static final String FUNCTION_MANAGE_ADD_FUNCTION = "toCreateFunction";
	public static final String FUNCTION_MANAGE_EDIT_FUNCTION = "toUpdateFunction";
	public static final String FUNCTION_MANAGE_DELETE_FUNCTION = "deleteFunction";

	/** ---------------------字典配置---------------------- */
	public static final String DICT_MANAGE_FIND_DICTS = "findDicts";
	public static final String DICT_MANAGE_VIEW_DICT = "findDict";
	public static final String DICT_MANAGE_ADD_DICT = "toCreateDict";
	public static final String DICT_MANAGE_EDIT_DICT = "toUpdateDict";
	public static final String DICT_MANAGE_DELETE_DICT = "deleteDict";
	
	/** ---------------------事件管理---------------------- */
	public static final String EM_EVENT_FIND1 = "toFindEmEvents";
	public static final String EM_EVENT_VIEW1 = "findEmergencyEvent";
	public static final String EM_EVENT_UPDATE = "toUpdateEmergencyEvent";
	public static final String EM_EVENT_ADD = "toAddEmergencyEvent";
	public static final String EM_EVENT_DELETE = "deleteEmergencyEvent";
	
	/** ---------------------留言板配置---------------------- */
	public static final String MESSAGES_MANAGE_FIND_MESSAGES = "findMessages";
	public static final String MESSAGES_MANAGE_VIEW_MESSAGE = "findMessage";
	public static final String MESSAGES_MANAGE_ADD_MESSAGES = "toCreateMessage";
	public static final String MESSAGES_MANAGE_EDIT_MESSAGES = "toUpdateMessage";
	public static final String MESSAGES_MANAGE_DELETE_MESSAGES = "deleteMessage";
	
	/** ---------------------练习管理---------------------- */
	public static final String EXERCISE_MANAGE_FIND_EXERCISES = "findExercises";
	public static final String EXERCISE_MANAGE_VIEW_EXERCISE = "findExercise";
	public static final String EXERCISE_MANAGE_ADD_EXERCISE = "toCreateExercise";
	public static final String EXERCISE_MANAGE_EDIT_EXERCISE = "toUpdateExercise";
	public static final String EXERCISE_MANAGE_DELETE_EXERCISE = "deleteExercise";

	/** ---------------------企业基础信息配置---------------------- */
	public static final String CORPORATION_MANAGE_FIND_CORPORATIONS = "findCorporations";
	public static final String CORPORATION_MANAGE_VIEW_CORPORATION = "findCorporation";
	public static final String CORPORATION_MANAGE_ADD_CORPORATION = "toCreateCorporation";
	public static final String CORPORATION_MANAGE_EDIT_CORPORATION = "toUpdateCorporation";
	public static final String CORPORATION_MANAGE_DELETE_CORPORATION = "deleteCorporation";
	
	
	/** ---------------------联系人配置---------------------- */
	public static final String MANAGER_CONTACTOR_FIND_MANAGERCONTACTORS = "findManagerContactors";
	public static final String MANAGER_CONTACTOR_VIEW_MANAGERCONTACTOR = "findManagerContactor";
	public static final String MANAGER_CONTACTOR_ADD_MANAGERCONTACTOR = "toCreateManagerContactor";
	public static final String MANAGER_CONTACTOR_EDIT_MANAGERCONTACTOR = "toUpdateManagerContactor";
	public static final String MANAGER_CONTACTOR_DELETE_MANAGERCONTACTOR = "deleteManagerContactor";
	
	/** ---------------------域名管理---------------------- */
	public static final String REALM_MANAGE_FIND_REALMS = "findRealms";
	public static final String REALM_MANAGE_VIEW_REALM = "findRealm";
	public static final String REALM_MANAGE_ADD_REALM = "toCreateRealm";
	public static final String REALM_MANAGE_EDIT_REALM = "toUpdateRealm";
	public static final String REALM_MANAGE_DELETE_REALM = "deleteRealm";
	
	/** ---------------------部门管理---------------------- */
	public static final String CFDEPTW_MANAGE_FIND_CFDEPTWS = "findCfDeptWs";
	public static final String CFDEPTW_MANAGE_VIEW_CFDEPTW = "findCfDeptW";
	public static final String CFDEPTW_MANAGE_ADD_CFDEPTW = "toCreateCfDeptW";
	public static final String CFDEPTW_MANAGE_EDIT_CFDEPTW = "toUpdateCfDeptW";
	public static final String CFDEPTW_MANAGE_DELETE_CFDEPTW = "deleteCfDeptW";
	
	/** ---------------------部门类型管理---------------------- */
	public static final String DEPT_MANAGE_FIND_DEPTTYPES = "findDeptTypes";
	public static final String DEPT_MANAGE_VIEW_DEPTTYPES = "findDeptType";
	public static final String DEPT_MANAGE_ADD_DEPTTYPES = "toCreateDeptType";
	public static final String DEPT_MANAGE_EDIT_DEPTTYPES = "toUpdateDeptType";
	public static final String DEPT_MANAGE_DELETE_DEPTTYPES = "deleteDeptType";
	
	/** ---------------------政府人员管理---------------------- */
	public static final String GOVPEOPLE_MANAGE_FIND_GOVPEOPLES = "findGovPeoples";
	public static final String GOVPEOPLE_MANAGE_VIEW_GOVPEOPLE = "findGovPeople";
	public static final String GOVPEOPLE_MANAGE_ADD_GOVPEOPLE = "toCreateGovPeople";
	public static final String GOVPEOPLE_MANAGE_EDIT_GOVPEOPLE = "toUpdateGovPeople";
	public static final String GOVPEOPLE_MANAGE_DELETE_GOVPEOPLE = "deleteGovPeople";
	
	/** ---------------------案件管理---------------------- */
	public static final String CASE_MANAGE_FIND_CASES = "findCases";
	public static final String CASE_MANAGE_VIEW_CASE = "findCaseById";
	public static final String CASE_MANAGE_ADD_CASE = "toHandleCase";
	public static final String CASE_MANAGE_EDIT_CASE = "toHandleCase";
	public static final String CASE_MANAGE_DELETE_CASE = "deleteCaseList";
	
	/** ---------------------信息管理---------------------- */
	public static final String MESSAGE_MANAGE_FIND_MESSAGES = "findMessages";
	public static final String MESSAGE_MANAGE_ADD_MESSAGE = "toCreateMessage";
	
	/** ---------------------文书管理---------------------- */
	public static final String WRIT_MANAGE_FIND_CASES = "findFormatContext";
	public static final String WRIT_MANAGE_VIEW_CASE = "findFormatContextById";
	public static final String WRIT_MANAGE_DELETE_CASE = "deleteFormatContextById";
	
	/** ---------------------安监检查规则管理---------------------- */
	public static final String RULE_MANAGE_FIND_RULES = "findRules";
	public static final String RULE_MANAGE_VIEW_RULE = "findRuleDetail";
	public static final String RULE_MANAGE_ADD_RULE = "toCreateRule";
	public static final String RULE_MANAGE_EDIT_RULE = "toUpdateRule";
	public static final String RULE_MANAGE_DELETE_RULE = "deleteRule";
	
	/** ---------------------安监检查规则管理---------------------- */
	public static final String DOCUMENT_HANDLING_MANAGE_EDIT = "toUpdateDocumentHandling";
	public static final String DOCUMENT_HANDLING_MANAGE_FINDS = "findAllDocumentHandlings";
	public static final String DOCUMENT_HANDLING_MANAGE_DELETE = "delDDocumentHandling";
	
	
	/** ---------------------意见反馈管理---------------------- */
	public static final String OPINIONS_FIND = "findOpinions";
	public static final String OPINIONS_VIEW = "findAllOpinions";
	public static final String OPINIONS_ADD = "toAddOpinions";
	public static final String OPINIONS_EDIT = "toUpdateOpinions";
	public static final String OPINIONS_DELETE = "deleteOpinions";
	public static final String OPINIONS_HANDLE = "handleOpinions";
	public static final String END_QUESTION = "endQuestion";
	
	/**------------------------ FF 2011-1-19 应急预案 ----------------------**/	
	public static final String ER_PLANNING_MANAGE_FIND = "findErPlannings";
	public static final String ER_PLANNING_MANAGE_VIEW = "findErPlanning";
	public static final String ER_PLANNING_MANAGE_ADD = "toCreateErPlanning";
	public static final String ER_PLANNING_MANAGE_EDIT = "toUpdateErPlanning";
	public static final String ER_PLANNING_MANAGE_DELETE = "deleteErPlanning";
	
	
	/** --------------------------- FF 2011-1-6 应急资源、队伍模块 ----------------------------- **/
	//资源管理
	public static final String EMER_RESOURCE_MANAGE_FIND_RESOURCES = "findEmerResources";
	public static final String EMER_RESOURCE_MANAGE_VIEW_RESOURCES = "findAllCommonEmrResource";
	public static final String EMER_RESOURCE_MANAGE_ADD_RESOURCES = "findAdd";
	public static final String EMER_RESOURCE_MANAGE_EDIT_RESOURCES = "toUpdateCommonEmerResource";
	public static final String EMER_RESOURCE_MANAGE_DELETE_RESOURCES = "deleteEmerResource";
	//安监应急应急救援队伍
	public static final String SUCCOR_TEAM_MANAGE_FIND_TEAMS = "findSuccorTeams";
	public static final String SUCCOR_TEAM_MANAGE_VIEW_TEAM = "findSuccorTeam";
	public static final String SUCCOR_TEAM_MANAGE_ADD_TEAM = "toCreateSuccorTeam";
	public static final String SUCCOR_TEAM_MANAGE_EDIT_TEAM = "toUpdateSuccorTeam";
	public static final String SUCCOR_TEAM_MANAGE_DELETE_TEAM = "deleteSuccorTeam";
	//救援物资厂家
	public static final String FIND_SUPPLIERS ="findResourceSuppliers";
	public static final String SUPPLIERS_VIEW = "findResourceSupplier";
	public static final String SUPPLIERS_EDIT ="toUpdateResourceSupplier";
	public static final String SUPPLIERS_CREATE ="toCreateResourceSupplier";
	public static final String SUPPLIERS_DELETE="deleteResourceSupplier";
	//应急仓库
	public static final String DEPOT_FIND_DEPOTS = "findDepots";
	public static final String DEPOT_VIEW_DEPOT = "findDepot";
	public static final String DEPOT_ADD_DEPOT = "toCreateDepot";
	public static final String DEPOT_EDIT_DEPOT = "toUpdateDepot";
	public static final String DEPOT_DELETE_DEPOT = "deleteDepot";
	//危化信息
	public static final String CHEMICAL_MANAGE_FIND_CHEMICALS = "findChemicals";
	public static final String CHEMICAL_MANAGE_VIEW_CHEMICAL = "getChemicalById";
	public static final String CHEMICAL_MANAGE_ADD_CHEMICAL = "toCreateChemicals";
	public static final String CHEMICAL_MANAGE_EDIT_CHEMICAL = "toUpdateChemical";
	public static final String CHEMICAL_MANAGE_DELETE_CHEMICAL = "deleteChemical";
	//化学品分类信息
	public static final String FIND_CHEMICAL_CATEGORYS = "findChemicalCategorys";
	public static final String VIEW_CHEMICAL_CATEGORY = "findChemicalCategory";
	public static final String ADD_CHEMICAL_CATEGORY = "toCreateChemicalCategory";
	public static final String EDIT_CHEMI_CALCATEGORY = "toUpdateChemicalCategory";
	public static final String DELETE_CHEMICAL_CATEGORY = "deleteChemicalCategory";
	//专家账号前缀
	public static final String PREPARATION_FINDS="findsPreparation";
	public static final String PREPARATION_VIEW="preparationView";
	public static final String PREPARATION_CREATE="toCreateSystemPreparation";
	public static final String PREPARATION_UPDATE="toUpdateSystemPreparation";
	public static final String PREPARATION_DELETE="deleteSystemPreparation";
	//应急资源专家
	public static final String EMERGENCY_EXPERT_VIEW_EXPERT = "findEmergencyExpert";
	public static final String EMERGENCY_EXPERT_ADD_EXPERT = "chooseRedirect";
	public static final String EMERGENCY_EXPERT_EDIT_EXPERT = "toUpdateEmergencyExpert";
	public static final String EMERGENCY_EXPERT_DELETE_EXPERT = "deleteEmergencyExpert";
	public static final String EMERGENCY_EXPERT_FIND_EXPERTS = "findEmergencyExperts";
	/** --------------------------- FF 2011-1-6 应急资源、队伍模块 ----------------------------- **/
	/** ------------------------- Richard 2011-1-11 避难场所 -----------------------------*/
	public static final String SHELTER_FIND_SHELTERS = "findShelters";
	public static final String SHELTER_VIEW_SHELTER = "findShelter";
	public static final String SHELTER_ADD_SHELTER = "toCreateShelter";
	public static final String SHELTER_EDIT_SHELTER = "toUpdateShelter";
	public static final String SHELTER_DELETE_SHELTER = "deleteShelter";
	/**--------------------------Mazole 2011-5-30 网络报送------------------------------*/
	public static final String WEB_REPORTS_FINDS="findWebReports";
	public static final String WEB_REPORTS_VIEW="findWebReport";
	public static final String WEB_REPORTS_ADD="toCreateWebReport";
	public static final String WEB_REPORTS_EDIT="toUpdateWebReport";
	public static final String WEB_REPORTS_DELETE="deleteReceiveDocument";
	/**--------------------------Richard 2011-1-24 来信信息------------------------------*/
	public static final String DOCUMENT_FINDS="findReceiveDocuments";
	public static final String DOCUMENT_VIEW="findReceiveDocument";
	public static final String DOCUMENT_ADD="toCreateReceiveDocument";
	public static final String DOCUMENT_EDIT="toUpdateReceiveDocument";
	public static final String DOCUMENT_DELETE="deleteReceiveDocument";
	
	/** ---------------------值班表管理---------------------- */
	public static final String DUTYPLAN_MANAGE_FIND_DUTYPLAN = "findDutyPlan";
	public static final String DUTYPLAN_MANAGE_VIEW_DUTYPLAN = "viewDutyPlan";
	public static final String DUTYPLAN_MANAGE_ADD_DUTYPLAN = "toCreateDutyPlan";
	public static final String DUTYPLAN_MANAGE_EDIT_DUTYPLAN = "toUpdateDutyPlan";
	public static final String DUTYPLAN_MANAGE_DELETE_DUTYPLAN = "deleteDutyPlan";
	
	/** ---------------------事件分级标准---------------------- */
	public static final String LEVEL_STANDARD_FIND_STANDARDS = "findLevelStandards";
	public static final String LEVEL_STANDARD_VIEW_STANDARD = "findLevelStandard";
	public static final String LEVEL_STANDARD_ADD_STANDARD = "toCreateLevelStandard";
	public static final String LEVEL_STANDARD_EDIT_STANDARD = "toUpdateLevelStandard";
	public static final String LEVEL_STANDARD_DELETE_STANDARD = "deleteLevelStandard";

	/** 20110630HL*/
	public static final String InstantMessagings_VIEW = "viewinstantmessagings";
	
	public static final String FINDUSERSBYLOGINNAME = "findUsersByName";
	
	/** ---------------------Unity3D场景---------------------- */
	public static final String  SCENE_MANAGER_FIND_SCENES= "findScenes";
	public static final String  SCENE_MANAGER_VIEW_SCENE= "findScene";
	public static final String  SCENE_MANAGER_ADD_SCENE= "toCreateScene";
	public static final String  SCENE_MANAGER_EDIT_SCENE= "toUpdateScene";
	public static final String  SCENE_MANAGER_DELETE_SCENE= "deleteScene";
}
