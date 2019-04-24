package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsNoticeEntity;
import net.chenlin.dp.modules.goods.manager.GoodsNoticeManager;
import net.chenlin.dp.modules.goods.service.GoodsNoticeService;

/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
@Service("goodsNoticeService")
public class GoodsNoticeServiceImpl implements GoodsNoticeService {

	@Autowired
	private GoodsNoticeManager goodsNoticeManager;

	@Override
	public Page<GoodsNoticeEntity> listGoodsNotice(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsNoticeEntity> page = new Page<>(query);
		goodsNoticeManager.listGoodsNotice(page, query);
		return page;
	}

	@Override
	public R saveGoodsNotice(GoodsNoticeEntity role) {
		int count = goodsNoticeManager.saveGoodsNotice(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsNoticeById(Long id) {
		GoodsNoticeEntity goodsNotice = goodsNoticeManager.getGoodsNoticeById(id);
		return CommonUtils.msg(goodsNotice);
	}

	@Override
	public R updateGoodsNotice(GoodsNoticeEntity goodsNotice) {
		int count = goodsNoticeManager.updateGoodsNotice(goodsNotice);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsNoticeManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
