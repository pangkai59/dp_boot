/*
Navicat MySQL Data Transfer

Source Server         : mysql192.168.180.134
Source Server Version : 50548
Source Host           : 192.168.180.134:3306
Source Database       : dp-lte

Target Server Type    : MYSQL
Target Server Version : 50548
File Encoding         : 65001

Date: 2017-08-28 16:36:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_area
-- ----------------------------
DROP TABLE IF EXISTS `sys_area`;
CREATE TABLE `sys_area` (
  `area_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '区域id',
  `area_code` varchar(50) NOT NULL COMMENT '行政区划代码',
  `parent_code` varchar(50) NOT NULL COMMENT '父级id',
  `name` varchar(20) DEFAULT NULL COMMENT '地区名称',
  `layer` int(11) DEFAULT NULL COMMENT '层级',
  `order_num` int(11) DEFAULT NULL COMMENT '排序号,1:省级,2:地市,3:区县',
  `status` tinyint(4) DEFAULT NULL COMMENT '显示,1:显示,0:隐藏',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`area_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3509 DEFAULT CHARSET=utf8 COMMENT='行政区划';

-- ----------------------------
-- Records of sys_area
-- ----------------------------
INSERT INTO `sys_area` VALUES ('1', '110000', '0', '北京市', '1', '1', '1', '', '2017-04-24 15:54:31', '2017-08-19 00:29:54');
INSERT INTO `sys_area` VALUES ('2', '110100', '110000', '市辖区', '2', '1', '1', null, '2017-04-24 15:54:31', '2017-08-19 00:03:43');
INSERT INTO `sys_area` VALUES ('3', '110101', '110100', '东城区', '3', '1', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('4', '110102', '110100', '西城区', '3', '2', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('5', '110105', '110100', '朝阳区', '3', '3', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('6', '110106', '110100', '丰台区', '3', '4', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('7', '110107', '110100', '石景山区', '3', '5', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('8', '110108', '110100', '海淀区', '3', '6', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('9', '110109', '110100', '门头沟区', '3', '7', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('10', '110111', '110100', '房山区', '3', '8', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('11', '110112', '110100', '通州区', '3', '9', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('12', '110113', '110100', '顺义区', '3', '10', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('13', '110114', '110100', '昌平区', '3', '11', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('14', '110115', '110100', '大兴区', '3', '12', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('15', '110116', '110100', '怀柔区', '3', '13', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('16', '110117', '110100', '平谷区', '3', '14', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('17', '110118', '110100', '密云区', '3', '15', '1', null, '2017-04-24 15:54:31', null);
INSERT INTO `sys_area` VALUES ('18', '110119', '110100', '延庆区', '3', '16', '1', null, '2017-04-24 15:54:31', null);


-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `operation` varchar(50) DEFAULT NULL COMMENT '用户操作',
  `time` int(11) DEFAULT NULL COMMENT '响应时间',
  `method` varchar(200) DEFAULT NULL COMMENT '请求方法',
  `params` varchar(5000) DEFAULT NULL COMMENT '请求参数',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IP地址',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COMMENT='系统日志';

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('1', '1', 'admin', '登录', '232', 'net.chenlin.dp.shiro.controller.SysLoginController.login()', '\"admin\"', '0:0:0:0:0:0:0:1', '2017-08-21 17:08:39');
INSERT INTO `sys_log` VALUES ('2', '1', 'admin', '登录', '107', 'net.chenlin.dp.shiro.controller.SysLoginController.login()', '\"admin\"', '0:0:0:0:0:0:0:1', '2017-08-21 17:16:27');
INSERT INTO `sys_log` VALUES ('3', '1', 'admin', '新增菜单', '8', 'net.chenlin.dp.shiro.controller.SysMenuController.save()', '{\"name\":\"行政区域\",\"orderNum\":0,\"parentId\":1,\"parentName\":\"基础管理\",\"type\":1,\"url\":\"base/area/list.html\"}', '0:0:0:0:0:0:0:1', '2017-08-21 17:21:18');
INSERT INTO `sys_log` VALUES ('4', '1', 'admin', '修改菜单', '146', 'net.chenlin.dp.shiro.controller.SysMenuController.update()', '{\"icon\":\"fa fa-leaf\",\"menuId\":37,\"name\":\"行政区域\",\"orderNum\":0,\"parentId\":1,\"parentName\":\"基础管理\",\"type\":1,\"url\":\"base/area/list.html\"}', '0:0:0:0:0:0:0:1', '2017-08-21 17:21:41');
INSERT INTO `sys_log` VALUES ('5', '1', 'admin', '分配权限', '10', 'net.chenlin.dp.shiro.controller.SysRoleController.updateRoleAuthorization()', '{\"menuIdList\":[1,37,4,32,33,34,35,27,28,29,30,3,6,11,12,13,14,24,25,26,7,15,16,17,18,19,2,20,21,22,23],\"remark\":\"【系统内置】\",\"roleId\":1,\"roleName\":\"超级管理员\",\"roleSign\":\"admin\"}', '0:0:0:0:0:0:0:1', '2017-08-21 17:21:53');
INSERT INTO `sys_log` VALUES ('6', '1', 'admin', '分配权限', '18', 'net.chenlin.dp.shiro.controller.SysRoleController.updateRoleAuthorization()', '{\"menuIdList\":[1,37,38,39,40,41,4,32,33,34,35,27,28,29,30,3,6,11,12,13,14,24,25,26,7,15,16,17,18,19,2,20,21,22,23],\"remark\":\"【系统内置】\",\"roleId\":1,\"roleName\":\"超级管理员\",\"roleSign\":\"admin\"}', '0:0:0:0:0:0:0:1', '2017-08-21 17:25:03');



-- ----------------------------
-- Table structure for sys_macro
-- ----------------------------
DROP TABLE IF EXISTS `sys_macro`;
CREATE TABLE `sys_macro` (
  `macro_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_id` bigint(255) DEFAULT NULL COMMENT '父级id',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `value` varchar(2000) DEFAULT NULL COMMENT '值',
  `status` tinyint(4) DEFAULT '1' COMMENT '状态，0：隐藏   1：显示',
  `type` tinyint(20) DEFAULT NULL COMMENT '类型,0:目录，1:参数配置',
  `order_num` int(11) DEFAULT NULL COMMENT '排序',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`macro_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='通用字典表';

-- ----------------------------
-- Records of sys_macro
-- ----------------------------
INSERT INTO `sys_macro` VALUES ('1', '0', '系统参数', null, '1', '0', '0', null, '2017-08-15 14:51:27', null);
INSERT INTO `sys_macro` VALUES ('2', '1', '用户状态', 'userStatus', '1', '0', '0', null, '2017-08-15 14:51:30', null);
INSERT INTO `sys_macro` VALUES ('3', '2', '正常', '1', '0', '1', '0', '用户可登录', '2017-08-15 14:52:48', '2017-08-15 20:23:29');
INSERT INTO `sys_macro` VALUES ('4', '2', '禁用', '0', '1', '1', '0', '禁止用户登录', '2017-08-15 14:52:51', '2017-08-15 20:44:42');
INSERT INTO `sys_macro` VALUES ('5', '0', '客户关系', ' clientManage', '1', '0', '1', null, '2017-08-15 19:58:24', null);
INSERT INTO `sys_macro` VALUES ('6', '5', '产品信息', 'clientProduct', '1', '0', '0', null, '2017-08-15 19:59:06', null);
