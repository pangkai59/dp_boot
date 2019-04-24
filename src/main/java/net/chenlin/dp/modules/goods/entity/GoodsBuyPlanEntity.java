package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月18日 下午4:17:35
 */
public class GoodsBuyPlanEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Long id;
	
	/**
	 * 
	 */
	private String name;
	
	/**
	 * 
	 */
	private String startTime;
	
	/**
	 * 
	 */
	private String endTime;
	
	/**
	 * 
	 */
	private Integer status;
	

	public GoodsBuyPlanEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getStatus() {
		return status;
	}
	
}
