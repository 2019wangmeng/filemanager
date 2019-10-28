SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `file_info`;
CREATE TABLE `file_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `file_name` varchar(255) DEFAULT NULL COMMENT '文件名称',
  `file_ext` varchar(255) DEFAULT NULL COMMENT '文件拓展名',
  `file_size` int(11) DEFAULT NULL COMMENT '文件大小',
  `file_create_time` datetime DEFAULT NULL COMMENT '文件创建时间',
  `file_address` varchar(255) DEFAULT NULL COMMENT '文件路径地址',
  `content_type` varchar(255) DEFAULT NULL COMMENT '文件类型',
  `delete_flag` tinyint(4) DEFAULT NULL COMMENT '删除状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=190 DEFAULT CHARSET=utf8;