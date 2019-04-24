package net.chenlin.dp.modules.workPlanAuthorizedStrength.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.entity.WorkPlanAuthorizedStrengthEntity;
import net.chenlin.dp.modules.workPlanAuthorizedStrength.service.WorkPlanAuthorizedStrengthService;

/**
 * 计划编制管理表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午11:13:34
 */
@RestController
@RequestMapping("/work/workPlanAuthorizedStrength")
public class WorkPlanAuthorizedStrengthController extends AbstractController {
	
	@Autowired
	private WorkPlanAuthorizedStrengthService workPlanAuthorizedStrengthService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkPlanAuthorizedStrengthEntity> list(@RequestBody Map<String, Object> params) {
		return workPlanAuthorizedStrengthService.listWorkPlanAuthorizedStrength(params);
	}
		
	/**
	 * 新增
	 * @param workPlanAuthorizedStrength
	 * @return
	 */
	@SysLog("新增计划编制管理表")
	@RequestMapping("/save")
	public R save(@RequestBody WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength) {
		return workPlanAuthorizedStrengthService.saveWorkPlanAuthorizedStrength(workPlanAuthorizedStrength);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workPlanAuthorizedStrengthService.getWorkPlanAuthorizedStrengthById(id);
	}
	
	/**
	 * 修改
	 * @param workPlanAuthorizedStrength
	 * @return
	 */
	@SysLog("修改计划编制管理表")
	@RequestMapping("/update")
	public R update(@RequestBody WorkPlanAuthorizedStrengthEntity workPlanAuthorizedStrength) {
		return workPlanAuthorizedStrengthService.updateWorkPlanAuthorizedStrength(workPlanAuthorizedStrength);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除计划编制管理表")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workPlanAuthorizedStrengthService.batchRemove(id);
	}
	
}
