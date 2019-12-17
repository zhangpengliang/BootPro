package com.huayong.awa.apollo.recommend.platform.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huayong.awa.apollo.recommend.platform.dao.ICandidateCommunicationDao;
import com.huayong.awa.apollo.recommend.platform.entity.CandidateCommunicationEntity;
import com.huayong.awa.apollo.recommend.platform.service.ICandidateCommunicationService;
import com.huayong.awa.service.dao.IBaseMapper;
import com.huayong.awa.service.service.AbstractAwaEntityService;

@Service
public class CandidateCommunicationService extends AbstractAwaEntityService<CandidateCommunicationEntity>implements ICandidateCommunicationService {

	@Resource
	private ICandidateCommunicationDao candidateCommunicationDao;

	protected CandidateCommunicationService() {
		super(CandidateCommunicationEntity.class);
	}

	@Override
	protected IBaseMapper<CandidateCommunicationEntity> getMapper() {
		return candidateCommunicationDao;
	}
}
