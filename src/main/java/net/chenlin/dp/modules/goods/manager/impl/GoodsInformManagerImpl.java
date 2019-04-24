package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsInformMapper;
import net.chenlin.dp.modules.goods.entity.GoodsInformEntity;
import net.chenlin.dp.modules.goods.manager.GoodsInformManager;

/**
 * 系统通知管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:48
 */
@Component("goodsInformManager")
public class GoodsInformManagerImpl implements GoodsInformManager {

	@Autowired
	private GoodsInformMapper goodsInformMapper;
	

	@Override
	public List<GoodsInformEntity> listGoodsInform(Page<GoodsInformEntity> page, Query search) {
		return goodsInformMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsInform(GoodsInformEntity goodsInform) {
		return goodsInformMapper.save(goodsInform);
	}

	@Override
	public GoodsInformEntity getGoodsInformById(Long id) {
		GoodsInformEntity goodsInform = goodsInformMapper.getObjectById(id);
		return goodsInform;
	}

	@Override
	public int updateGoodsInform(GoodsInformEntity goodsInform) {
		return goodsInformMapper.update(goodsInform);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsInformMapper.batchRemove(id);
		return count;
	}
	
}
