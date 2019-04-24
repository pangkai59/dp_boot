package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:51:35
 */
public class GoodsRecordEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 项目名称
	 */
	private String projectName;
	
	/**
	 * 档案名称
	 */
	private String recordName;
	
	/**
	 * 开始时间
	 */
	private String startTime;
	
	/**
	 * 附件
	 */
	private String accessory;
	

	public GoodsRecordEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}
	
	public String getRecordName() {
		return recordName;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
	
	public String getAccessory() {
		return accessory;
	}
	
}
