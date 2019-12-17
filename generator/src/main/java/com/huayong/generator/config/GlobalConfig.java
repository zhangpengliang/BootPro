package com.huayong.generator.config;

import java.util.List;

public class GlobalConfig {
	private String system_encoding = "utf-8";// 文件编码
	private String templatepath = "/template";// 模板
	private String outputDir;// 文件输出路径，不配置的话默认输出当前项目的resources/code目录下
	private String entityPackage = "entity";// 实体包
	private String daoPackage = "dao";// dao层包名
	private String serviceImplPackage = "service.Impl";// serviceImpl层包名
	private String servicePackage = "service";// service层包名
	private String facadePackage = "facade";
	private String facadeImplPackage = "facade.Impl";
	private String controllerPackage = "controller";// 控制层包名
	private String dtoPackage = "dto";
	private List<String> tableNames;// 表名
	private String[] prefix;// 表前缀
	private String author = "";// 作者
	private String templateName;// 模板名

	public String getSystem_encoding() {
		return system_encoding;
	}

	public void setSystem_encoding(String system_encoding) {
		this.system_encoding = system_encoding;
	}

	public String getTemplatepath() {
		return templatepath;
	}

	public void setTemplatepath(String templatepath) {
		this.templatepath = templatepath;
	}

	public String getOutputDir() {
		return outputDir;
	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}

	public String getEntityPackage() {
		return entityPackage;
	}

	public void setEntityPackage(String entityPackage) {
		this.entityPackage = entityPackage;
	}

	public List<String> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String[] getPrefix() {
		return prefix;
	}

	public void setPrefix(String[] prefix) {
		this.prefix = prefix;
	}

	public String getDaoPackage() {
		return daoPackage;
	}

	public void setDaoPackage(String daoPackage) {
		this.daoPackage = daoPackage;
	}

	public String getServiceImplPackage() {
		return serviceImplPackage;
	}

	public void setServiceImplPackage(String serviceImplPackage) {
		this.serviceImplPackage = serviceImplPackage;
	}

	public String getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(String servicePackage) {
		this.servicePackage = servicePackage;
	}

	public String getControllerPackage() {
		return controllerPackage;
	}

	public void setControllerPackage(String controllerPackage) {
		this.controllerPackage = controllerPackage;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getDtoPackage() {
		return dtoPackage;
	}

	public void setDtoPackage(String dtoPackage) {
		this.dtoPackage = dtoPackage;
	}

	public String getFacadePackage() {
		return facadePackage;
	}

	public void setFacadePackage(String facadePackage) {
		this.facadePackage = facadePackage;
	}

	public String getFacadeImplPackage() {
		return facadeImplPackage;
	}

	public void setFacadeImplPackage(String facadeImplPackage) {
		this.facadeImplPackage = facadeImplPackage;
	}

}
