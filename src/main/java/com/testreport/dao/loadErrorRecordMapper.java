package com.testreport.dao;

import com.testreport.bean.LoadErrorRecord;
import com.testreport.bean.LoadErrorRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoadErrorRecordMapper {
    long countByExample(LoadErrorRecordExample example);

    int deleteByExample(LoadErrorRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LoadErrorRecord record);

    int insertSelective(LoadErrorRecord record);

    List<LoadErrorRecord> selectByExample(LoadErrorRecordExample example);

    LoadErrorRecord selectByPrimaryKey(Integer id);
    
    int fresh1();
    int fresh2();
    int fresh3();

    int updateByExampleSelective(@Param("record") LoadErrorRecord record, @Param("example") LoadErrorRecordExample example);

    int updateByExample(@Param("record") LoadErrorRecord record, @Param("example") LoadErrorRecordExample example);

    int updateByPrimaryKeySelective(LoadErrorRecord record);

    int updateByPrimaryKey(LoadErrorRecord record);
}