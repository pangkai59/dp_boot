package net.chenlin.dp.modules.workDispatchOrder.dao;

import org.apache.ibatis.annotations.Mapper;

import net.chenlin.dp.modules.workDispatchOrder.entity.WorkDispatchOrderEntity;
import net.chenlin.dp.modules.sys.dao.BaseMapper;

/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
@Mapper
public interface WorkDispatchOrderMapper extends BaseMapper<WorkDispatchOrderEntity> {
	
}
