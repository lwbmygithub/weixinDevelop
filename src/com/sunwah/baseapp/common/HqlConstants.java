/**
 * 
 */
package com.sunwah.baseapp.common;

/**
 * 
 * 定义HQL查询语句
 * 
 * @author MARK
 * 
 */
public interface HqlConstants {
	// 根据内容ID查询拥有的附件ID和名称
	String FIND_ACCESSORYS = "select a.accessoryId,a.accessoryName from Accessory a where a.content.contentId=:contentId or a.printDoc.printDocId=:printDocId or a.documentHandling.docHandlingId=:docHandlingId";
	String FIND_ACCESSORYS_LIST = "from Accessory a where a.content.contentId=:contentId";
	String FIND_FEEDBACK = "from FeedBack b where b.content.contentId=:contentId";
	String FIND_CONTENT_EXTEND = "from ContendExtend d where d.content.contentId=:contentId order by d.nameCn DESC";
	String FIND_FEEDBACK_RANGE = "from ContentExtendRange c where c.feedBack.feedBackId=:feedBackId";
	String FIND_MANAGERCONTACTOR = "from ManagerContactor m where m.corporation.corId=:corId";
	String FIND_CASE_ACCESSORYS = "select a.accessoryId,a.accessoryName from CaseAccessory a where a.caseProcedure.caseProcedureId=:caseProcedureId";
	String FIND_CASE_ACCESSORYS_LIST = "from CaseAccessory a where a.caseProcedure.caseProcedureId=:caseProcedureId";
	String FIND_DANGERSOURCES = "select e.danId,e.picName from DangerSource e where e.corporation.corId=:corId";
	String FIND_DEPARTMENTS = "from CfDeptW a where a.deptType=:deptType";
	String FIND_DEPARTMENTS_BY_DEPID = "from CfDeptW a where a.deptId=:deptId";
	String FIND_REALMS = "from Realm a where a.realmId=:realmId";
	String FIND_REG_ACCESSORYS = "select r.regAccessoryId,r.regAccessoryName from RegulationsAccessory r where r.regulations.regulationsId=:regulationsId";
	String FIND_FORM_ACCESSORYS ="select f.formAccessoryId,f.formAccessoryName from FormAccessory f where f.managerFormIssue.managerFormIssueId=:managerFormIssueId";
	String FIND_EMEVENTACCESSORY_HISTORY = "select e.emEventAccessoryHistoryId,e.emEventAccessoryName from EmEventAccessoryHistory e where e.emergencyEventHistory.eventHistoryId=:eventHistoryId";
	String FIND_OPINIONS_ACCESSORYS ="select o.opinionsAccessoryId,o.opinionsAccessoryName from OpinionsAccessory o where o.opinions.opinionsId=:opinionsId";
	//根据附件父ID查询其附件Id和名称
	String FIND_SECU_ACCESSORYS = "select s.secuAccessoryId,s.secuAccessoryName from SecuAccessory s where s.securityApp.secuId=:secuId";
	String FIND_DRI_ACCESSORYS = "select d.driAccessoryId,d.driAccessoryName from DrillingNoteAccessory d where d.drillingNote.driId=:driId";
	String FIND_INST_ACCESSORYS = "select a.instAccessoryId,a.instAccessoryName from AdminInstAccessory a where a.adminInst.instId=:instId";
	String FIND_HAZARD_CHECK_ACCESSORYS = "select H.hazardCheckAccessoryId,H.hazardCheckAccessoryName from HazardCheckAccessory H where H.occupationalHealthHazardCheck.hazardCheckId=:hazardCheckId";
	String FIND_EM_ACCESSORYS = "select e.emAccessoryId,e.emAccessoryName from EmPlanAccessory e where e.emPlan.emId=:emId";
	String FIND_COR_ADMIN_ACCESSORYS = "select c.corAdminAccessoryId,c.corAdminAccessoryName from CorAdminInfoAccessory c where c.corAdminInfo.corAdminId=:corAdminId";
	String COR_FEEDBACK_STATUS="from IndustryFeedbackTaskW I where I.contentFeedbackW.taskType=3 and I.corporation.corId=:corId";
	//根据检查内容ID查询其整改登记的信息
	String FIND_AMENDINFOS = "from AmendInfo a where a.checkInfo.checkId=:checkId";
	//根据反馈附件父ID查询其附件Id和名称
	String FIND_GOV_FEEDBACK_ACCESSORYS = "select g.govFeedbackAccessoryId,g.govFeedbackAccessoryName from GovFeedbackTaskAccessory g where g.govFeedbackTaskW.govFeedbackId=:govFeedbackId";
	String FIND_INDUSTRY_FEEDBACK_ACCESSORYS = "select i.industryFeedbackAccessoryId,i.industryFeedbackAccessoryName from IndustryFeedbackTaskAccessory i where i.industryFeedbackTaskW.industryFeedbackId=:industryFeedbackId";
	//查找文书附件
	String FIND_WRITE_ACCESSORYS = "select c.writeAccessoryId,c.writeAccessoryName from WriteAccessory c where c.caseFormatContext.formatId=:formatId";
	//检查同一个安监人员下面是否存在同个通讯组
	String FIND_SAME_GROUP="from CommunicationGroup c where c.groupName=:groupName and c.secuStaff.peopleId=:peopleId";
	//检查个人通讯录的某个通讯组下面是否存在来自部门的相同联系人
	String FIND_SAME_CFDEPT_PEOPLE="from CommunicationList c where c.communicationGroup.groupId=:groupId and c.govPeople.peopleId=:peopleId";
	//查询是否存在同组的电话 Richard
	String FIND_SAME_CELL_NUM="from CommunicationList c where c.communicationGroup.groupId=:groupId and (c.cellNumber=:cellNumber or c.govPeople.peopleId=:peopleId)";	
	//检查在区域通讯录中是否存在同一个名字的通讯组(新增时候)
	String FIND_SAME_NAME_GROUP_CREATE="from RealmPublicContGroup rp where rp.contactsName=:contactsName and rp.groupType=:groupType and rp.realm.realmId =:realmId";
	//检查在区域通讯录仲是否存在同一编码的通讯组（新增时候）
	String FIND_SAME_CODE_GROUP_CREATE="from RealmPublicContGroup rp where rp.groupCode=:groupCode and rp.groupType=:groupType and rp.realm.realmId =:realmId";
	//查找某个通讯录分组
	String FIND_REALM_GROUP="from RealmPublicContGroup rp where rp.groupId=:groupId";
	//查找某个组里面是否存在同一部门
	String FIND_SAME_DEPT_IN_GROUP="from RealmPublicContList rp where rp.cfDeptW.deptId =:deptId and rp.realmPublicContGroup.groupId =:groupId";
	//查找某个组里面是否存在同一人员
	String FIND_SAME_PEOPLE_IN_GROUP="from RealmPublicContList rp where rp.peopleId =:peopleId and rp.realmPublicContGroup.groupId =:groupId and rp.marked=:marked" ;
	//检查在区域通讯录中是否存在同一个名字的通讯组
	String FIND_SAME_NAME_GROUP="from RealmPublicContGroup rp where rp.contactsName=:contactsName and rp.groupType=:groupType and rp.realm.realmId =:realmId and rp.groupId <> :groupId";
	//检查在区域通讯录仲是否存在同一编码的通讯组
	String FIND_SAME_CODE_GROUP="from RealmPublicContGroup rp where rp.groupCode=:groupCode and rp.groupType=:groupType and rp.realm.realmId =:realmId and rp.groupId <> :groupId";
	
	/** -------FF 2011-1-6 应急资源、队伍模块 --------- **/
	String FIND_EXP_PREFIX_VALUE="from SystemPreparation s where s.prefixCode=:prefixCode";
	//根据经验ID查找附件
	String FIND_EXPERIENCE_ACCESSORYS="select e.experienceAccessoryId,e.experienceAccessoryName,e.experienceAccessoryType,e.experienceAccessorySize,e.experienceAccessoryContent from ExperienceAccessory e where e.expertExperience.expertExperienceId=:experienceId";
	//查找某个避难场所下面的附件
	String FIND_SHELTER_ACCESSORY="select s.shelterAccessoryId,s.accessoryName from ShelterAccessory s where s.shelter.shelterId =:shelterId";
	//查找应急预案附件
	String FIND_ER_PLANNING_ACCESSORY = "select e.erPlanningAcceId,e.erpAccessoryName,e.erPlanningName,e.erPlanningType from ErPlanningAccessory e where e.emergencyResponsePlanning.erPlanningId=:erPlanningId or e.deptId=:deptId" ;
	//查找来文附件 2011-5-26 去掉了select r.accessoriesId,r.accessoriesName,r.savePatch 
	String FIND_RECEIVED_DOCUMENT_ACCESSORY="from ReceivedDocumentAccessory r where r.receivedDocument.documentId =:documentId";
	
	String FIND_EMEVENTACCESSORY = "select e.emEventAccessoryId,e.emEventAccessoryName from EmEventAccessory e where e.emergencyEvent.eventId=:eventId";
	
	//根据审批人的people_id和需要审批的专报id来查找对应的审批记录
	String FIND_PRO_REPORT_APP="from ProvinceReportApprove p where p.provinceReport.reportId=:reportId and p.specifyApproveId=:specifyApproveId and p.proRepApproveDate is null";
	
	//根据审批人的people_id和需要审批的文件处理表ID来查找对应的审批记录
	String FIND_DOCUMENT_DEAL_APP="from DocumentDealApprove d where d.documentDeal.documentDealId=:documentDealId and d.specifyApproveId=:specifyApproveId and d.docRepApproveDate is null";
	//验证值班人员相同的记录是否存在
	String CHECK_DUTY_PEOPLE_EXISTS_WHEN_ADD="from DutyPlanPeopleInfo d where d.dutyPlanId =:dutyPlanId and d.peopleId =:peopleId and d.dutyType =:dutyType and d.dutyPlanTimeStart =:dutyPlanTimeStart and d.dutyPlanTimeEnd =:dutyPlanTimeEnd";
	String CHECK_DUTY_PEOPLE_EXISTS_WHEN_UPDATE="from DutyPlanPeopleInfo d where d.dutyPlanId =:dutyPlanId and d.peopleId =:peopleId and d.dutyType =:dutyType and d.dutyPlanTimeStart =:dutyPlanTimeStart and d.dutyPlanTimeEnd =:dutyPlanTimeEnd and dutyPlanPeopleId !=:dutyPlanPeopleId";
	
    //查找实时信息状态
	//String FIND_INST_MASSAGE_STATUS="from InstantMessaging m where m.insMesStatus=:insMesStatus";
}
