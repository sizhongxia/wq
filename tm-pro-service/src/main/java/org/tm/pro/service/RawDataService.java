package org.tm.pro.service;

import java.util.List;

import org.tm.pro.entity.RawData;

public interface RawDataService {

	int save(RawData rawData);

	int update(RawData rawData);

	RawData getById(Integer id);

	List<RawData> getNoAnalysisDatas();
}
