package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsBuyPlanEntity;

/**
 * 
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月18日 下午4:17:35
 */
public interface GoodsBuyPlanService {

	Page<GoodsBuyPlanEntity> listGoodsBuyPlan(Map<String, Object> params);
	
	R saveGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan);
	
	R getGoodsBuyPlanById(Long id);
	
	R updateGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan);
	
	R batchRemove(Long[] id);
	
}
