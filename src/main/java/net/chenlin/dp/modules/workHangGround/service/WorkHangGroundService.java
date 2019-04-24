package net.chenlin.dp.modules.workHangGround.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workHangGround.entity.WorkHangGroundEntity;

/**
 * 挂地线管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:25:30
 */
public interface WorkHangGroundService {

	Page<WorkHangGroundEntity> listWorkHangGround(Map<String, Object> params);
	
	R saveWorkHangGround(WorkHangGroundEntity workHangGround);
	
	R getWorkHangGroundById(Long id);
	
	R updateWorkHangGround(WorkHangGroundEntity workHangGround);
	
	R batchRemove(Long[] id);
	
}
