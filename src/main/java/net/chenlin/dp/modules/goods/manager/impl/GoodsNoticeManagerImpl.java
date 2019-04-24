package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsNoticeMapper;
import net.chenlin.dp.modules.goods.entity.GoodsNoticeEntity;
import net.chenlin.dp.modules.goods.manager.GoodsNoticeManager;

/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
@Component("goodsNoticeManager")
public class GoodsNoticeManagerImpl implements GoodsNoticeManager {

	@Autowired
	private GoodsNoticeMapper goodsNoticeMapper;
	

	@Override
	public List<GoodsNoticeEntity> listGoodsNotice(Page<GoodsNoticeEntity> page, Query search) {
		return goodsNoticeMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsNotice(GoodsNoticeEntity goodsNotice) {
		return goodsNoticeMapper.save(goodsNotice);
	}

	@Override
	public GoodsNoticeEntity getGoodsNoticeById(Long id) {
		GoodsNoticeEntity goodsNotice = goodsNoticeMapper.getObjectById(id);
		return goodsNotice;
	}

	@Override
	public int updateGoodsNotice(GoodsNoticeEntity goodsNotice) {
		return goodsNoticeMapper.update(goodsNotice);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsNoticeMapper.batchRemove(id);
		return count;
	}
	
}
