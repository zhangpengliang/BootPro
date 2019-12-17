package ${dtoPackage};

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

/**
 * 功能: ${table.comment} 对应的DTO
 * 
 * @author ${author}
 *
 * @date ${date}
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ${className} implements Serializable {

	private static final long serialVersionUID = 1L;
	
	<#-- 循环属性名称 -->
<#list table.fields as field>
	<#if field.comment??>
   	/**${field.comment}*/
	</#if>
   	private ${field.propertyType} ${field.propertyName};
</#list>
}
