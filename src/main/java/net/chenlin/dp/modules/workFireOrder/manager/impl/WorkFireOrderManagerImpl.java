package net.chenlin.dp.modules.workFireOrder.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workFireOrder.dao.WorkFireOrderMapper;
import net.chenlin.dp.modules.workFireOrder.entity.WorkFireOrderEntity;
import net.chenlin.dp.modules.workFireOrder.manager.WorkFireOrderManager;

/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
@Component("workFireOrderManager")
public class WorkFireOrderManagerImpl implements WorkFireOrderManager {

	@Autowired
	private WorkFireOrderMapper workFireOrderMapper;
	

	@Override
	public List<WorkFireOrderEntity> listWorkFireOrder(Page<WorkFireOrderEntity> page, Query search) {
		return workFireOrderMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkFireOrder(WorkFireOrderEntity workFireOrder) {
		return workFireOrderMapper.save(workFireOrder);
	}

	@Override
	public WorkFireOrderEntity getWorkFireOrderById(Long id) {
		WorkFireOrderEntity workFireOrder = workFireOrderMapper.getObjectById(id);
		return workFireOrder;
	}

	@Override
	public int updateWorkFireOrder(WorkFireOrderEntity workFireOrder) {
		return workFireOrderMapper.update(workFireOrder);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workFireOrderMapper.batchRemove(id);
		return count;
	}
	
}
