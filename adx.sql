/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : adx

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 19/03/2019 18:11:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for adv_cust
-- ----------------------------
DROP TABLE IF EXISTS `adv_cust`;
CREATE TABLE `adv_cust`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cus_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '广告主名称',
  `cus_property` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '广告主属性',
  `linkman` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系人',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `bank` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开户行',
  `account_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开户名',
  `bank_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '银行账号',
  `bus_license` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '营业执照号',
  `bus_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '营业执照图片',
  `open_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否开启后台',
  `salesman` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '销售负责人',
  `create_date` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of adv_cust
-- ----------------------------
INSERT INTO `adv_cust` VALUES (1, '二狗子', 'personal', '狗哥', '4@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '张三', '2019-03-06 16:24:14');
INSERT INTO `adv_cust` VALUES (2, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (3, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (4, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (5, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (6, '二狗子', 'personal', '狗哥', '4@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '张三', '2019-03-06 16:24:14');
INSERT INTO `adv_cust` VALUES (7, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (8, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (9, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (10, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (11, '二狗子', 'personal', '狗哥', '4@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '张三', '2019-03-06 16:24:14');
INSERT INTO `adv_cust` VALUES (12, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (13, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (14, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (15, '三狗子', 'company', '猫哥', '5@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '李四', '2019-03-14 16:24:14');
INSERT INTO `adv_cust` VALUES (16, '二狗子', 'personal', '狗哥', '4@qq.com', '13888888888', '中国银行', '中国银行河北支行', '16156165156155', '1215dfgfd1565f4', 'sdgdsgsdgdsfg', '未开通', '张三', '2019-03-06 16:24:14');
INSERT INTO `adv_cust` VALUES (17, '测试', NULL, '阿三', '1234@qq.com', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `adv_cust` VALUES (18, '1', '个人', '1', '1', '1', '1', '1', '1', '1', NULL, '否', '', NULL);
INSERT INTO `adv_cust` VALUES (19, '1', '个人', '1', '1', '1', '1', '1', '1', '1', NULL, '否', '', NULL);

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '文章内容',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `delete_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否有效  1.有效  2无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '发布号作者表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (5, '莎士比亚', '2017-10-25 09:08:45', '2017-10-30 17:59:41', '1');
INSERT INTO `article` VALUES (6, '亚里士多德', '2017-10-26 10:49:28', '2017-11-18 09:54:15', '1');
INSERT INTO `article` VALUES (10, '亚历山大', '2017-10-26 14:57:45', '2017-11-08 13:28:52', '1');
INSERT INTO `article` VALUES (11, '李白', '2017-10-26 15:23:42', '2017-10-26 15:23:42', '1');
INSERT INTO `article` VALUES (19, '文章test2', '2017-11-18 13:37:07', '2017-11-18 13:37:11', '1');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `id` int(11) NOT NULL DEFAULT 0 COMMENT '自定id,主要供前端展示权限列表分类排序使用.',
  `menu_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '归属菜单,前端判断并展示菜单使用,',
  `menu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '菜单的中文释义',
  `permission_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '权限的代码/通配符,对应代码中@RequiresPermissions 的value',
  `permission_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '本权限的中文释义',
  `required_permission` tinyint(1) NULL DEFAULT 2 COMMENT '是否本菜单必选权限, 1.必选 2非必选 通常是\"列表\"权限是必选',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台权限表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES (101, 'article', '文章管理', 'article:list', '列表', 1);
INSERT INTO `sys_permission` VALUES (102, 'article', '文章管理', 'article:add', '新增', 2);
INSERT INTO `sys_permission` VALUES (103, 'article', '文章管理', 'article:update', '修改', 2);
INSERT INTO `sys_permission` VALUES (601, 'user', '用户', 'user:list', '列表', 1);
INSERT INTO `sys_permission` VALUES (602, 'user', '用户', 'user:add', '新增', 2);
INSERT INTO `sys_permission` VALUES (603, 'user', '用户', 'user:update', '修改', 2);
INSERT INTO `sys_permission` VALUES (701, 'role', '角色权限', 'role:list', '列表', 1);
INSERT INTO `sys_permission` VALUES (702, 'role', '角色权限', 'role:add', '新增', 2);
INSERT INTO `sys_permission` VALUES (703, 'role', '角色权限', 'role:update', '修改', 2);
INSERT INTO `sys_permission` VALUES (704, 'role', '角色权限', 'role:delete', '删除', 2);
INSERT INTO `sys_permission` VALUES (705, 'adv', '广告管理', 'adv:list', '列表', 1);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `delete_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否有效  1有效  2无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '后台角色表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, '管理员', '2017-11-22 16:24:34', '2017-11-22 16:24:52', '1');
INSERT INTO `sys_role` VALUES (2, '作家', '2017-11-22 16:24:34', '2017-11-22 16:24:52', '1');
INSERT INTO `sys_role` VALUES (3, '程序员', '2017-11-22 16:28:47', '2017-11-22 16:28:47', '1');
INSERT INTO `sys_role` VALUES (4, '只有文章的', '2019-02-27 14:44:11', '2019-02-27 14:44:11', '1');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色id',
  `permission_id` int(11) NULL DEFAULT NULL COMMENT '权限id',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  `delete_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否有效 1有效     2无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色-权限关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES (1, 2, 101, '2017-11-22 16:26:21', '2017-11-22 16:26:32', '1');
INSERT INTO `sys_role_permission` VALUES (2, 2, 102, '2017-11-22 16:26:21', '2017-11-22 16:26:32', '1');
INSERT INTO `sys_role_permission` VALUES (5, 2, 602, '2017-11-22 16:28:28', '2017-11-22 16:28:28', '1');
INSERT INTO `sys_role_permission` VALUES (6, 2, 601, '2017-11-22 16:28:28', '2017-11-22 16:28:28', '1');
INSERT INTO `sys_role_permission` VALUES (7, 2, 603, '2017-11-22 16:28:28', '2017-11-22 16:28:28', '1');
INSERT INTO `sys_role_permission` VALUES (8, 2, 703, '2017-11-22 16:28:28', '2017-11-22 16:28:28', '1');
INSERT INTO `sys_role_permission` VALUES (9, 2, 701, '2017-11-22 16:28:28', '2017-11-22 16:28:28', '1');
INSERT INTO `sys_role_permission` VALUES (10, 2, 702, '2017-11-22 16:28:28', '2017-11-22 16:28:28', '1');
INSERT INTO `sys_role_permission` VALUES (11, 2, 704, '2017-11-22 16:28:31', '2017-11-22 16:28:31', '1');
INSERT INTO `sys_role_permission` VALUES (12, 2, 103, '2017-11-22 16:28:31', '2017-11-22 16:28:31', '1');
INSERT INTO `sys_role_permission` VALUES (13, 3, 601, '2017-11-22 16:28:47', '2017-11-22 16:28:47', '1');
INSERT INTO `sys_role_permission` VALUES (14, 3, 701, '2017-11-22 16:28:47', '2017-11-22 16:28:47', '1');
INSERT INTO `sys_role_permission` VALUES (15, 3, 702, '2017-11-22 16:35:01', '2017-11-22 16:35:01', '1');
INSERT INTO `sys_role_permission` VALUES (16, 3, 704, '2017-11-22 16:35:01', '2017-11-22 16:35:01', '1');
INSERT INTO `sys_role_permission` VALUES (17, 3, 102, '2017-11-22 16:35:01', '2017-11-22 16:35:01', '1');
INSERT INTO `sys_role_permission` VALUES (18, 3, 101, '2017-11-22 16:35:01', '2017-11-22 16:35:01', '1');
INSERT INTO `sys_role_permission` VALUES (19, 3, 603, '2017-11-22 16:35:01', '2017-11-22 16:35:01', '1');
INSERT INTO `sys_role_permission` VALUES (20, 4, 101, '2019-02-27 14:44:11', '2019-02-27 14:44:11', '1');
INSERT INTO `sys_role_permission` VALUES (21, 4, 102, '2019-02-27 14:44:11', '2019-02-27 14:44:11', '1');
INSERT INTO `sys_role_permission` VALUES (22, 4, 103, '2019-02-27 14:44:11', '2019-02-27 14:44:11', '1');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `role_id` int(11) NULL DEFAULT 0 COMMENT '角色ID',
  `create_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `delete_status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否有效  1有效  2无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10009 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '运营后台用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (10003, 'admin', '123456', '超级用户23', 1, '2017-10-30 11:52:38', '2017-11-17 23:51:40', '1');
INSERT INTO `sys_user` VALUES (10004, 'user', '123456', '莎士比亚', 2, '2017-10-30 16:13:02', '2017-11-18 02:48:24', '1');
INSERT INTO `sys_user` VALUES (10005, 'aaa', '123456', 'abba', 1, '2017-11-15 14:02:56', '2017-11-17 23:51:42', '1');
INSERT INTO `sys_user` VALUES (10007, 'test', '123456', '就看看列表', 3, '2017-11-22 16:29:41', '2017-11-22 16:29:41', '1');
INSERT INTO `sys_user` VALUES (10008, 'zuojia', '111', '专业写手', 4, '2019-02-27 14:44:57', '2019-02-27 14:44:57', '1');

SET FOREIGN_KEY_CHECKS = 1;
