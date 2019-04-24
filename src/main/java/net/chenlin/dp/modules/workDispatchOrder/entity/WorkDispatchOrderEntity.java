package net.chenlin.dp.modules.workDispatchOrder.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
public class WorkDispatchOrderEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键id
	 */
	private Long id;
	
	/**
	 * 调度编号
	 */
	private String dispatchOrderNo;
	
	/**
	 * 受令端
	 */
	private String dispatchOrderSite;
	
	/**
	 * 调度姓名
	 */
	private String dispatchOrderName;
	
	/**
	 * 综控员
	 */
	private String dispatchOrderSynthesizeName;
	
	/**
	 * 类型
	 */
	private Date dispatchOrderTime;
	
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
	

	public WorkDispatchOrderEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setDispatchOrderNo(String dispatchOrderNo) {
		this.dispatchOrderNo = dispatchOrderNo;
	}
	
	public String getDispatchOrderNo() {
		return dispatchOrderNo;
	}
	
	public void setDispatchOrderSite(String dispatchOrderSite) {
		this.dispatchOrderSite = dispatchOrderSite;
	}
	
	public String getDispatchOrderSite() {
		return dispatchOrderSite;
	}
	
	public void setDispatchOrderName(String dispatchOrderName) {
		this.dispatchOrderName = dispatchOrderName;
	}
	
	public String getDispatchOrderName() {
		return dispatchOrderName;
	}
	
	public void setDispatchOrderSynthesizeName(String dispatchOrderSynthesizeName) {
		this.dispatchOrderSynthesizeName = dispatchOrderSynthesizeName;
	}
	
	public String getDispatchOrderSynthesizeName() {
		return dispatchOrderSynthesizeName;
	}
	
	public void setDispatchOrderTime(Date dispatchOrderTime) {
		this.dispatchOrderTime = dispatchOrderTime;
	}
	
	public Date getDispatchOrderTime() {
		return dispatchOrderTime;
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
