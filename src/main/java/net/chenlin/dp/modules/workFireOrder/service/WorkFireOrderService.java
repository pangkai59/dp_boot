package net.chenlin.dp.modules.workFireOrder.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workFireOrder.entity.WorkFireOrderEntity;

/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
public interface WorkFireOrderService {

	Page<WorkFireOrderEntity> listWorkFireOrder(Map<String, Object> params);
	
	R saveWorkFireOrder(WorkFireOrderEntity workFireOrder);
	
	R getWorkFireOrderById(Long id);
	
	R updateWorkFireOrder(WorkFireOrderEntity workFireOrder);
	
	R batchRemove(Long[] id);
	
}
