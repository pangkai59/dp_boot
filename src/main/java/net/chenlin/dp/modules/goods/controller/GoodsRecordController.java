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
import net.chenlin.dp.modules.goods.entity.GoodsRecordEntity;
import net.chenlin.dp.modules.goods.service.GoodsRecordService;

/**
 * 项目档案管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:51:35
 */
@RestController
@RequestMapping("/goods/record")
public class GoodsRecordController extends AbstractController {
	
	@Autowired
	private GoodsRecordService goodsRecordService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsRecordEntity> list(@RequestBody Map<String, Object> params) {
		return goodsRecordService.listGoodsRecord(params);
	}
		
	/**
	 * 新增
	 * @param goodsRecord
	 * @return
	 */
	@SysLog("新增项目档案管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsRecordEntity goodsRecord) {
		return goodsRecordService.saveGoodsRecord(goodsRecord);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsRecordService.getGoodsRecordById(id);
	}
	
	/**
	 * 修改
	 * @param goodsRecord
	 * @return
	 */
	@SysLog("修改项目档案管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsRecordEntity goodsRecord) {
		return goodsRecordService.updateGoodsRecord(goodsRecord);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除项目档案管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsRecordService.batchRemove(id);
	}
	
}
