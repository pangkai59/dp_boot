package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 系统通知管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:48
 */
public class GoodsInformEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 通知名称
	 */
	private String name;
	
	/**
	 * 通知类型
	 */
	private String type;
	
	/**
	 * 通知时间
	 */
	private String startTime;
	
	/**
	 * 结束时间
	 */
	private String endTime;
	

	public GoodsInformEntity() {
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
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
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
	
}
