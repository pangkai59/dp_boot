package net.chenlin.dp.modules.workPlanAuthorizedStrength.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.entity.WorkPlanAuthorizedStrengthEntity;

/**
 * 计划编制管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:13:34
 */
public interface WorkPlanAuthorizedStrengthManager {

	List<WorkPlanAuthorizedStrengthEntity> listWorkPlanAuthorizedStrength(Page<WorkPlanAuthorizedStrengthEntity> page, Query search);
	
	int saveWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength);
	
	WorkPlanAuthorizedStrengthEntity getWorkPlanAuthorizedStrengthById(Long id);
	
	int updateWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength);
	
	int batchRemove(Long[] id);
	
}
