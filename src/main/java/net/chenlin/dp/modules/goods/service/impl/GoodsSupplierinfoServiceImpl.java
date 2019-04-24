package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsSupplierinfoEntity;
import net.chenlin.dp.modules.goods.manager.GoodsSupplierinfoManager;
import net.chenlin.dp.modules.goods.service.GoodsSupplierinfoService;

/**
 * 供应商信息管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:36
 */
@Service("goodsSupplierinfoService")
public class GoodsSupplierinfoServiceImpl implements GoodsSupplierinfoService {

	@Autowired
	private GoodsSupplierinfoManager goodsSupplierinfoManager;

	@Override
	public Page<GoodsSupplierinfoEntity> listGoodsSupplierinfo(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsSupplierinfoEntity> page = new Page<>(query);
		goodsSupplierinfoManager.listGoodsSupplierinfo(page, query);
		return page;
	}

	@Override
	public R saveGoodsSupplierinfo(GoodsSupplierinfoEntity role) {
		int count = goodsSupplierinfoManager.saveGoodsSupplierinfo(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsSupplierinfoById(Long id) {
		GoodsSupplierinfoEntity goodsSupplierinfo = goodsSupplierinfoManager.getGoodsSupplierinfoById(id);
		return CommonUtils.msg(goodsSupplierinfo);
	}

	@Override
	public R updateGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo) {
		int count = goodsSupplierinfoManager.updateGoodsSupplierinfo(goodsSupplierinfo);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsSupplierinfoManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
