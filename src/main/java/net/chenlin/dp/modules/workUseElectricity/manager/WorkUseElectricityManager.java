package net.chenlin.dp.modules.workUseElectricity.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workUseElectricity.entity.WorkUseElectricityEntity;

/**
 * 停送电管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:33:16
 */
public interface WorkUseElectricityManager {

	List<WorkUseElectricityEntity> listWorkUseElectricity(Page<WorkUseElectricityEntity> page, Query search);
	
	int saveWorkUseElectricity(WorkUseElectricityEntity workUseElectricity);
	
	WorkUseElectricityEntity getWorkUseElectricityById(Long id);
	
	int updateWorkUseElectricity(WorkUseElectricityEntity workUseElectricity);
	
	int batchRemove(Long[] id);
	
}
