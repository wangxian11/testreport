package com.testreport.dao;

import com.testreport.bean.dischargeErrorRecord;
import com.testreport.bean.dischargeErrorRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface dischargeErrorRecordMapper {
    long countByExample(dischargeErrorRecordExample example);

    int deleteByExample(dischargeErrorRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(dischargeErrorRecord record);

    int insertSelective(dischargeErrorRecord record);

    List<dischargeErrorRecord> selectByExample(dischargeErrorRecordExample example);

    dischargeErrorRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") dischargeErrorRecord record, @Param("example") dischargeErrorRecordExample example);

    int updateByExample(@Param("record") dischargeErrorRecord record, @Param("example") dischargeErrorRecordExample example);

    int updateByPrimaryKeySelective(dischargeErrorRecord record);

    int updateByPrimaryKey(dischargeErrorRecord record);
}