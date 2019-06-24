-- create database liveline;
use liveline;

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_enable` varchar(255) DEFAULT '0' COMMENT '是否禁用登录',
  `login_error` int(11) DEFAULT NULL COMMENT '登录失败次数',
  `login_last_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `account_portrait` varchar(255) DEFAULT NULL COMMENT '头像',
  `account_explain` varchar(255) DEFAULT NULL COMMENT '说明',
  `account_display_name` varchar(255) DEFAULT NULL COMMENT '显示名称',
  `account_email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `account_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `account_pwd` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

select * from `account`

-- alter table account add `birthday` timestamp      DEFAULT CURRENT_TIMESTAMP COMMENT '用户的生日';


-- 需求 照顾一只猫猫，
-- ----------------------------
-- Table structure for requirement
-- ----------------------------
DROP TABLE IF EXISTS `requirement`;
CREATE TABLE `requirement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) DEFAULT NULL COMMENT '发表用户',
  `requirement_content` longtext COMMENT '需求内容html格式',
  `requirement_content_md` longtext COMMENT '需求内容Markdown格式',
  `requirement_newstime` datetime DEFAULT NULL COMMENT '发布时间',
  `requirement_status` int(11) DEFAULT NULL COMMENT '需求状态 0已发布1草稿2回收站 3已认领，4已处理',

  `requirement_summary` varchar(255) DEFAULT NULL COMMENT '需求摘要',
  `requirement_thumbnail` varchar(255) DEFAULT NULL COMMENT '略缩图',
  `requirement_title` varchar(255) DEFAULT NULL COMMENT '需求标题',
--   `requirement_type` int(255) DEFAULT NULL COMMENT '文章类型0原创1转载',
--   `requirement_post` varchar(255) DEFAULT NULL COMMENT 'post文章 page页面',
  `requirement_comment` int(11) DEFAULT NULL COMMENT '是否开启评论 0开启1不开启',
  `requirement_updatetime` datetime DEFAULT NULL COMMENT '需求最后修改时间',
  `requirement_url` varchar(255) DEFAULT NULL COMMENT '需求路径',
  `requirement_views` bigint(20) DEFAULT '0' COMMENT '访问量统计',
  PRIMARY KEY (`id`),
  UNIQUE KEY `MAYDAY_ARTICLE_URL` (`requirement_url`) USING BTREE,
  KEY `MAYDAY_ARTICLE_USERID` (`account_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=146 DEFAULT CHARSET=utf8;



-- 活动 组队去拍摄
-- DROP TABLE IF EXISTS `requirement`;
-- CREATE TABLE `requirement` (
--   `id`           CHAR(32) 	NOT NULL,
--   `title`        VARCHAR(30) 	DEFAULT NULL COMMENT '标题',
--   `content`		   text	DEFAULT NULL COMMENT '内容',
--   `state`		     INT(1)	DEFAULT '0' COMMENT '需求状态，默认是正常使用，-1为失效',
--   PRIMARY KEY (`id`)
-- )
--   ENGINE = INNODB
--   DEFAULT CHARSET = utf8;


















