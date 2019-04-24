package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsInformEntity;
import net.chenlin.dp.modules.goods.manager.GoodsInformManager;
import net.chenlin.dp.modules.goods.service.GoodsInformService;

/**
 * 系统通知管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:48
 */
@Service("goodsInformService")
public class GoodsInformServiceImpl implements GoodsInformService {

	@Autowired
	private GoodsInformManager goodsInformManager;

	@Override
	public Page<GoodsInformEntity> listGoodsInform(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsInformEntity> page = new Page<>(query);
		goodsInformManager.listGoodsInform(page, query);
		return page;
	}

	@Override
	public R saveGoodsInform(GoodsInformEntity role) {
		int count = goodsInformManager.saveGoodsInform(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsInformById(Long id) {
		GoodsInformEntity goodsInform = goodsInformManager.getGoodsInformById(id);
		return CommonUtils.msg(goodsInform);
	}

	@Override
	public R updateGoodsInform(GoodsInformEntity goodsInform) {
		int count = goodsInformManager.updateGoodsInform(goodsInform);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsInformManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
