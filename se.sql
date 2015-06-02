/*
Navicat MySQL Data Transfer

Source Server         : UML02
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : se

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2015-05-30 08:49:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('root', '1234');

-- ----------------------------
-- Table structure for vipinformation
-- ----------------------------
DROP TABLE IF EXISTS `vipinformation`;
CREATE TABLE `vipinformation` (
  `VipNum` char(255) NOT NULL,
  `Phone` char(255) NOT NULL,
  `VipName` char(255) NOT NULL,
  `Sex` char(255) NOT NULL,
  `VipID` char(255) NOT NULL,
  PRIMARY KEY (`VipNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipinformation
-- ----------------------------
INSERT INTO `vipinformation` VALUES ('001', '11223344550', '张三', '女', '110011001100110022');
INSERT INTO `vipinformation` VALUES ('002', '18463123456', '李四', '男', '112211221122112233');
INSERT INTO `vipinformation` VALUES ('003', '18363123456', '王五', '男', '370612111111111111');
INSERT INTO `vipinformation` VALUES ('004', '1856312456', '傻缺', '女', '125486695544445820');
