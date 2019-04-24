package net.chenlin.dp.modules.workDispatchOrder.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workDispatchOrder.entity.WorkDispatchOrderEntity;
import net.chenlin.dp.modules.workDispatchOrder.service.WorkDispatchOrderService;

/**
 * 调度命令表
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午9:15:47
 */
@RestController
@RequestMapping("/work/workDispatchOrder")
public class WorkDispatchOrderController extends AbstractController {
	
	@Autowired
	private WorkDispatchOrderService workDispatchOrderService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkDispatchOrderEntity> list(@RequestBody Map<String, Object> params) {
		return workDispatchOrderService.listWorkDispatchOrder(params);
	}
		
	/**
	 * 新增
	 * @param workDispatchOrder
	 * @return
	 */
	@SysLog("新增调度命令表")
	@RequestMapping("/save")
	public R save(@RequestBody WorkDispatchOrderEntity workDispatchOrder) {
		return workDispatchOrderService.saveWorkDispatchOrder(workDispatchOrder);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workDispatchOrderService.getWorkDispatchOrderById(id);
	}
	
	/**
	 * 修改
	 * @param workDispatchOrder
	 * @return
	 */
	@SysLog("修改调度命令表")
	@RequestMapping("/update")
	public R update(@RequestBody WorkDispatchOrderEntity workDispatchOrder) {
		return workDispatchOrderService.updateWorkDispatchOrder(workDispatchOrder);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除调度命令表")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workDispatchOrderService.batchRemove(id);
	}
	
}
