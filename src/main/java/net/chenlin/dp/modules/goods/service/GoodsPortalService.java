package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsPortalEntity;

/**
 * 采购门户管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午3:36:23
 */
public interface GoodsPortalService {

	Page<GoodsPortalEntity> listGoodsPortal(Map<String, Object> params);
	
	R saveGoodsPortal(GoodsPortalEntity goodsPortal);
	
	R getGoodsPortalById(Long id);
	
	R updateGoodsPortal(GoodsPortalEntity goodsPortal);
	
	R batchRemove(Long[] id);
	
}
