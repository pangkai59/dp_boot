package net.chenlin.dp.modules.workForSite.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.workForSite.entity.WorkForSiteEntity;
import net.chenlin.dp.modules.workForSite.manager.WorkForSiteManager;
import net.chenlin.dp.modules.workForSite.service.WorkForSiteService;

/**
 * 施工请销点表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:28:10
 */
@Service("workForSiteService")
public class WorkForSiteServiceImpl implements WorkForSiteService {

	@Autowired
	private WorkForSiteManager workForSiteManager;

	@Override
	public Page<WorkForSiteEntity> listWorkForSite(Map<String, Object> params) {
		Query query = new Query(params);
		Page<WorkForSiteEntity> page = new Page<>(query);
		workForSiteManager.listWorkForSite(page, query);
		return page;
	}

	@Override
	public R saveWorkForSite(WorkForSiteEntity role) {
		int count = workForSiteManager.saveWorkForSite(role);
		return CommonUtils.msg(count);
	}

	@Override
	public R getWorkForSiteById(Long id) {
		WorkForSiteEntity workForSite = workForSiteManager.getWorkForSiteById(id);
		return CommonUtils.msg(workForSite);
	}

	@Override
	public R updateWorkForSite(WorkForSiteEntity workForSite) {
		int count = workForSiteManager.updateWorkForSite(workForSite);
		return CommonUtils.msg(count);
	}

	@Override
	public R batchRemove(Long[] id) {
		int count = workForSiteManager.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
