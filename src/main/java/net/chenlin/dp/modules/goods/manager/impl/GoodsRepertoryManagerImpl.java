package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsRepertoryMapper;
import net.chenlin.dp.modules.goods.entity.GoodsRepertoryEntity;
import net.chenlin.dp.modules.goods.manager.GoodsRepertoryManager;

/**
 * 库存管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:26
 */
@Component("goodsRepertoryManager")
public class GoodsRepertoryManagerImpl implements GoodsRepertoryManager {

	@Autowired
	private GoodsRepertoryMapper goodsRepertoryMapper;
	

	@Override
	public List<GoodsRepertoryEntity> listGoodsRepertory(Page<GoodsRepertoryEntity> page, Query search) {
		return goodsRepertoryMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsRepertory(GoodsRepertoryEntity goodsRepertory) {
		return goodsRepertoryMapper.save(goodsRepertory);
	}

	@Override
	public GoodsRepertoryEntity getGoodsRepertoryById(Long id) {
		GoodsRepertoryEntity goodsRepertory = goodsRepertoryMapper.getObjectById(id);
		return goodsRepertory;
	}

	@Override
	public int updateGoodsRepertory(GoodsRepertoryEntity goodsRepertory) {
		return goodsRepertoryMapper.update(goodsRepertory);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsRepertoryMapper.batchRemove(id);
		return count;
	}
	
}
