package net.chenlin.dp.modules.workPlanAuthorizedStrength.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.dao.WorkPlanAuthorizedStrengthMapper;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.entity.WorkPlanAuthorizedStrengthEntity;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.manager.WorkPlanAuthorizedStrengthManager;

/**
 * 计划编制管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:13:34
 */
@Component("workPlanAuthorizedStrengthManager")
public class WorkPlanAuthorizedStrengthManagerImpl implements WorkPlanAuthorizedStrengthManager {

	@Autowired
	private WorkPlanAuthorizedStrengthMapper workPlanAuthorizedStrengthMapper;
	

	@Override
	public List<WorkPlanAuthorizedStrengthEntity> listWorkPlanAuthorizedStrength(Page<WorkPlanAuthorizedStrengthEntity> page, Query search) {
		return workPlanAuthorizedStrengthMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength) {
		return workPlanAuthorizedStrengthMapper.save(workPlanAuthorizedStrength);
	}

	@Override
	public WorkPlanAuthorizedStrengthEntity getWorkPlanAuthorizedStrengthById(Long id) {
		WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength = workPlanAuthorizedStrengthMapper.getObjectById(id);
		return workPlanAuthorizedStrength;
	}

	@Override
	public int updateWorkPlanAuthorizedStrength(WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength) {
		return workPlanAuthorizedStrengthMapper.update(workPlanAuthorizedStrength);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workPlanAuthorizedStrengthMapper.batchRemove(id);
		return count;
	}
	
}
