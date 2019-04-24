package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsSuppliertypeEntity;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:14
 */
public interface GoodsSuppliertypeService {

	Page<GoodsSuppliertypeEntity> listGoodsSuppliertype(Map<String, Object> params);
	
	R saveGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype);
	
	R getGoodsSuppliertypeById(Long id);
	
	R updateGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype);
	
	R batchRemove(Long[] id);
	
}
