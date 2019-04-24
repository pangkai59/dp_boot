package net.chenlin.dp.modules.workFireOrder.dao;

import org.apache.ibatis.annotations.Mapper;

import net.chenlin.dp.modules.workFireOrder.entity.WorkFireOrderEntity;
import net.chenlin.dp.modules.sys.dao.BaseMapper;

/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
@Mapper
public interface WorkFireOrderMapper extends BaseMapper<WorkFireOrderEntity> {
	
}
