package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 询价管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:48:56
 */
public class GoodsEnquiryEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 询价名称
	 */
	private String name;
	
	/**
	 * 询价开始时间
	 */
	private String startTime;
	
	/**
	 * 询价结束时间
	 */
	private String endTime;
	
	/**
	 * 详细内容
	 */
	private String detail;
	

	public GoodsEnquiryEntity() {
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
	
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	public String getDetail() {
		return detail;
	}
	
}
