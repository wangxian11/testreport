package com.testreport.dao;

import com.testreport.bean.TestReport;
import com.testreport.bean.TestReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestReportMapper {
    long countByExample(TestReportExample example);

    int deleteByExample(TestReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestReport record);

    int insertSelective(TestReport record);

    List<TestReport> selectByExample(TestReportExample example);

    TestReport selectByPrimaryKey(Integer id);
    
    int fresh1();
    int fresh2();
    int fresh3();

    int updateByExampleSelective(@Param("record") TestReport record, @Param("example") TestReportExample example);

    int updateByExample(@Param("record") TestReport record, @Param("example") TestReportExample example);

    int updateByPrimaryKeySelective(TestReport record);

    int updateByPrimaryKey(TestReport record);
}