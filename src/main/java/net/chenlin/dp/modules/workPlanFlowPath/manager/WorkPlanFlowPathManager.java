package net.chenlin.dp.modules.workPlanFlowPath.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workPlanFlowPath.entity.WorkPlanFlowPathEntity;

/**
 * 计划流程管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:35:28
 */
public interface WorkPlanFlowPathManager {

	List<WorkPlanFlowPathEntity> listWorkPlanFlowPath(Page<WorkPlanFlowPathEntity> page, Query search);
	
	int saveWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath);
	
	WorkPlanFlowPathEntity getWorkPlanFlowPathById(Long id);
	
	int updateWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath);
	
	int batchRemove(Long[] id);
	
}
