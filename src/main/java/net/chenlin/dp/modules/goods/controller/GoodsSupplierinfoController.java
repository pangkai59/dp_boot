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
import net.chenlin.dp.modules.goods.entity.GoodsSupplierinfoEntity;
import net.chenlin.dp.modules.goods.service.GoodsSupplierinfoService;

/**
 * 供应商信息管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:52:36
 */
@RestController
@RequestMapping("/goods/supplierinfo")
public class GoodsSupplierinfoController extends AbstractController {
	
	@Autowired
	private GoodsSupplierinfoService goodsSupplierinfoService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsSupplierinfoEntity> list(@RequestBody Map<String, Object> params) {
		return goodsSupplierinfoService.listGoodsSupplierinfo(params);
	}
		
	/**
	 * 新增
	 * @param goodsSupplierinfo
	 * @return
	 */
	@SysLog("新增供应商信息管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsSupplierinfoEntity goodsSupplierinfo) {
		return goodsSupplierinfoService.saveGoodsSupplierinfo(goodsSupplierinfo);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsSupplierinfoService.getGoodsSupplierinfoById(id);
	}
	
	/**
	 * 修改
	 * @param goodsSupplierinfo
	 * @return
	 */
	@SysLog("修改供应商信息管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsSupplierinfoEntity goodsSupplierinfo) {
		return goodsSupplierinfoService.updateGoodsSupplierinfo(goodsSupplierinfo);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除供应商信息管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsSupplierinfoService.batchRemove(id);
	}
	
}
