package com.huayong.awa.apollo.recommend.platform.facade.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huayong.awa.apollo.recommend.facade.IMicResReportFacade;
import com.huayong.awa.apollo.recommend.facade.IMicResReportService;

@Component
public class MicResReportFacade implements IMicResReportFacade {

	private static final Logger LOGGER = LoggerFactory.getLogger(MicResReportFacade.class);
	@Autowired
	private IMicResReportService micResReportService;


}
