/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : sports_lotteries

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2018-06-02 23:08:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_information
-- ----------------------------
DROP TABLE IF EXISTS `user_information`;
CREATE TABLE `user_information` (
  `id` varchar(30) NOT NULL,
  `continuous_days` int(10) DEFAULT NULL,
  `score` int(10) DEFAULT NULL,
  `last_sign_in` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_information
-- ----------------------------
