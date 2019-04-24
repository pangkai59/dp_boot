package net.chenlin.dp.modules.workHangGround.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 挂地线管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:25:30
 */
public class WorkHangGroundEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 停送电单名称
	 */
	private String hangGroundName;
	
	/**
	 * 停送电区域
	 */
	private String hangGroundArea;
	
	/**
	 * 停送电开始时间
	 */
	private Date hangGroundStartTime;
	
	/**
	 * 停送电结束时间
	 */
	private Date hangGroundEndTime;
	
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
	

	public WorkHangGroundEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setHangGroundName(String hangGroundName) {
		this.hangGroundName = hangGroundName;
	}
	
	public String getHangGroundName() {
		return hangGroundName;
	}
	
	public void setHangGroundArea(String hangGroundArea) {
		this.hangGroundArea = hangGroundArea;
	}
	
	public String getHangGroundArea() {
		return hangGroundArea;
	}
	
	public void setHangGroundStartTime(Date hangGroundStartTime) {
		this.hangGroundStartTime = hangGroundStartTime;
	}
	
	public Date getHangGroundStartTime() {
		return hangGroundStartTime;
	}
	
	public void setHangGroundEndTime(Date hangGroundEndTime) {
		this.hangGroundEndTime = hangGroundEndTime;
	}
	
	public Date getHangGroundEndTime() {
		return hangGroundEndTime;
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
