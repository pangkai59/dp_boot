package net.chenlin.dp.modules.workUseElectricity.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workUseElectricity.dao.WorkUseElectricityMapper;
import net.chenlin.dp.modules.workUseElectricity.entity.WorkUseElectricityEntity;
import net.chenlin.dp.modules.workUseElectricity.manager.WorkUseElectricityManager;

/**
 * 停送电管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:33:16
 */
@Component("workUseElectricityManager")
public class WorkUseElectricityManagerImpl implements WorkUseElectricityManager {

	@Autowired
	private WorkUseElectricityMapper workUseElectricityMapper;
	

	@Override
	public List<WorkUseElectricityEntity> listWorkUseElectricity(Page<WorkUseElectricityEntity> page, Query search) {
		return workUseElectricityMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkUseElectricity(WorkUseElectricityEntity workUseElectricity) {
		return workUseElectricityMapper.save(workUseElectricity);
	}

	@Override
	public WorkUseElectricityEntity getWorkUseElectricityById(Long id) {
		WorkUseElectricityEntity workUseElectricity = workUseElectricityMapper.getObjectById(id);
		return workUseElectricity;
	}

	@Override
	public int updateWorkUseElectricity(WorkUseElectricityEntity workUseElectricity) {
		return workUseElectricityMapper.update(workUseElectricity);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workUseElectricityMapper.batchRemove(id);
		return count;
	}
	
}
