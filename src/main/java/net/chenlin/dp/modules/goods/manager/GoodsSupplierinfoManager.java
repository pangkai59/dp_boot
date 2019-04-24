package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsSupplierinfoEntity;

/**
 * 供应商信息管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:36
 */
public interface GoodsSupplierinfoManager {

	List<GoodsSupplierinfoEntity> listGoodsSupplierinfo(Page<GoodsSupplierinfoEntity> page, Query search);
	
	int saveGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo);
	
	GoodsSupplierinfoEntity getGoodsSupplierinfoById(Long id);
	
	int updateGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo);
	
	int batchRemove(Long[] id);
	
}
