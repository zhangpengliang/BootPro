package com.huayong.awa.apollo.recommend.platform.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huayong.awa.apollo.recommend.platform.dao.IMicResReportDao;
import com.huayong.awa.apollo.recommend.platform.entity.MicResReportEntity;
import com.huayong.awa.apollo.recommend.platform.service.IMicResReportService;
import com.huayong.awa.service.dao.IBaseMapper;
import com.huayong.awa.service.service.AbstractAwaEntityService;

@Service
public class MicResReportService extends AbstractAwaEntityService<MicResReportEntity>implements IMicResReportService {

	@Resource
	private IMicResReportDao micResReportDao;

	protected MicResReportService() {
		super(MicResReportEntity.class);
	}

	@Override
	protected IBaseMapper<MicResReportEntity> getMapper() {
		return micResReportDao;
	}
}
