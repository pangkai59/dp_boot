package net.chenlin.dp.modules.workPlanAuthorizedStrength.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 计划编制管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:13:34
 */
public class WorkPlanAuthorizedStrengthEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 计划id
	 */
	private String planId;
	
	/**
	 * 作业描述
	 */
	private String workDescribe;
	
	/**
	 * 作业开始时间
	 */
	private Date startWorkTime;
	
	/**
	 * 作业结束时间
	 */
	private Date endWorkTime;
	
	/**
	 * 作业地点
	 */
	private String workSite;
	
	/**
	 * 作业部门
	 */
	private String workDep;
	
	/**
	 * 计划类型
	 */
	private String planType;
	
	/**
	 * 状态 0:禁用，1:正常
	 */
	private Integer status;
	
	/**
	 * 审批  0未审批 1 审批
	 */
	private Integer check;
	
	/**
	 * 送审   0 未送审  1送审
	 */
	private Integer forCheck;
	
	/**
	 * 上报   0未上报 1已上报
	 */
	private Integer appear;
	
	/**
	 * 发布 0未发布 1已发布
	 */
	private Integer subscrible;
	
	/**
	 * 作业类型
	 */
	private String workType;
	
	/**
	 * 备注
	 */
	private String remark;
	
	/**
	 * 创建用户id
	 */
	private Long userIdCreate;
	
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	

	public WorkPlanAuthorizedStrengthEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	
	public String getPlanId() {
		return planId;
	}
	
	public void setWorkDescribe(String workDescribe) {
		this.workDescribe = workDescribe;
	}
	
	public String getWorkDescribe() {
		return workDescribe;
	}
	
	public void setStartWorkTime(Date startWorkTime) {
		this.startWorkTime = startWorkTime;
	}
	
	public Date getStartWorkTime() {
		return startWorkTime;
	}
	
	public void setEndWorkTime(Date endWorkTime) {
		this.endWorkTime = endWorkTime;
	}
	
	public Date getEndWorkTime() {
		return endWorkTime;
	}
	
	public void setWorkSite(String workSite) {
		this.workSite = workSite;
	}
	
	public String getWorkSite() {
		return workSite;
	}
	
	public void setWorkDep(String workDep) {
		this.workDep = workDep;
	}
	
	public String getWorkDep() {
		return workDep;
	}
	
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	
	public String getPlanType() {
		return planType;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setCheck(Integer check) {
		this.check = check;
	}
	
	public Integer getCheck() {
		return check;
	}
	
	public void setForCheck(Integer forCheck) {
		this.forCheck = forCheck;
	}
	
	public Integer getForCheck() {
		return forCheck;
	}
	
	public void setAppear(Integer appear) {
		this.appear = appear;
	}
	
	public Integer getAppear() {
		return appear;
	}
	
	public void setSubscrible(Integer subscrible) {
		this.subscrible = subscrible;
	}
	
	public Integer getSubscrible() {
		return subscrible;
	}
	
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	
	public String getWorkType() {
		return workType;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setUserIdCreate(Long userIdCreate) {
		this.userIdCreate = userIdCreate;
	}
	
	public Long getUserIdCreate() {
		return userIdCreate;
	}
	
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	
	public Date getGmtCreate() {
		return gmtCreate;
	}
	
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	
	public Date getGmtModified() {
		return gmtModified;
	}
	
}
