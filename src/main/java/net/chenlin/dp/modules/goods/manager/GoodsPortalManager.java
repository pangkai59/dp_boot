package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsPortalEntity;

/**
 * 采购门户管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午3:36:23
 */
public interface GoodsPortalManager {

	List<GoodsPortalEntity> listGoodsPortal(Page<GoodsPortalEntity> page, Query search);
	
	int saveGoodsPortal(GoodsPortalEntity goodsPortal);
	
	GoodsPortalEntity getGoodsPortalById(Long id);
	
	int updateGoodsPortal(GoodsPortalEntity goodsPortal);
	
	int batchRemove(Long[] id);
	
}
