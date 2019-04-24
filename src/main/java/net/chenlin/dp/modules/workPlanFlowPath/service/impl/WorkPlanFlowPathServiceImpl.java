package net.chenlin.dp.modules.workPlanFlowPath.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workPlanFlowPath.entity.WorkPlanFlowPathEntity;
import net.chenlin.dp.modules.workPlanFlowPath.manager.WorkPlanFlowPathManager;
import net.chenlin.dp.modules.workPlanFlowPath.service.WorkPlanFlowPathService;

/**
 * 计划流程管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:35:28
 */
@Service("workPlanFlowPathService")
public class WorkPlanFlowPathServiceImpl implements WorkPlanFlowPathService {

	@Autowired
	private WorkPlanFlowPathManager workPlanFlowPathManager;

	@Override
	public Page<WorkPlanFlowPathEntity> listWorkPlanFlowPath(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkPlanFlowPathEntity> page = new Page<>(query);
		workPlanFlowPathManager.listWorkPlanFlowPath(page, query);
		return page;
	}

	@Override
	public R saveWorkPlanFlowPath(WorkPlanFlowPathEntity role) {
		int count = workPlanFlowPathManager.saveWorkPlanFlowPath(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkPlanFlowPathById(Long id) {
		WorkPlanFlowPathEntity workPlanFlowPath = workPlanFlowPathManager.getWorkPlanFlowPathById(id);
		return CommonUtils.msg(workPlanFlowPath);
	}

	@Override
	public R updateWorkPlanFlowPath(WorkPlanFlowPathEntity workPlanFlowPath) {
		int count = workPlanFlowPathManager.updateWorkPlanFlowPath(workPlanFlowPath);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workPlanFlowPathManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
