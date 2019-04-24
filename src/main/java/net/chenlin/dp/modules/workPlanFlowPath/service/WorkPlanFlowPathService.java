package net.chenlin.dp.modules.workPlanFlowPath.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workPlanFlowPath.entity.WorkPlanFlowPathEntity;

/**
 * 计划流程管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:35:28
 */
public interface WorkPlanFlowPathService {

	Page<WorkPlanFlowPathEntity> listWorkPlanFlowPath(Map<String, Object> params);
	
	R saveWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath);
	
	R getWorkPlanFlowPathById(Long id);
	
	R updateWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath);
	
	R batchRemove(Long[] id);
	
}
