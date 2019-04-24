package net.chenlin.dp.modules.workUseElectricity.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workUseElectricity.entity.WorkUseElectricityEntity;
import net.chenlin.dp.modules.workUseElectricity.service.WorkUseElectricityService;

/**
 * 停送电管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:33:16
 */
@RestController
@RequestMapping("/work/workUseElectricity")
public class WorkUseElectricityController extends AbstractController {
	
	@Autowired
	private WorkUseElectricityService workUseElectricityService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkUseElectricityEntity> list(@RequestBody Map<String, Object> params) {
		return workUseElectricityService.listWorkUseElectricity(params);
	}
		
	/**
	 * 新增
	 * @param workUseElectricity
	 * @return
	 */
	@SysLog("新增停送电管理")
	@RequestMapping("/save")
	public R save(@RequestBody WorkUseElectricityEntity workUseElectricity) {
		return workUseElectricityService.saveWorkUseElectricity(workUseElectricity);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workUseElectricityService.getWorkUseElectricityById(id);
	}
	
	/**
	 * 修改
	 * @param workUseElectricity
	 * @return
	 */
	@SysLog("修改停送电管理")
	@RequestMapping("/update")
	public R update(@RequestBody WorkUseElectricityEntity workUseElectricity) {
		return workUseElectricityService.updateWorkUseElectricity(workUseElectricity);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除停送电管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workUseElectricityService.batchRemove(id);
	}
	
}
