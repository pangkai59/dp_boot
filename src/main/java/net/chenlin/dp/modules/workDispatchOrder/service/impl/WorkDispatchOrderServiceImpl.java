package net.chenlin.dp.modules.workDispatchOrder.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workDispatchOrder.entity.WorkDispatchOrderEntity;
import net.chenlin.dp.modules.workDispatchOrder.manager.WorkDispatchOrderManager;
import net.chenlin.dp.modules.workDispatchOrder.service.WorkDispatchOrderService;

/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
@Service("workDispatchOrderService")
public class WorkDispatchOrderServiceImpl implements WorkDispatchOrderService {

	@Autowired
	private WorkDispatchOrderManager workDispatchOrderManager;

	@Override
	public Page<WorkDispatchOrderEntity> listWorkDispatchOrder(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkDispatchOrderEntity> page = new Page<>(query);
		workDispatchOrderManager.listWorkDispatchOrder(page, query);
		return page;
	}

	@Override
	public R saveWorkDispatchOrder(WorkDispatchOrderEntity role) {
		int count = workDispatchOrderManager.saveWorkDispatchOrder(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkDispatchOrderById(Long id) {
		WorkDispatchOrderEntity workDispatchOrder = workDispatchOrderManager.getWorkDispatchOrderById(id);
		return CommonUtils.msg(workDispatchOrder);
	}

	@Override
	public R updateWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder) {
		int count = workDispatchOrderManager.updateWorkDispatchOrder(workDispatchOrder);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workDispatchOrderManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
