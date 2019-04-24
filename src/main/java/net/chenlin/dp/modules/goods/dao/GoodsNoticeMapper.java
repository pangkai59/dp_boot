package net.chenlin.dp.modules.goods.dao;

import org.apache.ibatis.annotations.Mapper;

import net.chenlin.dp.modules.goods.entity.GoodsNoticeEntity;
import net.chenlin.dp.modules.sys.dao.BaseMapper;

/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
@Mapper
public interface GoodsNoticeMapper extends BaseMapper<GoodsNoticeEntity> {
	
}
