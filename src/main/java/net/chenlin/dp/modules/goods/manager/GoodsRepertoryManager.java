package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsRepertoryEntity;

/**
 * 库存管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:26
 */
public interface GoodsRepertoryManager {

	List<GoodsRepertoryEntity> listGoodsRepertory(Page<GoodsRepertoryEntity> page, Query search);
	
	int saveGoodsRepertory(GoodsRepertoryEntity goodsRepertory);
	
	GoodsRepertoryEntity getGoodsRepertoryById(Long id);
	
	int updateGoodsRepertory(GoodsRepertoryEntity goodsRepertory);
	
	int batchRemove(Long[] id);
	
}
