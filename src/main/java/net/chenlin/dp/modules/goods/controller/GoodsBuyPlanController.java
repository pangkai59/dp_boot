package net.chenlin.dp.modules.goods.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.goods.entity.GoodsBuyPlanEntity;
import net.chenlin.dp.modules.goods.service.GoodsBuyPlanService;

/**
 * 
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月18日 下午4:17:35
 */
@RestController
@RequestMapping("/goods/buyPlan")
public class GoodsBuyPlanController extends AbstractController {
	
	@Autowired
	private GoodsBuyPlanService goodsBuyPlanService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsBuyPlanEntity> list(@RequestBody Map<String, Object> params) {
		return goodsBuyPlanService.listGoodsBuyPlan(params);
	}
		
	/**
	 * 新增
	 * @param goodsBuyPlan
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsBuyPlanEntity goodsBuyPlan) {
		return goodsBuyPlanService.saveGoodsBuyPlan(goodsBuyPlan);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsBuyPlanService.getGoodsBuyPlanById(id);
	}
	
	/**
	 * 修改
	 * @param goodsBuyPlan
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsBuyPlanEntity goodsBuyPlan) {
		return goodsBuyPlanService.updateGoodsBuyPlan(goodsBuyPlan);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsBuyPlanService.batchRemove(id);
	}
	
}
