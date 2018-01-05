package org.tm.pro.service;

import java.util.List;

import org.tm.pro.entity.AnalysisData;

public interface AnalysisDataService {
	int save(AnalysisData analysisData);

	List<AnalysisData> getAnalysisDatas(String smac, String dmac, long startTime, long endTime);
}
