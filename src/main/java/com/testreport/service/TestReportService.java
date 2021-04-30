package com.testreport.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testreport.bean.TestReport;
import com.testreport.bean.TestReportExample;
import com.testreport.dao.TestReportMapper;

@Service
public class TestReportService {

	@Autowired
	private TestReportMapper testReportMapper;

	public List<TestReport> getTestReports() {
		// TODO Auto-generated method stub
		List<TestReport> list = testReportMapper.selectByExample(null);
		return list;
		
	}
	
	/**
	 * 保存信息
	 * @param testReport
	 */
	public void saveTestReport(TestReport testReport) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记  
        Date date = new Date();// 获取当前时间
        testReport.setCreateTime(date);
		testReportMapper.insertSelective(testReport);
	}

	/*
	 * 根据id查询记录信息
	 */
	public TestReport getTestReport(Integer id) {
		// TODO Auto-generated method stub
		TestReport testReport = testReportMapper.selectByPrimaryKey(id);
		return testReport;
	}

	/**
	 * 更新信息
	 * @param testReport
	 */
	public void updateTestReport(TestReport testReport) {
		// TODO Auto-generated method stub
		testReportMapper.updateByPrimaryKeySelective(testReport);
		
	} 
	
	/*
	 * 检验用户名
	 */
	public boolean checkUser(String tallyMan) {
		TestReportExample example = new TestReportExample();
		TestReportExample.Criteria criteria = example.createCriteria();
        criteria.andTesterEqualTo(tallyMan);
        long count = testReportMapper.countByExample(example);
        return count == 0;
    }

	

	/*
	 *	 删除记录
	 */
	public void deleteTestReport(Integer id) {
		// TODO Auto-generated method stub
		testReportMapper.deleteByPrimaryKey(id);
		testReportMapper.fresh1();
		testReportMapper.fresh2();
		testReportMapper.fresh3();
	}
	
	public void deleteBatch(List<Integer> del_ids) {
		// TODO Auto-generated method stub
		TestReportExample testReportExample = new TestReportExample();
		TestReportExample.Criteria criteria = testReportExample.createCriteria();
		criteria.andIdIn(del_ids);
		testReportMapper.deleteByExample(testReportExample);
		testReportMapper.fresh1();
		testReportMapper.fresh2();
		testReportMapper.fresh3();
	}
	
	
	
}
