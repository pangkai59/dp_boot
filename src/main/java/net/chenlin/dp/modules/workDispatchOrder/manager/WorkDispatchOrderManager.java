package net.chenlin.dp.modules.workDispatchOrder.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workDispatchOrder.entity.WorkDispatchOrderEntity;

/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
public interface WorkDispatchOrderManager {

	List<WorkDispatchOrderEntity> listWorkDispatchOrder(Page<WorkDispatchOrderEntity> page, Query search);
	
	int saveWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder);
	
	WorkDispatchOrderEntity getWorkDispatchOrderById(Long id);
	
	int updateWorkDispatchOrder(WorkDispatchOrderEntity workDispatchOrder);
	
	int batchRemove(Long[] id);
	
}
