package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsPortalMapper;
import net.chenlin.dp.modules.goods.entity.GoodsPortalEntity;
import net.chenlin.dp.modules.goods.manager.GoodsPortalManager;

/**
 * 采购门户管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午3:36:23
 */
@Component("goodsPortalManager")
public class GoodsPortalManagerImpl implements GoodsPortalManager {

	@Autowired
	private GoodsPortalMapper goodsPortalMapper;
	

	@Override
	public List<GoodsPortalEntity> listGoodsPortal(Page<GoodsPortalEntity> page, Query search) {
		return goodsPortalMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsPortal(GoodsPortalEntity goodsPortal) {
		return goodsPortalMapper.save(goodsPortal);
	}

	@Override
	public GoodsPortalEntity getGoodsPortalById(Long id) {
		GoodsPortalEntity goodsPortal = goodsPortalMapper.getObjectById(id);
		return goodsPortal;
	}

	@Override
	public int updateGoodsPortal(GoodsPortalEntity goodsPortal) {
		return goodsPortalMapper.update(goodsPortal);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsPortalMapper.batchRemove(id);
		return count;
	}
	
}
