package net.chenlin.dp.modules.workFireOrder.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workFireOrder.entity.WorkFireOrderEntity;

/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
public interface WorkFireOrderManager {

	List<WorkFireOrderEntity> listWorkFireOrder(Page<WorkFireOrderEntity> page, Query search);
	
	int saveWorkFireOrder(WorkFireOrderEntity workFireOrder);
	
	WorkFireOrderEntity getWorkFireOrderById(Long id);
	
	int updateWorkFireOrder(WorkFireOrderEntity workFireOrder);
	
	int batchRemove(Long[] id);
	
}
