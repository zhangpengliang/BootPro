package com.huayong.generator;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huayong.generator.CodeFactory.CodeType;
import com.huayong.generator.config.DataSourceConfig;
import com.huayong.generator.config.GlobalConfig;
import com.huayong.generator.po.TableField;
import com.huayong.generator.po.TableInfo;
import com.huayong.generator.utils.CommonUtils;

public class CodeGenerate implements ICallBack {

	private static Logger logger = LoggerFactory.getLogger(CodeGenerate.class);

	private List<TableInfo> tableInfoList;
	private TableInfo tableInfo;
	private GlobalConfig globalConfig;
	private DataSourceConfig dataSourceConfig;

	public CodeGenerate() {

	}

	public CodeGenerate(GlobalConfig globalConfig, DataSourceConfig dataSourceConfig) {
		this.globalConfig = globalConfig;
		this.dataSourceConfig = dataSourceConfig;
	}

	public Map<String, Object> execute(CodeType type) {
		Map<String, Object> data = new HashMap<>();
		data.put("entityPackage", globalConfig.getEntityPackage());// 实体的包名
		data.put("dtoPackage", globalConfig.getDtoPackage());
		data.put("servicePackage", globalConfig.getServicePackage());
		data.put("daoPackage", globalConfig.getDaoPackage());
		data.put("serviceImpPackage", globalConfig.getServiceImplPackage());
		data.put("facadePackage", globalConfig.getFacadePackage());
		data.put("facadeImplPackage", globalConfig.getFacadeImplPackage());
		// 移除表前缀，表名之间的下划线，得到实体类型
		String entity = CommonUtils.getNoUnderlineStr(
				CommonUtils.removePrefix(tableInfo.getName().toLowerCase(), globalConfig.getPrefix()));
		String className = StringUtils.capitalize(entity);
		String entityName = className;
		if (CodeType.Entity == type || CodeType.Dto == type) {
			className = className + type.name();
		} else if (CodeType.Service == type || CodeType.Dao == type || CodeType.Facade == type) {
			className = "I" + className + type.name();
			data.put("entityName", entityName + CodeType.Entity.name());
		} else if (CodeType.ServiceImpl == type) {
			className = className + "Service";
		} else if (CodeType.FacadeImpl == type) {
			className = className + "Facade";
		}
		data.put("className", className);// 实体名称
		data.put("author", globalConfig.getAuthor());// 创建作者
		data.put("date", CommonUtils.getFormatTime("yyyy-MM-dd", new Date()));// 创建时间
		data.put("table", tableInfo);// 表信息
		data.put("tableName", StringUtils.capitalize(entity));// 首字母大写的表名比如
																// mic_report-->MicReport
		boolean isKeyflag = false;
		for (TableField field : tableInfo.getFields()) {
			if (field.isKeyIdentityFlag()) {// 获取主键字段信息
				data.put("tbKey", field.getName());
				data.put("tbKeyType", field.getPropertyType());
				isKeyflag = true;
				break;
			}
		}
		if (!isKeyflag) {
			throw new RuntimeException(String.format("[%s]表缺少主键，不能没有主键", tableInfo.getName()));
		}
		return data;
	}

	/**
	 * 生成代码文件
	 * 
	 * @return
	 */
	public boolean generateToFile() throws Exception {
		initConfig();
		for (TableInfo tableInfo : tableInfoList) {
			this.tableInfo = tableInfo;// 当前需要生成的表
			logger.info("------Code----Generation----[单表模型:" + tableInfo.getName() + "]------- 生成中。。。");
			try {
				CodeFactory codeFactory = new CodeFactory();
				codeFactory.setCallBack(this);
				codeFactory.setGlobalConfig(globalConfig);
				if (!StringUtils.isBlank(globalConfig.getEntityPackage())) {
					codeFactory.invoke("huayong_entity.ftl", CodeType.Entity);
				}
				if (!StringUtils.isBlank(globalConfig.getDtoPackage())) {
					codeFactory.invoke("huayong_dto.ftl", CodeType.Dto);
				}
				if (!StringUtils.isBlank(globalConfig.getServicePackage())) {
					codeFactory.invoke("huayong_service.ftl", CodeType.Service);
				}
				if (!StringUtils.isBlank(globalConfig.getDaoPackage())) {
					codeFactory.invoke("huayong_dao.ftl", CodeType.Dao);
				}
				if (!StringUtils.isBlank(globalConfig.getServiceImplPackage())) {
					codeFactory.invoke("huayong_serviceImp.ftl", CodeType.ServiceImpl);
				}
				if (!StringUtils.isBlank(globalConfig.getFacadePackage())) {
					codeFactory.invoke("huayong_facade.ftl", CodeType.Facade);
				}
				if (!StringUtils.isBlank(globalConfig.getFacadeImplPackage())) {
					codeFactory.invoke("huayong_facade_Impl.ftl", CodeType.FacadeImpl);
				}

				logger.info("-------Code----Generation-----[单表模型：" + tableInfo.getName() + "]------ 生成完成。。。");
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("-------Code----Generation-----[单表模型：" + tableInfo.getName() + "]------ 生成失败。。。");
				return false;
			}
		}

		return true;
	}

	private void initConfig() {
		if (dataSourceConfig == null) {
			throw new RuntimeException("dataSourceConfig is null");
		}
		if (globalConfig == null) {
			throw new RuntimeException("globalConfig is null");
		}
		tableInfoList = dataSourceConfig.getTablesInfo(globalConfig.getTableNames());
	}
}
