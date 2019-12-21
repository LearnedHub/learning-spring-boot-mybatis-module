/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MariaDB
 Source Server Version : 100410
 Source Host           : localhost:3306
 Source Schema         : jobsz

 Target Server Type    : MariaDB
 Target Server Version : 100410
 File Encoding         : 65001

 Date: 16/12/2019 13:52:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mall_order
-- ----------------------------
DROP TABLE IF EXISTS `mall_order`;
CREATE TABLE `mall_order` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(10) unsigned DEFAULT NULL,
  `date` date DEFAULT NULL,
  `descr` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of mall_order
-- ----------------------------
BEGIN;
INSERT INTO `mall_order` VALUES (1, 1, '2019-12-09', '1');
INSERT INTO `mall_order` VALUES (2, 1, '2019-12-18', '2');
INSERT INTO `mall_order` VALUES (3, 1, '2019-12-09', '1575864798784');
INSERT INTO `mall_order` VALUES (4, 1, '2019-12-09', '1575864799234');
INSERT INTO `mall_order` VALUES (5, 1, '2019-12-09', '1575864799236');
INSERT INTO `mall_order` VALUES (6, 1, '2019-12-09', '1575864799244');
INSERT INTO `mall_order` VALUES (7, 1, '2019-12-09', '1575864799247');
INSERT INTO `mall_order` VALUES (8, 1, '2019-12-09', '1575864799248');
INSERT INTO `mall_order` VALUES (9, 1, '2019-12-09', '1575864799249');
INSERT INTO `mall_order` VALUES (10, 1, '2019-12-09', '1575864799251');
INSERT INTO `mall_order` VALUES (11, 1, '2019-12-09', '1575864799254');
INSERT INTO `mall_order` VALUES (12, 1, '2019-12-09', '1575864799255');
INSERT INTO `mall_order` VALUES (13, 11, '2019-12-09', '1575868726936');
INSERT INTO `mall_order` VALUES (14, 11, '2019-12-09', '1575868727368');
INSERT INTO `mall_order` VALUES (15, 11, '2019-12-09', '1575868727369');
INSERT INTO `mall_order` VALUES (16, 11, '2019-12-09', '1575868727370');
INSERT INTO `mall_order` VALUES (17, 11, '2019-12-09', '1575868727372');
INSERT INTO `mall_order` VALUES (18, 11, '2019-12-09', '1575868727373');
INSERT INTO `mall_order` VALUES (19, 11, '2019-12-09', '1575868727374');
INSERT INTO `mall_order` VALUES (20, 11, '2019-12-09', '1575868727376');
INSERT INTO `mall_order` VALUES (21, 11, '2019-12-09', '1575868727378');
INSERT INTO `mall_order` VALUES (22, 11, '2019-12-09', '1575868727379');
INSERT INTO `mall_order` VALUES (23, 11, '2019-12-09', '1575869016151');
INSERT INTO `mall_order` VALUES (24, 11, '2019-12-09', '1575869016582');
INSERT INTO `mall_order` VALUES (25, 11, '2019-12-09', '1575869016583');
INSERT INTO `mall_order` VALUES (26, 11, '2019-12-09', '1575869016583');
INSERT INTO `mall_order` VALUES (27, 11, '2019-12-09', '1575869016583');
INSERT INTO `mall_order` VALUES (28, 11, '2019-12-09', '1575869016583');
INSERT INTO `mall_order` VALUES (29, 11, '2019-12-09', '1575869016584');
INSERT INTO `mall_order` VALUES (30, 11, '2019-12-09', '1575869016584');
INSERT INTO `mall_order` VALUES (31, 11, '2019-12-09', '1575869016585');
INSERT INTO `mall_order` VALUES (32, 11, '2019-12-09', '1575869016585');
COMMIT;

-- ----------------------------
-- Table structure for mall_user
-- ----------------------------
DROP TABLE IF EXISTS `mall_user`;
CREATE TABLE `mall_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) COLLATE utf8mb4_bin NOT NULL,
  `addr` varchar(10) COLLATE utf8mb4_bin NOT NULL,
  `version` int(2) unsigned NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of mall_user
-- ----------------------------
BEGIN;
INSERT INTO `mall_user` VALUES (1, 'new啦啦', 'aaa', 3);
INSERT INTO `mall_user` VALUES (2, '辛辣名字7804', 'Addr', 12);
INSERT INTO `mall_user` VALUES (3, 'username', 'Addr', 3);
INSERT INTO `mall_user` VALUES (5, 'username', 'Addr', 4);
INSERT INTO `mall_user` VALUES (8, 'username', 'Addr', 5);
INSERT INTO `mall_user` VALUES (9, 'username', 'Addr', 6);
INSERT INTO `mall_user` VALUES (10, 'username', 'Addr', 7);
INSERT INTO `mall_user` VALUES (11, 'Jobsz', 'china', 8);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
