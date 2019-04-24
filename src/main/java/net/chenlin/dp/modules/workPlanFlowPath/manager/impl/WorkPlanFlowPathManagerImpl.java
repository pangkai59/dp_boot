package net.chenlin.dp.modules.workPlanFlowPath.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workPlanFlowPath.dao.WorkPlanFlowPathMapper;
import net.chenlin.dp.modules.workPlanFlowPath.entity.WorkPlanFlowPathEntity;
import net.chenlin.dp.modules.workPlanFlowPath.manager.WorkPlanFlowPathManager;

/**
 * 计划流程管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:35:28
 */
@Component("workPlanFlowPathManager")
public class WorkPlanFlowPathManagerImpl implements WorkPlanFlowPathManager {

	@Autowired
	private WorkPlanFlowPathMapper workPlanFlowPathMapper;
	

	@Override
	public List<WorkPlanFlowPathEntity> listWorkPlanFlowPath(Page<WorkPlanFlowPathEntity> page, Query search) {
		return workPlanFlowPathMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath) {
		return workPlanFlowPathMapper.save(workPlanFlowPath);
	}

	@Override
	public WorkPlanFlowPathEntity getWorkPlanFlowPathById(Long id) {
		WorkPlanFlowPathEntity workPlanFlowPath = workPlanFlowPathMapper.getObjectById(id);
		return workPlanFlowPath;
	}

	@Override
	public int updateWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath) {
		return workPlanFlowPathMapper.update(workPlanFlowPath);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workPlanFlowPathMapper.batchRemove(id);
		return count;
	}
	
}
