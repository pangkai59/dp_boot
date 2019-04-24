package net.chenlin.dp.modules.workHangGround.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workHangGround.dao.WorkHangGroundMapper;
import net.chenlin.dp.modules.workHangGround.entity.WorkHangGroundEntity;
import net.chenlin.dp.modules.workHangGround.manager.WorkHangGroundManager;

/**
 * 挂地线管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:25:30
 */
@Component("workHangGroundManager")
public class WorkHangGroundManagerImpl implements WorkHangGroundManager {

	@Autowired
	private WorkHangGroundMapper workHangGroundMapper;
	

	@Override
	public List<WorkHangGroundEntity> listWorkHangGround(Page<WorkHangGroundEntity> page, Query search) {
		return workHangGroundMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkHangGround(WorkHangGroundEntity workHangGround) {
		return workHangGroundMapper.save(workHangGround);
	}

	@Override
	public WorkHangGroundEntity getWorkHangGroundById(Long id) {
		WorkHangGroundEntity workHangGround = workHangGroundMapper.getObjectById(id);
		return workHangGround;
	}

	@Override
	public int updateWorkHangGround(WorkHangGroundEntity workHangGround) {
		return workHangGroundMapper.update(workHangGround);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workHangGroundMapper.batchRemove(id);
		return count;
	}
	
}
