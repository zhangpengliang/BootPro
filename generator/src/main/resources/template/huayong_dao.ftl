package ${daoPackage};

import org.apache.ibatis.annotations.Mapper;

import ${entityPackage}.${tableName}Entity;
import com.huayong.awa.service.dao.IBaseMapper;
/**
  * 
 * 
 * @author ${author}
 * @date ${date}
 *
 */
@Mapper
public interface ${className} extends IBaseMapper<${tableName}Entity>{

}
