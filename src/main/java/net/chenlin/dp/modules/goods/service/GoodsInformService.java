package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsInformEntity;

/**
 * 系统通知管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:48
 */
public interface GoodsInformService {

	Page<GoodsInformEntity> listGoodsInform(Map<String, Object> params);
	
	R saveGoodsInform(GoodsInformEntity goodsInform);
	
	R getGoodsInformById(Long id);
	
	R updateGoodsInform(GoodsInformEntity goodsInform);
	
	R batchRemove(Long[] id);
	
}
