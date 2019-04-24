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
import net.chenlin.dp.modules.goods.entity.GoodsEnquiryEntity;
import net.chenlin.dp.modules.goods.service.GoodsEnquiryService;

/**
 * 询价管理
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2019年4月19日 下午2:48:56
 */
@RestController
@RequestMapping("/goods/enquiry")
public class GoodsEnquiryController extends AbstractController {
	
	@Autowired
	private GoodsEnquiryService goodsEnquiryService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<GoodsEnquiryEntity> list(@RequestBody Map<String, Object> params) {
		return goodsEnquiryService.listGoodsEnquiry(params);
	}
		
	/**
	 * 新增
	 * @param goodsEnquiry
	 * @return
	 */
	@SysLog("新增询价管理")
	@RequestMapping("/save")
	public R save(@RequestBody GoodsEnquiryEntity goodsEnquiry) {
		return goodsEnquiryService.saveGoodsEnquiry(goodsEnquiry);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return goodsEnquiryService.getGoodsEnquiryById(id);
	}
	
	/**
	 * 修改
	 * @param goodsEnquiry
	 * @return
	 */
	@SysLog("修改询价管理")
	@RequestMapping("/update")
	public R update(@RequestBody GoodsEnquiryEntity goodsEnquiry) {
		return goodsEnquiryService.updateGoodsEnquiry(goodsEnquiry);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除询价管理")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return goodsEnquiryService.batchRemove(id);
	}
	
}
