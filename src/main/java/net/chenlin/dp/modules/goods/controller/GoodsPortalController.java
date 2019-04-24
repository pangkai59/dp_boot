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
import net.chenlin.dp.modules.goods.entity.GoodsPortalEntity;
import net.chenlin.dp.modules.goods.service.GoodsPortalService;

/**
 * 采购门户管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午3:36:23
 */
@RestController
@RequestMapping("/goods/portal")
public class GoodsPortalController extends AbstractController {
	
	@Autowired
	private GoodsPortalService goodsPortalService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsPortalEntity> list(@RequestBody Map<String, Object> params) {
		return goodsPortalService.listGoodsPortal(params);
	}
		
	/**
	 * 新增
	 * @param goodsPortal
	 * @return
	 */
	@SysLog("新增采购门户管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsPortalEntity goodsPortal) {
		return goodsPortalService.saveGoodsPortal(goodsPortal);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsPortalService.getGoodsPortalById(id);
	}
	
	/**
	 * 修改
	 * @param goodsPortal
	 * @return
	 */
	@SysLog("修改采购门户管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsPortalEntity goodsPortal) {
		return goodsPortalService.updateGoodsPortal(goodsPortal);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除采购门户管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsPortalService.batchRemove(id);
	}
	
}
