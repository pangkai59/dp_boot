package net.chenlin.dp.modules.workDispatchOrder.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workDispatchOrder.entity.WorkDispatchOrderEntity;

/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
public interface WorkDispatchOrderService {

	Page<WorkDispatchOrderEntity> listWorkDispatchOrder(Map<String, Object> params);
	
	R saveWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder);
	
	R getWorkDispatchOrderById(Long id);
	
	R updateWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder);
	
	R batchRemove(Long[] id);
	
}
