package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 库存管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:26
 */
public class GoodsRepertoryEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 物资名称
	 */
	private String name;
	
	/**
	 * 物资类型
	 */
	private String type;
	
	/**
	 * 入库时间
	 */
	private String date;
	
	/**
	 * 状态
	 */
	private String status;
	

	public GoodsRepertoryEntity() {
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
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
}
