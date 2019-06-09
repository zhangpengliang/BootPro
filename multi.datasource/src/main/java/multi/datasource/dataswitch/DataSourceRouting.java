package multi.datasource.dataswitch;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 数据源路由
 * 
 * @author zpl
 *
 * @date 
 *
 */
public class DataSourceRouting extends AbstractRoutingDataSource {

	public static final String DATA_SOURCE_DEFAULT = "mysql";

	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceSwitch.getDateSource();
	}
}
