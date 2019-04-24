package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsSuppliertypeMapper;
import net.chenlin.dp.modules.goods.entity.GoodsSuppliertypeEntity;
import net.chenlin.dp.modules.goods.manager.GoodsSuppliertypeManager;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:14
 */
@Component("goodsSuppliertypeManager")
public class GoodsSuppliertypeManagerImpl implements GoodsSuppliertypeManager {

	@Autowired
	private GoodsSuppliertypeMapper goodsSuppliertypeMapper;
	

	@Override
	public List<GoodsSuppliertypeEntity> listGoodsSuppliertype(Page<GoodsSuppliertypeEntity> page, Query search) {
		return goodsSuppliertypeMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype) {
		return goodsSuppliertypeMapper.save(goodsSuppliertype);
	}

	@Override
	public GoodsSuppliertypeEntity getGoodsSuppliertypeById(Long id) {
		GoodsSuppliertypeEntity goodsSuppliertype = goodsSuppliertypeMapper.getObjectById(id);
		return goodsSuppliertype;
	}

	@Override
	public int updateGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype) {
		return goodsSuppliertypeMapper.update(goodsSuppliertype);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsSuppliertypeMapper.batchRemove(id);
		return count;
	}
	
}
