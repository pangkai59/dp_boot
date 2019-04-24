package net.chenlin.dp.modules.workDispatchOrder.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workDispatchOrder.dao.WorkDispatchOrderMapper;
import net.chenlin.dp.modules.workDispatchOrder.entity.WorkDispatchOrderEntity;
import net.chenlin.dp.modules.workDispatchOrder.manager.WorkDispatchOrderManager;

/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
@Component("workDispatchOrderManager")
public class WorkDispatchOrderManagerImpl implements WorkDispatchOrderManager {

	@Autowired
	private WorkDispatchOrderMapper workDispatchOrderMapper;
	

	@Override
	public List<WorkDispatchOrderEntity> listWorkDispatchOrder(Page<WorkDispatchOrderEntity> page, Query search) {
		return workDispatchOrderMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder) {
		return workDispatchOrderMapper.save(workDispatchOrder);
	}

	@Override
	public WorkDispatchOrderEntity getWorkDispatchOrderById(Long id) {
		WorkDispatchOrderEntity workDispatchOrder = workDispatchOrderMapper.getObjectById(id);
		return workDispatchOrder;
	}

	@Override
	public int updateWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder) {
		return workDispatchOrderMapper.update(workDispatchOrder);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workDispatchOrderMapper.batchRemove(id);
		return count;
	}
	
}
