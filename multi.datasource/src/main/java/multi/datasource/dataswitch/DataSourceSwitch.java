package multi.datasource.dataswitch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据源	切换
 * @author zpl
 *
 */
public class DataSourceSwitch {

	private static final ThreadLocal<String> localContext = new ThreadLocal<String>();

	private static final Logger LOGGER = LoggerFactory.getLogger(DataSourceSwitch.class);

	public static String getDateSource() {
		if (null == localContext.get()) {
			return null;
		}
		LOGGER.info("数据源为：" + localContext.get());
		return localContext.get();
	}

	public static void setDataSource(String dataSourceName) {
		localContext.set(dataSourceName);
	}

	public static void clearDataSource() {
		localContext.remove();
	}
}
