package multi.datasource.dataenum;

/**
 * 数据源枚举
 * 
 * @author zpl
 *
 */
public enum DataSourceEnum {
	MYSQL("mysql", "mysql数据源"), ORACLE("oracle", "oracle数据源");
	private String value;
	private String desc;

	private DataSourceEnum(String value, String description) {
		this.value = value;
		this.desc = description;
	}

	public String getValue() {
		return value;
	}

	public String getDesc() {
		return desc;
	}
}
