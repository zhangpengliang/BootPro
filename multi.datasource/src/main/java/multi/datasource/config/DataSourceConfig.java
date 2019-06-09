package multi.datasource.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

import multi.datasource.dataenum.DataSourceEnum;
import multi.datasource.dataswitch.DataSourceRouting;

@Configuration
public class DataSourceConfig {

	@Bean(name = "mysqlDataSource", destroyMethod = "close", initMethod = "init")
	@ConfigurationProperties(prefix = "spring.datasource.mysql") // application.properteis中对应属性的前缀
	public DataSource dataSourceMysql() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "dataSourceOrcal", destroyMethod = "close", initMethod = "init")
	@ConfigurationProperties(prefix = "spring.datasource.orcal") // application.properteis中对应属性的前缀
	public DataSource dataSourceOrcal() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "dataSource")
	@Primary
	public DataSource dataSource() {
		DataSourceRouting dataSourceRouting = new DataSourceRouting();
		DataSource dataSourceMysql = dataSourceMysql();
		// 设置默认数据源
		dataSourceRouting.setDefaultTargetDataSource(dataSourceMysql);
		// 配置多数据源
		Map<Object, Object> dataSources = new ConcurrentHashMap<Object, Object>();

		dataSources.put(DataSourceEnum.MYSQL.getValue(), dataSourceMysql);
		//设置oracle数据源
		dataSources.put(DataSourceEnum.ORACLE.getValue(), dataSourceOrcal());
		dataSourceRouting.setTargetDataSources(dataSources);
		return dataSourceRouting;
	}
}
