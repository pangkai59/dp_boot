package net.chenlin.dp.modules.workUseElectricity.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workUseElectricity.entity.WorkUseElectricityEntity;
import net.chenlin.dp.modules.workUseElectricity.manager.WorkUseElectricityManager;
import net.chenlin.dp.modules.workUseElectricity.service.WorkUseElectricityService;

/**
 * 停送电管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:33:16
 */
@Service("workUseElectricityService")
public class WorkUseElectricityServiceImpl implements WorkUseElectricityService {

	@Autowired
	private WorkUseElectricityManager workUseElectricityManager;

	@Override
	public Page<WorkUseElectricityEntity> listWorkUseElectricity(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkUseElectricityEntity> page = new Page<>(query);
		workUseElectricityManager.listWorkUseElectricity(page, query);
		return page;
	}

	@Override
	public R saveWorkUseElectricity(WorkUseElectricityEntity role) {
		int count = workUseElectricityManager.saveWorkUseElectricity(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkUseElectricityById(Long id) {
		WorkUseElectricityEntity workUseElectricity = workUseElectricityManager.getWorkUseElectricityById(id);
		return CommonUtils.msg(workUseElectricity);
	}

	@Override
	public R updateWorkUseElectricity(WorkUseElectricityEntity workUseElectricity) {
		int count = workUseElectricityManager.updateWorkUseElectricity(workUseElectricity);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workUseElectricityManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
