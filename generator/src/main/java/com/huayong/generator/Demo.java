package com.huayong.generator;

import java.util.Arrays;

import com.huayong.generator.config.DataSourceConfig;
import com.huayong.generator.config.GlobalConfig;
import com.huayong.generator.facade.AutoGeneratorCodeUtil;
import com.huayong.generator.facade.Bean;

public class Demo {
	public static void main11(String[] args) throws Exception {
		GlobalConfig globalConfig = new GlobalConfig();// 全局配置
		// globalConfig.setTemplatepath("/template/style1");//自定义模板路径
		globalConfig.setAuthor("zpl");
		globalConfig.setEntityPackage("com.huayong.awa.apollo.recommend.platform.entity");// 实体包名
		globalConfig.setDtoPackage("com.huayong.awa.apollo.recommend.dto");// dto包名
		globalConfig.setServicePackage("com.huayong.awa.apollo.recommend.platform.service");// service包名
		globalConfig.setDaoPackage("com.huayong.awa.apollo.recommend.platform.dao");// dao包
		globalConfig.setServiceImplPackage("com.huayong.awa.apollo.recommend.platform.service.impl");// 实现包
		globalConfig.setFacadePackage("com.huayong.awa.apollo.recommend.facade");// facade包
		globalConfig.setFacadeImplPackage("com.huayong.awa.apollo.recommend.platform.facade.impl");// facade实现包

		globalConfig.setTableNames(Arrays.asList("mic_res_report", "candidate_communication"));// 配置表名
		// globalConfig.setPrefix(new String[] { "pre_" });// 生成的实体需要移除的前缀
		// globalConfig.setOutputDir("D://code/");//文件输出路径，不配置的话默认输出当前项目的resources/code目录下
		DataSourceConfig dsc = new DataSourceConfig();// 数据库配置
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUrl("jdbc:mysql://awa-mysql.bjidc.com:3306/awa_recommend?characterEncoding=utf-8&useSSL=false");
		dsc.setUsername("awa");// 填写自己的数据库账号
		dsc.setPassword("awa#dev");// 填写自己的数据库密码
		CodeGenerate codeGenerate = new CodeGenerate(globalConfig, dsc);
		// 生成代码
		codeGenerate.generateToFile();
	}

	public static void main2(String[] args) throws Exception {
		Bean bean = new Bean();
		bean.setAccount("awa");
		bean.setPassword("awa#dev");
		bean.setAuthor("ljx");
		bean.setDbUrl("jdbc:mysql://awa-mysql.bjidc.com:3306/awa_customer?characterEncoding=utf-8&useSSL=false");
		bean.setModule("h.customer");
		bean.setTableNames(Arrays.asList("customer_compact_files", "customer_compact", "customer_compact_company_info",
				"customer_compact_invoice_info", "customer_compact_year_salary", "customer_compact_taxes_clause",
				"customer_compact_hunt_ban_clause", "customer_compact_service_charge_clause",
				"customer_compact_payment_clause", "customer_delay_record"));
		bean.setPath("C:\\Users\\Administrator\\Desktop\\abc");
		AutoGeneratorCodeUtil.autoGenerate(bean);

	}
}
