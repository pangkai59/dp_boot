package net.chenlin.dp.modules.workForSite.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workForSite.entity.WorkForSiteEntity;
import net.chenlin.dp.modules.workForSite.service.WorkForSiteService;

/**
 * 施工请销点表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:28:10
 */
@RestController
@RequestMapping("/work/workForSite")
public class WorkForSiteController extends AbstractController {
	
	@Autowired
	private WorkForSiteService workForSiteService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkForSiteEntity> list(@RequestBody Map<String, Object> params) {
		return workForSiteService.listWorkForSite(params);
	}
		
	/**
	 * 新增
	 * @param workForSite
	 * @return
	 */
	@SysLog("新增施工请销点表")
	@RequestMapping("/save")
	public R save(@RequestBody WorkForSiteEntity workForSite) {
		return workForSiteService.saveWorkForSite(workForSite);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workForSiteService.getWorkForSiteById(id);
	}
	
	/**
	 * 修改
	 * @param workForSite
	 * @return
	 */
	@SysLog("修改施工请销点表")
	@RequestMapping("/update")
	public R update(@RequestBody WorkForSiteEntity workForSite) {
		return workForSiteService.updateWorkForSite(workForSite);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除施工请销点表")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workForSiteService.batchRemove(id);
	}
	
}
