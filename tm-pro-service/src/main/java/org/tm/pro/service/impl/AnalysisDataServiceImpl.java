package org.tm.pro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tm.pro.entity.AnalysisData;
import org.tm.pro.entity.AnalysisDataExample;
import org.tm.pro.entity.AnalysisDataExample.Criteria;
import org.tm.pro.mapper.AnalysisDataMapper;
import org.tm.pro.service.AnalysisDataService;
import org.tm.pro.utils.TmStringUtil;

@Service
public class AnalysisDataServiceImpl implements AnalysisDataService {

	@Autowired
	AnalysisDataMapper analysisDataMapper;

	@Override
	public int save(AnalysisData analysisData) {
		return analysisDataMapper.insert(analysisData);
	}

	@Override
	public List<AnalysisData> getAnalysisDatas(String smac, String dmac, long startTime, long endTime) {
		AnalysisDataExample example = new AnalysisDataExample();

		Criteria criteria = example.createCriteria();
		if (TmStringUtil.isNotBlank(dmac)) {
			criteria.andDmacEqualTo(dmac);
		}
		if (TmStringUtil.isNotBlank(smac)) {
			criteria.andSmacEqualTo(smac);
		}
		if (startTime > 0) {
			criteria.andTsGreaterThan(startTime);
		}
		if (endTime > 0) {
			criteria.andTsLessThan(endTime);
		}
		example.setOrderByClause("ts desc");
		return analysisDataMapper.selectByExample(example);
	}

}
