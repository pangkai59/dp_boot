package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsRepertoryEntity;

/**
 * 库存管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:26
 */
public interface GoodsRepertoryService {

	Page<GoodsRepertoryEntity> listGoodsRepertory(Map<String, Object> params);
	
	R saveGoodsRepertory(GoodsRepertoryEntity goodsRepertory);
	
	R getGoodsRepertoryById(Long id);
	
	R updateGoodsRepertory(GoodsRepertoryEntity goodsRepertory);
	
	R batchRemove(Long[] id);
	
}
