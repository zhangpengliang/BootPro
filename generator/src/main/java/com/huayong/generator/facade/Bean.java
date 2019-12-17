package com.huayong.generator.facade;

import java.util.List;

/**
 * 参数实体<br/>
 * 
 * module 参数如果传了,就不需要传各个包路径了,
 * 内部会自动使用com.huayong.awa.apollo.{module}.platform.entity生成<br/>
 * 如果不传就需要传各个模块的包路径<br/>
 * module 入参说明：比如awa-base项目 ： 传base awa-recommend 传recommend
 * 
 * @author zpl
 * @date 2019年9月6日下午6:17:52
 */
public class Bean {

	/** 作者 */
	private String author = "admin";
	/** entity路径 比如：com.huayong.awa.apollo.recommend.platform.entity */
	private String entityPackage;
	/** dto包路径 com.huayong.awa.apollo.recommend.dto */
	private String dtoPackage;
	/** service包路径 */
	private String servicePackage;
	/** dao包路径 */
	private String daoPackage;
	/** serviceImp 包路径 */
	private String serviceImplPackage;
	/** facade 包路径 */
	private String facadPackage;
	/** facade 实现类包路径 */
	private String facadImplPackage;
	/** 数据库表名 必填 */
	private List<String> tableNames;
	/** db的url 必填 */
	private String dbUrl;
	/** 账号 必填 */
	private String account;
	/** 密码 必填 */
	private String password;
	/** 选填 模块：比如awa-base项目 ： 传base awa-recommend 传recommend */
	private String module;// 模块
	/** 代码生成后的路径 */
	private String path;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEntityPackage() {
		return entityPackage;
	}

	public void setEntityPackage(String entityPackage) {
		this.entityPackage = entityPackage;
	}

	public String getDtoPackage() {
		return dtoPackage;
	}

	public void setDtoPackage(String dtoPackage) {
		this.dtoPackage = dtoPackage;
	}

	public String getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(String servicePackage) {
		this.servicePackage = servicePackage;
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

	public String getFacadPackage() {
		return facadPackage;
	}

	public void setFacadPackage(String facadPackage) {
		this.facadPackage = facadPackage;
	}

	public String getFacadImplPackage() {
		return facadImplPackage;
	}

	public void setFacadImplPackage(String facadImplPackage) {
		this.facadImplPackage = facadImplPackage;
	}

	public List<String> getTableNames() {
		return tableNames;
	}

	public void setTableNames(List<String> tableNames) {
		this.tableNames = tableNames;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
