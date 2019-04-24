package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsEnquiryMapper;
import net.chenlin.dp.modules.goods.entity.GoodsEnquiryEntity;
import net.chenlin.dp.modules.goods.manager.GoodsEnquiryManager;

/**
 * 询价管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:48:56
 */
@Component("goodsEnquiryManager")
public class GoodsEnquiryManagerImpl implements GoodsEnquiryManager {

	@Autowired
	private GoodsEnquiryMapper goodsEnquiryMapper;
	

	@Override
	public List<GoodsEnquiryEntity> listGoodsEnquiry(Page<GoodsEnquiryEntity> page, Query search) {
		return goodsEnquiryMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry) {
		return goodsEnquiryMapper.save(goodsEnquiry);
	}

	@Override
	public GoodsEnquiryEntity getGoodsEnquiryById(Long id) {
		GoodsEnquiryEntity goodsEnquiry = goodsEnquiryMapper.getObjectById(id);
		return goodsEnquiry;
	}

	@Override
	public int updateGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry) {
		return goodsEnquiryMapper.update(goodsEnquiry);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsEnquiryMapper.batchRemove(id);
		return count;
	}
	
}
