package net.chenlin.dp.modules.workPlanFlowPath.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workPlanFlowPath.entity.WorkPlanFlowPathEntity;
import net.chenlin.dp.modules.workPlanFlowPath.service.WorkPlanFlowPathService;

/**
 * 计划流程管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:35:28
 */
@RestController
@RequestMapping("/work/workPlanFlowPath")
public class WorkPlanFlowPathController extends AbstractController {
	
	@Autowired
	private WorkPlanFlowPathService workPlanFlowPathService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkPlanFlowPathEntity> list(@RequestBody Map<String, Object> params) {
		return workPlanFlowPathService.listWorkPlanFlowPath(params);
	}
		
	/**
	 * 新增
	 * @param workPlanFlowPath
	 * @return
	 */
	@SysLog("新增计划流程管理表")
	@RequestMapping("/save")
	public R save(@RequestBody WorkPlanFlowPathEntity workPlanFlowPath) {
		return workPlanFlowPathService.saveWorkPlanFlowPath(workPlanFlowPath);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workPlanFlowPathService.getWorkPlanFlowPathById(id);
	}
	
	/**
	 * 修改
	 * @param workPlanFlowPath
	 * @return
	 */
	@SysLog("修改计划流程管理表")
	@RequestMapping("/update")
	public R update(@RequestBody WorkPlanFlowPathEntity workPlanFlowPath) {
		return workPlanFlowPathService.updateWorkPlanFlowPath(workPlanFlowPath);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除计划流程管理表")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workPlanFlowPathService.batchRemove(id);
	}
	
}
