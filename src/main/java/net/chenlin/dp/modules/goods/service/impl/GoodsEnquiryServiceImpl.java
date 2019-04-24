package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsEnquiryEntity;
import net.chenlin.dp.modules.goods.manager.GoodsEnquiryManager;
import net.chenlin.dp.modules.goods.service.GoodsEnquiryService;

/**
 * 询价管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:48:56
 */
@Service("goodsEnquiryService")
public class GoodsEnquiryServiceImpl implements GoodsEnquiryService {

	@Autowired
	private GoodsEnquiryManager goodsEnquiryManager;

	@Override
	public Page<GoodsEnquiryEntity> listGoodsEnquiry(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsEnquiryEntity> page = new Page<>(query);
		goodsEnquiryManager.listGoodsEnquiry(page, query);
		return page;
	}

	@Override
	public R saveGoodsEnquiry(GoodsEnquiryEntity role) {
		int count = goodsEnquiryManager.saveGoodsEnquiry(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsEnquiryById(Long id) {
		GoodsEnquiryEntity goodsEnquiry = goodsEnquiryManager.getGoodsEnquiryById(id);
		return CommonUtils.msg(goodsEnquiry);
	}

	@Override
	public R updateGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry) {
		int count = goodsEnquiryManager.updateGoodsEnquiry(goodsEnquiry);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsEnquiryManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
