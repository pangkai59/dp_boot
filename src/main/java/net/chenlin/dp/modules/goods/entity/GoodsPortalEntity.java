package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 采购门户管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午3:36:23
 */
public class GoodsPortalEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 公告信息名称
	 */
	private String name;
	
	/**
	 * 发布类型
	 */
	private String type;
	
	/**
	 * 发布时间
	 */
	private String date;
	
	/**
	 * 发布人
	 */
	private String person;
	

	public GoodsPortalEntity() {
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
	
	public void setPerson(String person) {
		this.person = person;
	}
	
	public String getPerson() {
		return person;
	}
	
}
