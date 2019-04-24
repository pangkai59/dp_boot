package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsSupplierinfoEntity;

/**
 * 供应商信息管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:36
 */
public interface GoodsSupplierinfoService {

	Page<GoodsSupplierinfoEntity> listGoodsSupplierinfo(Map<String, Object> params);
	
	R saveGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo);
	
	R getGoodsSupplierinfoById(Long id);
	
	R updateGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo);
	
	R batchRemove(Long[] id);
	
}
