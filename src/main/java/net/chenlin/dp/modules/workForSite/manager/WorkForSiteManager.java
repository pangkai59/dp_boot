package net.chenlin.dp.modules.workForSite.manager;

import java.util.List;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.modules.workForSite.entity.WorkForSiteEntity;

/**
 * 施工请销点表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:28:10
 */
public interface WorkForSiteManager {

	List<WorkForSiteEntity> listWorkForSite(Page<WorkForSiteEntity> page, Query search);
	
	int saveWorkForSite(WorkForSiteEntity workForSite);
	
	WorkForSiteEntity getWorkForSiteById(Long id);
	
	int updateWorkForSite(WorkForSiteEntity workForSite);
	
	int batchRemove(Long[] id);
	
}
