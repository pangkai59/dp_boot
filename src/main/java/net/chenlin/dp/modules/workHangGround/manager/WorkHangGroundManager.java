package net.chenlin.dp.modules.workHangGround.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workHangGround.entity.WorkHangGroundEntity;

/**
 * 挂地线管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:25:30
 */
public interface WorkHangGroundManager {

	List<WorkHangGroundEntity> listWorkHangGround(Page<WorkHangGroundEntity> page, Query search);
	
	int saveWorkHangGround(WorkHangGroundEntity workHangGround);
	
	WorkHangGroundEntity getWorkHangGroundById(Long id);
	
	int updateWorkHangGround(WorkHangGroundEntity workHangGround);
	
	int batchRemove(Long[] id);
	
}
