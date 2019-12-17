package ${serviceImpPackage};

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ${daoPackage}.I${tableName}Dao;
import com.huayong.awa.apollo.recommend.platform.entity.${tableName}Entity;
import com.huayong.awa.apollo.recommend.platform.service.I${tableName}Service;
import com.huayong.awa.service.dao.IBaseMapper;
import com.huayong.awa.service.service.AbstractAwaEntityService;

@Service
public class ${className} extends AbstractAwaEntityService<${tableName}Entity>implements I${tableName}Service {
<#assign name=tableName>

	@Resource
	private I${tableName}Dao ${name?uncap_first}Dao;

	protected ${tableName}Service() {
		super(${tableName}Entity.class);
	}

	@Override
	protected IBaseMapper<${tableName}Entity> getMapper() {
		return ${name?uncap_first}Dao;
	}
}
