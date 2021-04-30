package com.testreport.dao;

import com.testreport.bean.DischargeErrorRecord;
import com.testreport.bean.DischargeErrorRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DischargeErrorRecordMapper {
    long countByExample(DischargeErrorRecordExample example);

    int deleteByExample(DischargeErrorRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DischargeErrorRecord record);

    int insertSelective(DischargeErrorRecord record);

    List<DischargeErrorRecord> selectByExample(DischargeErrorRecordExample example);

    DischargeErrorRecord selectByPrimaryKey(Integer id);
    
    int fresh1();
    int fresh2();
    int fresh3();

    int updateByExampleSelective(@Param("record") DischargeErrorRecord record, @Param("example") DischargeErrorRecordExample example);

    int updateByExample(@Param("record") DischargeErrorRecord record, @Param("example") DischargeErrorRecordExample example);

    int updateByPrimaryKeySelective(DischargeErrorRecord record);

    int updateByPrimaryKey(DischargeErrorRecord record);
}