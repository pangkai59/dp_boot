package net.chenlin.dp.modules.workUseElectricity.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workUseElectricity.entity.WorkUseElectricityEntity;

/**
 * 停送电管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:33:16
 */
public interface WorkUseElectricityService {

	Page<WorkUseElectricityEntity> listWorkUseElectricity(Map<String, Object> params);
	
	R saveWorkUseElectricity(WorkUseElectricityEntity workUseElectricity);
	
	R getWorkUseElectricityById(Long id);
	
	R updateWorkUseElectricity(WorkUseElectricityEntity workUseElectricity);
	
	R batchRemove(Long[] id);
	
}
