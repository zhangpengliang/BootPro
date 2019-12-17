package com.huayong.generator.facade;

import java.text.MessageFormat;

import org.apache.commons.lang3.StringUtils;

import com.huayong.generator.CodeGenerate;
import com.huayong.generator.config.DataSourceConfig;
import com.huayong.generator.config.GlobalConfig;

/**
 * awa自动生成代码工具
 * 
 * @author zpl
 * @date 2019年9月6日下午6:17:25
 */
public class AutoGeneratorCodeUtil {

	private static final String enityPackage = "com.huayong.awa.apollo.{0}.platform.entity";

	private static final String dtoPackage = "com.huayong.awa.apollo.{0}.dto";

	private static final String servicePackage = "com.huayong.awa.apollo.{0}.platform.service";

	private static final String daoPackage = "com.huayong.awa.apollo.{0}.platform.dao";

	private static final String serviceImplPackage = "com.huayong.awa.apollo.{0}.platform.service.impl";

	private static final String facadePackage = "com.huayong.awa.apollo.{0}.facade";

	private static final String facadeImplPackage = "com.huayong.awa.apollo.{0}.platform.facade.impl";

	/**
	 * 自动生成代码
	 * 
	 * @param bean
	 */
	public static void autoGenerate(Bean bean) throws Exception {
		if (bean == null || StringUtils.isBlank(bean.getAccount()) || StringUtils.isBlank(bean.getPassword())
				|| StringUtils.isBlank(bean.getDbUrl()) || bean.getTableNames() == null
				|| bean.getTableNames().isEmpty()) {
			return;
		}
		GlobalConfig globalConfig = new GlobalConfig();// 全局配置
		// globalConfig.setTemplatepath("/template/style1");//自定义模板路径
		globalConfig.setAuthor(bean.getAuthor());
		globalConfig.setEntityPackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(enityPackage, bean.getModule()) : bean.getEntityPackage());// 实体包名
		globalConfig.setDtoPackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(dtoPackage, bean.getModule()) : bean.getDtoPackage());// dto包名
		globalConfig.setServicePackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(servicePackage, bean.getModule()) : bean.getServicePackage());// service包名
		globalConfig.setDaoPackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(daoPackage, bean.getModule()) : bean.getDaoPackage());// dao包
		globalConfig.setServiceImplPackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(serviceImplPackage, bean.getModule()) : bean.getServiceImplPackage());// 实现包
		globalConfig.setFacadePackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(facadePackage, bean.getModule()) : bean.getFacadPackage());// facade包
		globalConfig.setFacadeImplPackage(!StringUtils.isBlank(bean.getModule())
				? MessageFormat.format(facadeImplPackage, bean.getModule()) : bean.getFacadImplPackage());// facade实现包
		globalConfig.setTableNames(bean.getTableNames());// 配置表名
		// globalConfig.setPrefix(new String[] { "pre_" });// 生成的实体需要移除的前缀
		if (!StringUtils.isBlank(bean.getPath())) {
			globalConfig.setOutputDir(bean.getPath());// 文件输出路径，不配置的话默认输出当前项目的resources/code目录下
		}
		DataSourceConfig dsc = new DataSourceConfig();// 数据库配置
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUrl(bean.getDbUrl());
		dsc.setUsername(bean.getAccount());// 填写自己的数据库账号
		dsc.setPassword(bean.getPassword());// 填写自己的数据库密码
		CodeGenerate codeGenerate = new CodeGenerate(globalConfig, dsc);
		// 生成代码
		codeGenerate.generateToFile();
	}

}
