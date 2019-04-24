package net.chenlin.dp.modules.workHangGround.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workHangGround.entity.WorkHangGroundEntity;
import net.chenlin.dp.modules.workHangGround.manager.WorkHangGroundManager;
import net.chenlin.dp.modules.workHangGround.service.WorkHangGroundService;

/**
 * 挂地线管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:25:30
 */
@Service("workHangGroundService")
public class WorkHangGroundServiceImpl implements WorkHangGroundService {

	@Autowired
	private WorkHangGroundManager workHangGroundManager;

	@Override
	public Page<WorkHangGroundEntity> listWorkHangGround(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkHangGroundEntity> page = new Page<>(query);
		workHangGroundManager.listWorkHangGround(page, query);
		return page;
	}

	@Override
	public R saveWorkHangGround(WorkHangGroundEntity role) {
		int count = workHangGroundManager.saveWorkHangGround(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkHangGroundById(Long id) {
		WorkHangGroundEntity workHangGround = workHangGroundManager.getWorkHangGroundById(id);
		return CommonUtils.msg(workHangGround);
	}

	@Override
	public R updateWorkHangGround(WorkHangGroundEntity workHangGround) {
		int count = workHangGroundManager.updateWorkHangGround(workHangGround);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workHangGroundManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
