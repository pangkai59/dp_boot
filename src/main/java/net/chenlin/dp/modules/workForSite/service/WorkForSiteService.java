package net.chenlin.dp.modules.workForSite.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workForSite.entity.WorkForSiteEntity;

/**
 * 施工请销点表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:28:10
 */
public interface WorkForSiteService {

	Page<WorkForSiteEntity> listWorkForSite(Map<String, Object> params);
	
	R saveWorkForSite(WorkForSiteEntity workForSite);
	
	R getWorkForSiteById(Long id);
	
	R updateWorkForSite(WorkForSiteEntity workForSite);
	
	R batchRemove(Long[] id);
	
}
