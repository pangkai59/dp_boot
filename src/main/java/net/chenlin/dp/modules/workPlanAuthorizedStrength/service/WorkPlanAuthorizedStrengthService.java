package net.chenlin.dp.modules.workPlanAuthorizedStrength.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.entity.WorkPlanAuthorizedStrengthEntity;

/**
 * 计划编制管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:13:34
 */
public interface WorkPlanAuthorizedStrengthService {

	Page<WorkPlanAuthorizedStrengthEntity> listWorkPlanAuthorizedStrength(Map<String, Object> params);
	
	R saveWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength);
	
	R getWorkPlanAuthorizedStrengthById(Long id);
	
	R updateWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength);
	
	R batchRemove(Long[] id);
	
}
