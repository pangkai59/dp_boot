package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsBuyPlanMapper;
import net.chenlin.dp.modules.goods.entity.GoodsBuyPlanEntity;
import net.chenlin.dp.modules.goods.manager.GoodsBuyPlanManager;

/**
 * 
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月18日 下午4:17:35
 */
@Component("goodsBuyPlanManager")
public class GoodsBuyPlanManagerImpl implements GoodsBuyPlanManager {

	@Autowired
	private GoodsBuyPlanMapper goodsBuyPlanMapper;
	

	@Override
	public List<GoodsBuyPlanEntity> listGoodsBuyPlan(Page<GoodsBuyPlanEntity> page, Query search) {
		return goodsBuyPlanMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan) {
		return goodsBuyPlanMapper.save(goodsBuyPlan);
	}

	@Override
	public GoodsBuyPlanEntity getGoodsBuyPlanById(Long id) {
		GoodsBuyPlanEntity goodsBuyPlan = goodsBuyPlanMapper.getObjectById(id);
		return goodsBuyPlan;
	}

	@Override
	public int updateGoodsBuyPlan(GoodsBuyPlanEntity goodsBuyPlan) {
		return goodsBuyPlanMapper.update(goodsBuyPlan);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsBuyPlanMapper.batchRemove(id);
		return count;
	}
	
}
