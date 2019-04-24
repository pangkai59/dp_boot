package net.chenlin.dp.modules.goods.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.goods.entity.GoodsEnquiryEntity;

/**
 * 询价管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:48:56
 */
public interface GoodsEnquiryManager {

	List<GoodsEnquiryEntity> listGoodsEnquiry(Page<GoodsEnquiryEntity> page, Query search);
	
	int saveGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry);
	
	GoodsEnquiryEntity getGoodsEnquiryById(Long id);
	
	int updateGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry);
	
	int batchRemove(Long[] id);
	
}
