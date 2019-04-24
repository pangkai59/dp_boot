package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsNoticeEntity;

/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
public interface GoodsNoticeManager {

	List<GoodsNoticeEntity> listGoodsNotice(Page<GoodsNoticeEntity> page, Query search);
	
	int saveGoodsNotice(GoodsNoticeEntity goodsNotice);
	
	GoodsNoticeEntity getGoodsNoticeById(Long id);
	
	int updateGoodsNotice(GoodsNoticeEntity goodsNotice);
	
	int batchRemove(Long[] id);
	
}
