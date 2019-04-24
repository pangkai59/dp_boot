package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsNoticeEntity;

/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
public interface GoodsNoticeService {

	Page<GoodsNoticeEntity> listGoodsNotice(Map<String, Object> params);
	
	R saveGoodsNotice(GoodsNoticeEntity goodsNotice);
	
	R getGoodsNoticeById(Long id);
	
	R updateGoodsNotice(GoodsNoticeEntity goodsNotice);
	
	R batchRemove(Long[] id);
	
}
