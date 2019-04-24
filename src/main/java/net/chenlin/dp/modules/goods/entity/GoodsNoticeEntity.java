package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
public class GoodsNoticeEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 公告名称
	 */
	private String name;
	
	/**
	 * 公告开始时间
	 */
	private String startTime;
	
	/**
	 * 公告结束时间
	 */
	private String endTime;
	
	/**
	 * 详细内容
	 */
	private String detail;
	

	public GoodsNoticeEntity() {
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
