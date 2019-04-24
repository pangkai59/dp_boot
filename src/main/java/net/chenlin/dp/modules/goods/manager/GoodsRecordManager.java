package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsRecordEntity;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:51:35
 */
public interface GoodsRecordManager {

	List<GoodsRecordEntity> listGoodsRecord(Page<GoodsRecordEntity> page, Query search);
	
	int saveGoodsRecord(GoodsRecordEntity goodsRecord);
	
	GoodsRecordEntity getGoodsRecordById(Long id);
	
	int updateGoodsRecord(GoodsRecordEntity goodsRecord);
	
	int batchRemove(Long[] id);
	
}
