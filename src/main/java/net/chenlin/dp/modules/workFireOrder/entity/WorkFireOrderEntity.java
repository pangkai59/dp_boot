package net.chenlin.dp.modules.workFireOrder.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
public class WorkFireOrderEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 动火申请单名称
	 */
	private String fireOrderName;
	
	/**
	 * 施工计划
	 */
	private String fireOrderPlanName;
	
	/**
	 * 开始时间
	 */
	private Date fireOrderStartTime;
	
	/**
	 * 结束时间
	 */
	private Date fireOrderEndTime;
	
	/**
	 * 动火等级
	 */
	private String fireOrderLevel;
	
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
	

	public WorkFireOrderEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setFireOrderName(String fireOrderName) {
		this.fireOrderName = fireOrderName;
	}
	
	public String getFireOrderName() {
		return fireOrderName;
	}
	
	public void setFireOrderPlanName(String fireOrderPlanName) {
		this.fireOrderPlanName = fireOrderPlanName;
	}
	
	public String getFireOrderPlanName() {
		return fireOrderPlanName;
	}
	
	public void setFireOrderStartTime(Date fireOrderStartTime) {
		this.fireOrderStartTime = fireOrderStartTime;
	}
	
	public Date getFireOrderStartTime() {
		return fireOrderStartTime;
	}
	
	public void setFireOrderEndTime(Date fireOrderEndTime) {
		this.fireOrderEndTime = fireOrderEndTime;
	}
	
	public Date getFireOrderEndTime() {
		return fireOrderEndTime;
	}
	
	public void setFireOrderLevel(String fireOrderLevel) {
		this.fireOrderLevel = fireOrderLevel;
	}
	
	public String getFireOrderLevel() {
		return fireOrderLevel;
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
