package multi.datasource.service;

import org.springframework.stereotype.Service;

import multi.datasource.dataenum.DataSourceEnum;
import multi.datasource.dataswitch.DataSourceSwitch;

@Service
public class DataSourceService {

	public void userMultiDataSource() {
		// 切换成orcal
		DataSourceSwitch.setDataSource(DataSourceEnum.ORACLE.getValue());

		// 执行查询
	}
}
