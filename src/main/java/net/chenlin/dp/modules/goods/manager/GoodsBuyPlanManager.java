package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsBuyPlanEntity;

/**
 * 
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月18日 下午4:17:35
 */
public interface GoodsBuyPlanManager {

	List<GoodsBuyPlanEntity> listGoodsBuyPlan(Page<GoodsBuyPlanEntity> page, Query search);
	
	int saveGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan);
	
	GoodsBuyPlanEntity getGoodsBuyPlanById(Long id);
	
	int updateGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan);
	
	int batchRemove(Long[] id);
	
}
