package net.chenlin.dp.modules.goods.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsEnquiryEntity;

/**
 * 询价管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:48:56
 */
public interface GoodsEnquiryService {

	Page<GoodsEnquiryEntity> listGoodsEnquiry(Map<String, Object> params);
	
	R saveGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry);
	
	R getGoodsEnquiryById(Long id);
	
	R updateGoodsEnquiry(GoodsEnquiryEntity goodsEnquiry);
	
	R batchRemove(Long[] id);
	
}
