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
import net.chenlin.dp.modules.goods.entity.GoodsRepertoryEntity;
import net.chenlin.dp.modules.goods.service.GoodsRepertoryService;

/**
 * 库存管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:53:26
 */
@RestController
@RequestMapping("/goods/repertory")
public class GoodsRepertoryController extends AbstractController {
	
	@Autowired
	private GoodsRepertoryService goodsRepertoryService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsRepertoryEntity> list(@RequestBody Map<String, Object> params) {
		return goodsRepertoryService.listGoodsRepertory(params);
	}
		
	/**
	 * 新增
	 * @param goodsRepertory
	 * @return
	 */
	@SysLog("新增库存管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsRepertoryEntity goodsRepertory) {
		return goodsRepertoryService.saveGoodsRepertory(goodsRepertory);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsRepertoryService.getGoodsRepertoryById(id);
	}
	
	/**
	 * 修改
	 * @param goodsRepertory
	 * @return
	 */
	@SysLog("修改库存管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsRepertoryEntity goodsRepertory) {
		return goodsRepertoryService.updateGoodsRepertory(goodsRepertory);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除库存管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsRepertoryService.batchRemove(id);
	}
	
}
