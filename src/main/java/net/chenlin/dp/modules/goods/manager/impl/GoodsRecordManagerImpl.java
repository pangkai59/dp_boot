package net.chenlin.dp.modules.goods.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.dao.GoodsRecordMapper;
import net.chenlin.dp.modules.goods.entity.GoodsRecordEntity;
import net.chenlin.dp.modules.goods.manager.GoodsRecordManager;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:51:35
 */
@Component("goodsRecordManager")
public class GoodsRecordManagerImpl implements GoodsRecordManager {

	@Autowired
	private GoodsRecordMapper goodsRecordMapper;
	

	@Override
	public List<GoodsRecordEntity> listGoodsRecord(Page<GoodsRecordEntity> page, Query search) {
		return goodsRecordMapper.listForPage(page, search);
	}

	@Override
	public int saveGoodsRecord(GoodsRecordEntity goodsRecord) {
		return goodsRecordMapper.save(goodsRecord);
	}

	@Override
	public GoodsRecordEntity getGoodsRecordById(Long id) {
		GoodsRecordEntity goodsRecord = goodsRecordMapper.getObjectById(id);
		return goodsRecord;
	}

	@Override
	public int updateGoodsRecord(GoodsRecordEntity goodsRecord) {
		return goodsRecordMapper.update(goodsRecord);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = goodsRecordMapper.batchRemove(id);
		return count;
	}
	
}
