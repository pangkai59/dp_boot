package net.chenlin.dp.modules.goods.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.goods.entity.GoodsSuppliertypeEntity;
import net.chenlin.dp.modules.goods.manager.GoodsSuppliertypeManager;
import net.chenlin.dp.modules.goods.service.GoodsSuppliertypeService;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:14
 */
@Service("goodsSuppliertypeService")
public class GoodsSuppliertypeServiceImpl implements GoodsSuppliertypeService {

	@Autowired
	private GoodsSuppliertypeManager goodsSuppliertypeManager;

	@Override
	public Page<GoodsSuppliertypeEntity> listGoodsSuppliertype(Map<String, Object> params) {
		Query query = new Query(params);
		Page<GoodsSuppliertypeEntity> page = new Page<>(query);
		goodsSuppliertypeManager.listGoodsSuppliertype(page, query);
		return page;
	}

	@Override
	public R saveGoodsSuppliertype(GoodsSuppliertypeEntity role) {
		int count = goodsSuppliertypeManager.saveGoodsSuppliertype(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getGoodsSuppliertypeById(Long id) {
		GoodsSuppliertypeEntity goodsSuppliertype = goodsSuppliertypeManager.getGoodsSuppliertypeById(id);
		return CommonUtils.msg(goodsSuppliertype);
	}

	@Override
	public R updateGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype) {
		int count = goodsSuppliertypeManager.updateGoodsSuppliertype(goodsSuppliertype);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = goodsSuppliertypeManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
