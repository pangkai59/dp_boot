package net.chenlin.dp.modules.workForSite.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 施工请销点表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:28:10
 */
public class WorkForSiteEntity implements Serializable {
	
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
	 * 请点单名称
	 */
	private String workForSiteName;
	
	/**
	 * 结束时间
	 */
	private Date workTime;
	
	/**
	 * 区域
	 */
	private String workArea;
	
	/**
	 * 类型
	 */
	private String workType;
	
	/**
	 * 状态 0:禁用，1:正常
	 */
	private Integer status;
	
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
	

	public WorkForSiteEntity() {
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
	
	public void setWorkForSiteName(String workForSiteName) {
		this.workForSiteName = workForSiteName;
	}
	
	public String getWorkForSiteName() {
		return workForSiteName;
	}
	
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}
	
	public Date getWorkTime() {
		return workTime;
	}
	
	public void setWorkArea(String workArea) {
		this.workArea = workArea;
	}
	
	public String getWorkArea() {
		return workArea;
	}
	
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	
	public String getWorkType() {
		return workType;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getStatus() {
		return status;
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
