package org.tm.pro.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.tm.pro.entity.RawData;
import org.tm.pro.entity.RawDataExample;

public interface RawDataMapper {
    long countByExample(RawDataExample example);

    int deleteByExample(RawDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RawData record);

    int insertSelective(RawData record);

    List<RawData> selectByExampleWithBLOBs(RawDataExample example);

    List<RawData> selectByExample(RawDataExample example);

    RawData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RawData record, @Param("example") RawDataExample example);

    int updateByExampleWithBLOBs(@Param("record") RawData record, @Param("example") RawDataExample example);

    int updateByExample(@Param("record") RawData record, @Param("example") RawDataExample example);

    int updateByPrimaryKeySelective(RawData record);

    int updateByPrimaryKeyWithBLOBs(RawData record);

    int updateByPrimaryKey(RawData record);
}