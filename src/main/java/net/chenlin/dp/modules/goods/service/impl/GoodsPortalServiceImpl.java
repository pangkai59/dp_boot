package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsPortalEntity;
import net.chenlin.dp.modules.goods.manager.GoodsPortalManager;
import net.chenlin.dp.modules.goods.service.GoodsPortalService;

/**
 * 采购门户管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午3:36:23
 */
@Service("goodsPortalService")
public class GoodsPortalServiceImpl implements GoodsPortalService {

	@Autowired
	private GoodsPortalManager goodsPortalManager;

	@Override
	public Page<GoodsPortalEntity> listGoodsPortal(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsPortalEntity> page = new Page<>(query);
		goodsPortalManager.listGoodsPortal(page, query);
		return page;
	}

	@Override
	public R saveGoodsPortal(GoodsPortalEntity role) {
		int count = goodsPortalManager.saveGoodsPortal(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsPortalById(Long id) {
		GoodsPortalEntity goodsPortal = goodsPortalManager.getGoodsPortalById(id);
		return CommonUtils.msg(goodsPortal);
	}

	@Override
	public R updateGoodsPortal(GoodsPortalEntity goodsPortal) {
		int count = goodsPortalManager.updateGoodsPortal(goodsPortal);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsPortalManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
