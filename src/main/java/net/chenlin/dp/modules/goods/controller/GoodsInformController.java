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
import net.chenlin.dp.modules.goods.entity.GoodsInformEntity;
import net.chenlin.dp.modules.goods.service.GoodsInformService;

/**
 * 系统通知管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:48
 */
@RestController
@RequestMapping("/goods/inform")
public class GoodsInformController extends AbstractController {
	
	@Autowired
	private GoodsInformService goodsInformService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsInformEntity> list(@RequestBody Map<String, Object> params) {
		return goodsInformService.listGoodsInform(params);
	}
		
	/**
	 * 新增
	 * @param goodsInform
	 * @return
	 */
	@SysLog("新增系统通知管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsInformEntity goodsInform) {
		return goodsInformService.saveGoodsInform(goodsInform);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsInformService.getGoodsInformById(id);
	}
	
	/**
	 * 修改
	 * @param goodsInform
	 * @return
	 */
	@SysLog("修改系统通知管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsInformEntity goodsInform) {
		return goodsInformService.updateGoodsInform(goodsInform);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除系统通知管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsInformService.batchRemove(id);
	}
	
}
