package net.chenlin.dp.modules.workForSite.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workForSite.dao.WorkForSiteMapper;
import net.chenlin.dp.modules.workForSite.entity.WorkForSiteEntity;
import net.chenlin.dp.modules.workForSite.manager.WorkForSiteManager;

/**
 * 施工请销点表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:28:10
 */
@Component("workForSiteManager")
public class WorkForSiteManagerImpl implements WorkForSiteManager {

	@Autowired
	private WorkForSiteMapper workForSiteMapper;
	

	@Override
	public List<WorkForSiteEntity> listWorkForSite(Page<WorkForSiteEntity> page, Query search) {
		return workForSiteMapper.listForPage(page, search);
	}

	@Override
	public int saveWorkForSite(WorkForSiteEntity workForSite) {
		return workForSiteMapper.save(workForSite);
	}

	@Override
	public WorkForSiteEntity getWorkForSiteById(Long id) {
		WorkForSiteEntity workForSite = workForSiteMapper.getObjectById(id);
		return workForSite;
	}

	@Override
	public int updateWorkForSite(WorkForSiteEntity workForSite) {
		return workForSiteMapper.update(workForSite);
	}

	@Override
	public int batchRemove(Long[] id) {
		int count = workForSiteMapper.batchRemove(id);
		return count;
	}
	
}
