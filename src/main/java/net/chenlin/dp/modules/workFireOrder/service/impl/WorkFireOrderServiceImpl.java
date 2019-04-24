package net.chenlin.dp.modules.workFireOrder.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workFireOrder.entity.WorkFireOrderEntity;
import net.chenlin.dp.modules.workFireOrder.manager.WorkFireOrderManager;
import net.chenlin.dp.modules.workFireOrder.service.WorkFireOrderService;

/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
@Service("workFireOrderService")
public class WorkFireOrderServiceImpl implements WorkFireOrderService {

	@Autowired
	private WorkFireOrderManager workFireOrderManager;

	@Override
	public Page<WorkFireOrderEntity> listWorkFireOrder(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkFireOrderEntity> page = new Page<>(query);
		workFireOrderManager.listWorkFireOrder(page, query);
		return page;
	}

	@Override
	public R saveWorkFireOrder(WorkFireOrderEntity role) {
		int count = workFireOrderManager.saveWorkFireOrder(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkFireOrderById(Long id) {
		WorkFireOrderEntity workFireOrder = workFireOrderManager.getWorkFireOrderById(id);
		return CommonUtils.msg(workFireOrder);
	}

	@Override
	public R updateWorkFireOrder(WorkFireOrderEntity workFireOrder) {
		int count = workFireOrderManager.updateWorkFireOrder(workFireOrder);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workFireOrderManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
