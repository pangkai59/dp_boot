package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:14
 */
public class GoodsSuppliertypeEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 供应商类别
	 */
	private String type;
	
	/**
	 * 供应商代码
	 */
	private String code;
	
	/**
	 * 备注
	 */
	private String comment;
	

	public GoodsSuppliertypeEntity() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return comment;
	}
	
}
