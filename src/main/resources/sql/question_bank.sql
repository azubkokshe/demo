/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : question_bank

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-04-21 16:56:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_yu_module
-- ----------------------------
DROP TABLE IF EXISTS `t_yu_module`;
CREATE TABLE `t_yu_module` (
  `id` varchar(16) NOT NULL,
  `module_name` varchar(128) DEFAULT NULL COMMENT '模块名称',
  `question_count` int(3) DEFAULT NULL COMMENT '试题数量',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模块表';

-- ----------------------------
-- Table structure for t_yu_paper
-- ----------------------------
DROP TABLE IF EXISTS `t_yu_paper`;
CREATE TABLE `t_yu_paper` (
  `id` varchar(16) NOT NULL,
  `user_id` varchar(16) DEFAULT NULL,
  `paper_id` varchar(16) DEFAULT NULL COMMENT '试卷编码',
  `score` double DEFAULT '0' COMMENT '得分',
  `question_count` int(3) DEFAULT NULL COMMENT '题目数量',
  `correct_count` int(3) DEFAULT NULL COMMENT '正确数量',
  `wrong_count` int(3) DEFAULT NULL COMMENT '错误数量',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模拟试卷';

-- ----------------------------
-- Table structure for t_yu_paper_detail
-- ----------------------------
DROP TABLE IF EXISTS `t_yu_paper_detail`;
CREATE TABLE `t_yu_paper_detail` (
  `id` varchar(16) NOT NULL,
  `paper_id` varchar(16) DEFAULT NULL COMMENT '试卷编码',
  `question_id` varchar(16) DEFAULT NULL COMMENT '试题编码',
  `answer` varchar(16) DEFAULT NULL COMMENT '答案',
  `score` double DEFAULT NULL COMMENT '得分',
  `title_number` int(3) DEFAULT NULL COMMENT '题目序号',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='试卷详细表';

-- ----------------------------
-- Table structure for t_yu_question
-- ----------------------------
DROP TABLE IF EXISTS `t_yu_question`;
CREATE TABLE `t_yu_question` (
  `id` varchar(16) NOT NULL,
  `type` int(1) DEFAULT NULL COMMENT '试题类型 0=判断题 1=单选题 2=多选题',
  `question_auth` int(8) DEFAULT NULL COMMENT '试题权限类型 1=试用 2=非试用',
  `level` int(2) DEFAULT NULL COMMENT '试题等级 1=初级 2=中级 3=高级',
  `module_id` varchar(16) DEFAULT NULL COMMENT '模块编号 ',
  `correct_answer` varchar(10) DEFAULT NULL COMMENT '题目正确答案',
  `content` varchar(1024) DEFAULT NULL COMMENT '题目内容',
  `knowledge` varchar(128) DEFAULT NULL COMMENT '涉及知识点',
  `score` double DEFAULT NULL COMMENT '分值',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_yu_user
-- ----------------------------
DROP TABLE IF EXISTS `t_yu_user`;
CREATE TABLE `t_yu_user` (
  `id` varchar(16) NOT NULL,
  `user_name` varchar(16) DEFAULT NULL COMMENT '用户名',
  `password` varchar(16) DEFAULT NULL COMMENT '密码',
  `mobile` varchar(16) DEFAULT NULL COMMENT '手机号',
  `user_type` int(1) DEFAULT NULL COMMENT '用户类型 1=试用 2=付费',
  `create_time` datetime DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `expire_time` datetime DEFAULT NULL COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Table structure for t_yu_wrong_question
-- ----------------------------
DROP TABLE IF EXISTS `t_yu_wrong_question`;
CREATE TABLE `t_yu_wrong_question` (
  `id` varchar(16) NOT NULL,
  `question_id` varchar(16) DEFAULT NULL COMMENT '试题编码',
  `user_id` varchar(16) DEFAULT NULL COMMENT '用户编码',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='错题集';
