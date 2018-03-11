/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : tds_service_db

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2018-03-06 16:27:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for b_exchange
-- ----------------------------
DROP TABLE IF EXISTS `b_exchange`;
CREATE TABLE `b_exchange` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `createDate` varchar(20) NOT NULL COMMENT '生成日期',
  `wangwang` varchar(50) NOT NULL COMMENT '旺旺名',
  `shopName` varchar(50) DEFAULT NULL COMMENT '店铺名',
  `product` varchar(50) DEFAULT NULL COMMENT '产品',
  `number` int(5) DEFAULT NULL COMMENT '数量',
  `reason` varchar(100) DEFAULT NULL COMMENT '申请原因',
  `requirement` varchar(100) DEFAULT NULL COMMENT '买家要求',
  `expressIn` varchar(50) DEFAULT NULL COMMENT '快递单号',
  `expressCmp` varchar(50) DEFAULT NULL COMMENT '快递公司',
  `recProduct` varchar(50) DEFAULT NULL COMMENT '收货产品',
  `recNumber` int(5) DEFAULT NULL COMMENT '收货数量',
  `isComplete` int(1) DEFAULT NULL COMMENT '外观是否完好',
  `isNormal` int(1) DEFAULT NULL COMMENT '功能是否正常',
  `isAgree` int(1) DEFAULT NULL COMMENT '是否同意退换',
  `resAgree` int(1) DEFAULT NULL COMMENT '是否同意退换',
  `result` varchar(100) DEFAULT NULL COMMENT '处理结果',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `expressNo` varchar(20) DEFAULT NULL COMMENT '寄出单号',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='退换货统计表';

-- ----------------------------
-- Table structure for b_repair
-- ----------------------------
DROP TABLE IF EXISTS `b_repair`;
CREATE TABLE `b_repair` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `createDate` varchar(20) NOT NULL COMMENT '生成日期',
  `wangwang` varchar(50) NOT NULL COMMENT '旺旺名',
  `shopName` varchar(50) DEFAULT NULL COMMENT '店铺名',
  `product` varchar(50) DEFAULT NULL COMMENT '产品',
  `number` int(5) DEFAULT NULL COMMENT '数量',
  `requirement` varchar(100) DEFAULT NULL COMMENT '买家要求',
  `isPay` int(1) DEFAULT NULL COMMENT '是否付款',
  `expressIn` varchar(50) DEFAULT NULL COMMENT '快递单号',
  `expressCmp` varchar(50) DEFAULT NULL COMMENT '快递公司',
  `recProduct` varchar(50) DEFAULT NULL COMMENT '收货产品',
  `recNumber` int(5) DEFAULT NULL COMMENT '收货数量',
  `status` varchar(20) DEFAULT NULL COMMENT '处理状态',
  `isOther` int(1) DEFAULT NULL COMMENT '是否有其他维修',
  `price` float DEFAULT NULL COMMENT '收费金额',
  `isSend` int(1) DEFAULT NULL COMMENT '是否寄出',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `expressNo` varchar(20) DEFAULT NULL COMMENT '寄出单号',
  `remark` varchar(500) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='寄修统计表';
