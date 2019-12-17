package ${facadeImplPackage};


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ${facadePackage}.I${tableName}Facade;
import ${facadePackage}.I${tableName}Service;

@Component
public class ${className} implements I${tableName}Facade {

	private static final Logger LOGGER = LoggerFactory.getLogger(${tableName}Facade.class);
	<#assign name=tableName>
	@Autowired
	private I${tableName}Service ${name?uncap_first}Service;


}
