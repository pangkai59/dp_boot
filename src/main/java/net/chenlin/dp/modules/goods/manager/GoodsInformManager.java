package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsInformEntity;

/**
 * 系统通知管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:48
 */
public interface GoodsInformManager {

	List<GoodsInformEntity> listGoodsInform(Page<GoodsInformEntity> page, Query search);
	
	int saveGoodsInform(GoodsInformEntity goodsInform);
	
	GoodsInformEntity getGoodsInformById(Long id);
	
	int updateGoodsInform(GoodsInformEntity goodsInform);
	
	int batchRemove(Long[] id);
	
}
