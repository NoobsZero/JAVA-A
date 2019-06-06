/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.26 : Database - weiyidata
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`weiyidata` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `weiyidata`;

/*Table structure for table `admi` */

DROP TABLE IF EXISTS `admi`;

CREATE TABLE `admi` (
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `admi` */

insert  into `admi`(`username`,`password`,`id`) values 
('Admi','admi',1),
('name','123456',2);

/*Table structure for table `site` */

DROP TABLE IF EXISTS `site`;

CREATE TABLE `site` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '和sub表的remark对应',
  `sites` varchar(10) NOT NULL COMMENT '位置',
  `remarks` varchar(200) NOT NULL COMMENT '位置介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `site` */

insert  into `site`(`id`,`sites`,`remarks`) values 
(1,'上单','上单（TOP）：以上路兵线为经验和经济获取的主要方式，采用补刀和击杀敌方英雄、线上gank和反gank、参与团'),
(2,'打野','打野（Jungle）：以野区资源为经验和经济获取的主要方式，采用刷野和反野、线上gank和反gank、参与团战等方式'),
(3,'中单','中单（APC）：是指目前一些竞技类网游地图中路单线发育的位置，有更好的发育空间，同时又具有游走支援的能力。普遍'),
(4,'射手','射手（ADC）：在后期的团战中主要担任持续伤害的输出，所以ADC一般需要一定的farm能力。ADC类英雄'),
(5,'辅助','辅助（Support）：多为远程，防御能力弱于T但高于ADC，往往拥有多于一招的控制技能，以及可作用于友军的增益技能。');

/*Table structure for table `sub` */

DROP TABLE IF EXISTS `sub`;

CREATE TABLE `sub` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `param_name` varchar(50) NOT NULL COMMENT '参数名',
  `param_value` varchar(50) NOT NULL COMMENT '参数值',
  `remark` int(10) NOT NULL COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `remark` (`remark`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

/*Data for the table `sub` */

insert  into `sub`(`id`,`param_name`,`param_value`,`remark`) values 
(3,'钟无艳','21',1),
(19,'上官婉儿','26',3),
(20,'李白','24',2),
(22,'项羽','23',1),
(23,'张飞','20',5),
(32,'虞姬','18',4),
(36,'亚瑟','30',1),
(38,'诸葛亮','21',3),
(39,'甄姬','19',3),
(43,'刘婵','15',5),
(45,'源歌','25',3),
(46,'王昭君','18',3),
(47,'吕布','24',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
