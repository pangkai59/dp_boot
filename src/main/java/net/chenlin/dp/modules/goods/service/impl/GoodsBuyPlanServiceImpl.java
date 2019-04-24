package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsBuyPlanEntity;
import net.chenlin.dp.modules.goods.manager.GoodsBuyPlanManager;
import net.chenlin.dp.modules.goods.service.GoodsBuyPlanService;

/**
 * 
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月18日 下午4:17:35
 */
@Service("goodsBuyPlanService")
public class GoodsBuyPlanServiceImpl implements GoodsBuyPlanService {

	@Autowired
	private GoodsBuyPlanManager goodsBuyPlanManager;

	@Override
	public Page<GoodsBuyPlanEntity> listGoodsBuyPlan(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsBuyPlanEntity> page = new Page<>(query);
		goodsBuyPlanManager.listGoodsBuyPlan(page, query);
		return page;
	}

	@Override
	public R saveGoodsBuyPlan(GoodsBuyPlanEntity role) {
		int count = goodsBuyPlanManager.saveGoodsBuyPlan(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsBuyPlanById(Long id) {
		GoodsBuyPlanEntity goodsBuyPlan = goodsBuyPlanManager.getGoodsBuyPlanById(id);
		return CommonUtils.msg(goodsBuyPlan);
	}

	@Override
	public R updateGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan) {
		int count = goodsBuyPlanManager.updateGoodsBuyPlan(goodsBuyPlan);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsBuyPlanManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
