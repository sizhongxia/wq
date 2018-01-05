package org.tm.pro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tm.pro.entity.RawData;
import org.tm.pro.entity.RawDataExample;
import org.tm.pro.mapper.RawDataMapper;
import org.tm.pro.service.RawDataService;

@Service
public class RawDataServiceImpl implements RawDataService {

	@Autowired
	RawDataMapper rawDataMapper;

	@Override
	public int save(RawData rawData) {
		return rawDataMapper.insert(rawData);
	}

	@Override
	public int update(RawData rawData) {
		return rawDataMapper.updateByPrimaryKeySelective(rawData);
	}

	@Override
	public RawData getById(Integer id) {
		return rawDataMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<RawData> getNoAnalysisDatas() {
		RawDataExample example = new RawDataExample();
		example.createCriteria().andStatusEqualTo("N");
		return rawDataMapper.selectByExample(example);
	}

}
