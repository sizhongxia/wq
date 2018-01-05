package org.tm.pro.web.quartz.job.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tm.pro.service.AnalysisDataService;
import org.tm.pro.service.RawDataService;
import org.tm.pro.web.quartz.job.RunJob;

@Component
public class BaseJob implements RunJob {

	@Autowired
	RawDataService rawDataService;
	@Autowired
	AnalysisDataService analysisDataService;

	@Override
	public void run() {
	}

}
