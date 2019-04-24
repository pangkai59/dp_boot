package net.chenlin.dp.modules.goods.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 供应商信息管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:36
 */
public class GoodsSupplierinfoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 编号id
	 */
	private Long id;
	
	/**
	 * 单位名称
	 */
	private String name;
	
	/**
	 * 企业机构代码
	 */
	private String code;
	
	/**
	 * 单位性质
	 */
	private String type;
	
	/**
	 * 所属行业
	 */
	private String trade;
	
	/**
	 * 从业人数
	 */
	private Long num;
	
	/**
	 * 主要产品
	 */
	private String product;
	

	public GoodsSupplierinfoEntity() {
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
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setTrade(String trade) {
		this.trade = trade;
	}
	
	public String getTrade() {
		return trade;
	}
	
	public void setNum(Long num) {
		this.num = num;
	}
	
	public Long getNum() {
		return num;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getProduct() {
		return product;
	}
	
}
