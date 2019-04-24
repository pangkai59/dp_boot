package net.chenlin.dp.modules.workHangGround.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.workHangGround.entity.WorkHangGroundEntity;
import net.chenlin.dp.modules.workHangGround.service.WorkHangGroundService;

/**
 * 挂地线管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月23日 上午10:25:30
 */
@RestController
@RequestMapping("/work/workHangGround")
public class WorkHangGroundController extends AbstractController {
	
	@Autowired
	private WorkHangGroundService workHangGroundService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<WorkHangGroundEntity> list(@RequestBody Map<String, Object> params) {
		return workHangGroundService.listWorkHangGround(params);
	}
		
	/**
	 * 新增
	 * @param workHangGround
	 * @return
	 */
	@SysLog("新增挂地线管理")
	@RequestMapping("/save")
	public R save(@RequestBody WorkHangGroundEntity workHangGround) {
		return workHangGroundService.saveWorkHangGround(workHangGround);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return workHangGroundService.getWorkHangGroundById(id);
	}
	
	/**
	 * 修改
	 * @param workHangGround
	 * @return
	 */
	@SysLog("修改挂地线管理")
	@RequestMapping("/update")
	public R update(@RequestBody WorkHangGroundEntity workHangGround) {
		return workHangGroundService.updateWorkHangGround(workHangGround);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除挂地线管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return workHangGroundService.batchRemove(id);
	}
	
}
