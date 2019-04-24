package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsRecordEntity;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:51:35
 */
public interface GoodsRecordService {

	Page<GoodsRecordEntity> listGoodsRecord(Map<String, Object> params);
	
	R saveGoodsRecord(GoodsRecordEntity goodsRecord);
	
	R getGoodsRecordById(Long id);
	
	R updateGoodsRecord(GoodsRecordEntity goodsRecord);
	
	R batchRemove(Long[] id);
	
}
