package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsSuppliertypeEntity;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:14
 */
public interface GoodsSuppliertypeManager {

	List<GoodsSuppliertypeEntity> listGoodsSuppliertype(Page<GoodsSuppliertypeEntity> page, Query search);
	
	int saveGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype);
	
	GoodsSuppliertypeEntity getGoodsSuppliertypeById(Long id);
	
	int updateGoodsSuppliertype(GoodsSuppliertypeEntity goodsSuppliertype);
	
	int batchRemove(Long[] id);
	
}
