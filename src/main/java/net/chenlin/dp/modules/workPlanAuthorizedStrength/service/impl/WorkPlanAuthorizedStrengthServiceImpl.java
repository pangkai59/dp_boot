package net.chenlin.dp.modules.workPlanAuthorizedStrength.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.entity.WorkPlanAuthorizedStrengthEntity;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.manager.WorkPlanAuthorizedStrengthManager;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.service.WorkPlanAuthorizedStrengthService;

/**
 * 计划编制管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:13:34
 */
@Service("workPlanAuthorizedStrengthService")
public class WorkPlanAuthorizedStrengthServiceImpl implements WorkPlanAuthorizedStrengthService {

	@Autowired
	private WorkPlanAuthorizedStrengthManager workPlanAuthorizedStrengthManager;

	@Override
	public Page<WorkPlanAuthorizedStrengthEntity> listWorkPlanAuthorizedStrength(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkPlanAuthorizedStrengthEntity> page = new Page<>(query);
		workPlanAuthorizedStrengthManager.listWorkPlanAuthorizedStrength(page, query);
		return page;
	}

	@Override
	public R saveWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity role) {
		int count = workPlanAuthorizedStrengthManager.saveWorkPlanAuthorizedStrength(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkPlanAuthorizedStrengthById(Long id) {
		WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength = workPlanAuthorizedStrengthManager.getWorkPlanAuthorizedStrengthById(id);
		return CommonUtils.msg(workPlanAuthorizedStrength);
	}

	@Override
	public R updateWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength) {
		int count = workPlanAuthorizedStrengthManager.updateWorkPlanAuthorizedStrength(workPlanAuthorizedStrength);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workPlanAuthorizedStrengthManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
