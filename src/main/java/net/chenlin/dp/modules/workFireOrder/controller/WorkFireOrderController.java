package net.chenlin.dp.modules.workFireOrder.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workFireOrder.entity.WorkFireOrderEntity;
import net.chenlin.dp.modules.workFireOrder.service.WorkFireOrderService;

/**
 * 动火令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:15:29
 */
@RestController
@RequestMapping("/work/workFireOrder")
public class WorkFireOrderController extends AbstractController {
	
	@Autowired
	private WorkFireOrderService workFireOrderService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkFireOrderEntity> list(@RequestBody Map<String, Object> params) {
		return workFireOrderService.listWorkFireOrder(params);
	}
		
	/**
	 * 新增
	 * @param workFireOrder
	 * @return
	 */
	@SysLog("新增动火令表")
	@RequestMapping("/save")
	public R save(@RequestBody WorkFireOrderEntity workFireOrder) {
		return workFireOrderService.saveWorkFireOrder(workFireOrder);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workFireOrderService.getWorkFireOrderById(id);
	}
	
	/**
	 * 修改
	 * @param workFireOrder
	 * @return
	 */
	@SysLog("修改动火令表")
	@RequestMapping("/update")
	public R update(@RequestBody WorkFireOrderEntity workFireOrder) {
		return workFireOrderService.updateWorkFireOrder(workFireOrder);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除动火令表")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workFireOrderService.batchRemove(id);
	}
	
}
