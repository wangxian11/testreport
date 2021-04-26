package com.testreport.dao;

import com.testreport.bean.loadErrorRecord;
import com.testreport.bean.loadErrorRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface loadErrorRecordMapper {
    long countByExample(loadErrorRecordExample example);

    int deleteByExample(loadErrorRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(loadErrorRecord record);

    int insertSelective(loadErrorRecord record);

    List<loadErrorRecord> selectByExample(loadErrorRecordExample example);

    loadErrorRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") loadErrorRecord record, @Param("example") loadErrorRecordExample example);

    int updateByExample(@Param("record") loadErrorRecord record, @Param("example") loadErrorRecordExample example);

    int updateByPrimaryKeySelective(loadErrorRecord record);

    int updateByPrimaryKey(loadErrorRecord record);
}