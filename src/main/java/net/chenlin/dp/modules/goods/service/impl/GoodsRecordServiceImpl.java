package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsRecordEntity;
import net.chenlin.dp.modules.goods.manager.GoodsRecordManager;
import net.chenlin.dp.modules.goods.service.GoodsRecordService;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:51:35
 */
@Service("goodsRecordService")
public class GoodsRecordServiceImpl implements GoodsRecordService {

	@Autowired
	private GoodsRecordManager goodsRecordManager;

	@Override
	public Page<GoodsRecordEntity> listGoodsRecord(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsRecordEntity> page = new Page<>(query);
		goodsRecordManager.listGoodsRecord(page, query);
		return page;
	}

	@Override
	public R saveGoodsRecord(GoodsRecordEntity role) {
		int count = goodsRecordManager.saveGoodsRecord(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsRecordById(Long id) {
		GoodsRecordEntity goodsRecord = goodsRecordManager.getGoodsRecordById(id);
		return CommonUtils.msg(goodsRecord);
	}

	@Override
	public R updateGoodsRecord(GoodsRecordEntity goodsRecord) {
		int count = goodsRecordManager.updateGoodsRecord(goodsRecord);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsRecordManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
