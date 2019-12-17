package com.huayong.awa.apollo.recommend.platform.facade.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huayong.awa.apollo.recommend.facade.ICandidateCommunicationFacade;
import com.huayong.awa.apollo.recommend.facade.ICandidateCommunicationService;

@Component
public class CandidateCommunicationFacade implements ICandidateCommunicationFacade {

	private static final Logger LOGGER = LoggerFactory.getLogger(CandidateCommunicationFacade.class);
	@Autowired
	private ICandidateCommunicationService candidateCommunicationService;


}
