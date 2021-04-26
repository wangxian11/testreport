package com.testreport.dao;

import com.testreport.bean.testReport;
import com.testreport.bean.testReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface testReportMapper {
    long countByExample(testReportExample example);

    int deleteByExample(testReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(testReport record);

    int insertSelective(testReport record);

    List<testReport> selectByExample(testReportExample example);

    testReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") testReport record, @Param("example") testReportExample example);

    int updateByExample(@Param("record") testReport record, @Param("example") testReportExample example);

    int updateByPrimaryKeySelective(testReport record);

    int updateByPrimaryKey(testReport record);
}