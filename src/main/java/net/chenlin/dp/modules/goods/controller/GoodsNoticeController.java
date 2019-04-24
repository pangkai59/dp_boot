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
import net.chenlin.dp.modules.goods.entity.GoodsNoticeEntity;
import net.chenlin.dp.modules.goods.service.GoodsNoticeService;

/**
 * 公告管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:50:58
 */
@RestController
@RequestMapping("/goods/notice")
public class GoodsNoticeController extends AbstractController {
	
	@Autowired
	private GoodsNoticeService goodsNoticeService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsNoticeEntity> list(@RequestBody Map<String, Object> params) {
		return goodsNoticeService.listGoodsNotice(params);
	}
		
	/**
	 * 新增
	 * @param goodsNotice
	 * @return
	 */
	@SysLog("新增公告管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsNoticeEntity goodsNotice) {
		return goodsNoticeService.saveGoodsNotice(goodsNotice);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsNoticeService.getGoodsNoticeById(id);
	}
	
	/**
	 * 修改
	 * @param goodsNotice
	 * @return
	 */
	@SysLog("修改公告管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsNoticeEntity goodsNotice) {
		return goodsNoticeService.updateGoodsNotice(goodsNotice);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除公告管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsNoticeService.batchRemove(id);
	}
	
}
