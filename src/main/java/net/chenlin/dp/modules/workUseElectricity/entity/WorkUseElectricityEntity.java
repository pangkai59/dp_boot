package net.chenlin.dp.modules.workUseElectricity.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 停送电管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:33:16
 */
public class WorkUseElectricityEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 停送电单名称
	 */
	private String userElectricityName;
	
	/**
	 * 停送电区域
	 */
	private String userElectricitySite;
	
	/**
	 * 停送电开始时间
	 */
	private Date userElectricityStartTime;
	
	/**
	 * 停送电结束时间
	 */
	private String userElectricityEndTime;
	
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
	

	public WorkUseElectricityEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setUserElectricityName(String userElectricityName) {
		this.userElectricityName = userElectricityName;
	}
	
	public String getUserElectricityName() {
		return userElectricityName;
	}
	
	public void setUserElectricitySite(String userElectricitySite) {
		this.userElectricitySite = userElectricitySite;
	}
	
	public String getUserElectricitySite() {
		return userElectricitySite;
	}
	
	public void setUserElectricityStartTime(Date userElectricityStartTime) {
		this.userElectricityStartTime = userElectricityStartTime;
	}
	
	public Date getUserElectricityStartTime() {
		return userElectricityStartTime;
	}
	
	public void setUserElectricityEndTime(String userElectricityEndTime) {
		this.userElectricityEndTime = userElectricityEndTime;
	}
	
	public String getUserElectricityEndTime() {
		return userElectricityEndTime;
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
