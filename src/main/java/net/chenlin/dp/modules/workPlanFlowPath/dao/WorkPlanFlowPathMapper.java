package net.chenlin.dp.modules.workPlanFlowPath.dao;

import org.apache.ibatis.annotations.Mapper;

import net.chenlin.dp.modules.workPlanFlowPath.entity.WorkPlanFlowPathEntity;
import net.chenlin.dp.modules.sys.dao.BaseMapper;

/**
 * 计划流程管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:35:28
 */
@Mapper
public interface WorkPlanFlowPathMapper extends BaseMapper<WorkPlanFlowPathEntity> {
	
}
