package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsRepertoryEntity;
import net.chenlin.dp.modules.goods.manager.GoodsRepertoryManager;
import net.chenlin.dp.modules.goods.service.GoodsRepertoryService;

/**
 * 库存管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:26
 */
@Service("goodsRepertoryService")
public class GoodsRepertoryServiceImpl implements GoodsRepertoryService {

	@Autowired
	private GoodsRepertoryManager goodsRepertoryManager;

	@Override
	public Page<GoodsRepertoryEntity> listGoodsRepertory(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsRepertoryEntity> page = new Page<>(query);
		goodsRepertoryManager.listGoodsRepertory(page, query);
		return page;
	}

	@Override
	public R saveGoodsRepertory(GoodsRepertoryEntity role) {
		int count = goodsRepertoryManager.saveGoodsRepertory(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsRepertoryById(Long id) {
		GoodsRepertoryEntity goodsRepertory = goodsRepertoryManager.getGoodsRepertoryById(id);
		return CommonUtils.msg(goodsRepertory);
	}

	@Override
	public R updateGoodsRepertory(GoodsRepertoryEntity goodsRepertory) {
		int count = goodsRepertoryManager.updateGoodsRepertory(goodsRepertory);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsRepertoryManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
