package org.tm.pro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tm.pro.entity.AnalysisData;
import org.tm.pro.entity.AnalysisDataExample;

public interface AnalysisDataMapper {
    long countByExample(AnalysisDataExample example);

    int deleteByExample(AnalysisDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnalysisData record);

    int insertSelective(AnalysisData record);

    List<AnalysisData> selectByExample(AnalysisDataExample example);

    AnalysisData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnalysisData record, @Param("example") AnalysisDataExample example);

    int updateByExample(@Param("record") AnalysisData record, @Param("example") AnalysisDataExample example);

    int updateByPrimaryKeySelective(AnalysisData record);

    int updateByPrimaryKey(AnalysisData record);
}