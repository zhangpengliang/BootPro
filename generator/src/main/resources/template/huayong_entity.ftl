package ${entityPackage};

import javax.persistence.Table;

import com.huayong.awa.service.entity.AbstractAwaEntity;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * 功能: ${table.comment}
 * 
 * @author ${author}
 *
 * @date ${date}
 */
@Setter
@Getter
@Table(name = "${table.name}")
public class ${className} extends AbstractAwaEntity {

	private static final long serialVersionUID = 1L;
	
	<#-- 循环属性名称 -->
<#list table.fields as field>
	<#if field.propertyName=="id"||field.propertyName=="delFlag"||field.propertyName=="creatorId"||field.propertyName=="creatorTeam"||field.propertyName=="creatorBranch"||field.propertyName=="creatorRegion"||field.propertyName=="creatorCompany"||field.propertyName=="orgId"||field.propertyName=="brand"||field.propertyName=="createTime"||field.propertyName=="modifyTime">
	<#else>
	<#if field.comment??>
   	/**${field.comment}*/
	</#if>
   	private ${field.propertyType} ${field.propertyName};
	</#if>
</#list>

}
