package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsSupplierinfoMapper;
import net.chenlin.dp.modules.goods.entity.GoodsSupplierinfoEntity;
import net.chenlin.dp.modules.goods.manager.GoodsSupplierinfoManager;

/**
 * 供应商信息管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:36
 */
@Component("goodsSupplierinfoManager")
public class GoodsSupplierinfoManagerImpl implements GoodsSupplierinfoManager {

	@Autowired
	private GoodsSupplierinfoMapper goodsSupplierinfoMapper;
	

	@Override
	public List<GoodsSupplierinfoEntity> listGoodsSupplierinfo(Page<GoodsSupplierinfoEntity> page, Query search) {
		return goodsSupplierinfoMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo) {
		return goodsSupplierinfoMapper.save(goodsSupplierinfo);
	}

	@Override
	public GoodsSupplierinfoEntity getGoodsSupplierinfoById(Long id) {
		GoodsSupplierinfoEntity goodsSupplierinfo = goodsSupplierinfoMapper.getObjectById(id);
		return goodsSupplierinfo;
	}

	@Override
	public int updateGoodsSupplierinfo(GoodsSupplierinfoEntity goodsSupplierinfo) {
		return goodsSupplierinfoMapper.update(goodsSupplierinfo);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsSupplierinfoMapper.batchRemove(id);
		return count;
	}
	
}
