package com.testreport.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testreport.bean.DischargeErrorRecord;
import com.testreport.bean.DischargeErrorRecordExample;
import com.testreport.bean.LoadErrorRecord;
import com.testreport.bean.LoadErrorRecordExample;
import com.testreport.dao.LoadErrorRecordMapper;

@Service
public class LoadErrorRecordService {

	@Autowired
	private LoadErrorRecordMapper loadErrorRecordMapper;

	public List<LoadErrorRecord> getLoadErrorRecords() {
		// TODO Auto-generated method stub
		List<LoadErrorRecord> list = loadErrorRecordMapper.selectByExample(null);
		return list;
	}

	/**
	 * 保存信息
	 * @param dischargeErrorRecord
	 */
	public void saveLoadErrorRecord(LoadErrorRecord loadErrorRecord) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记  
        Date date = new Date();// 获取当前时间
        loadErrorRecord.setCreateTime(date);
		loadErrorRecordMapper.insertSelective(loadErrorRecord);
	}

	/*
	 * 根据id查询记录信息
	 */
	public LoadErrorRecord getLoadErrorRecord(Integer id) {
		// TODO Auto-generated method stub
		LoadErrorRecord loadErrorRecord = loadErrorRecordMapper.selectByPrimaryKey(id);
		return loadErrorRecord;
	}

	/**
	 * 更新信息
	 * @param dischargeErrorRecord
	 */
	public void updateLoadErrorRecord(LoadErrorRecord loadErrorRecord) {
		// TODO Auto-generated method stub
		loadErrorRecordMapper.updateByPrimaryKeySelective(loadErrorRecord);
		
	} 
	
	/*
	 * 检验用户名
	 */
	public boolean checkUser(String tallyMan) {
		LoadErrorRecordExample example = new LoadErrorRecordExample();
		LoadErrorRecordExample.Criteria criteria = example.createCriteria();
        criteria.andTallyManEqualTo(tallyMan);
        long count = loadErrorRecordMapper.countByExample(example);
        return count == 0;
    }

	

	/*
	 *	 删除记录
	 */
	public void deleteLoadErrorRecord(Integer id) {
		// TODO Auto-generated method stub
		loadErrorRecordMapper.deleteByPrimaryKey(id);
		loadErrorRecordMapper.fresh1();
		loadErrorRecordMapper.fresh2();
		loadErrorRecordMapper.fresh3();
	}
	
	public void deleteBatch(List<Integer> del_ids) {
		// TODO Auto-generated method stub
		LoadErrorRecordExample loadErrorRecordRecordExample = new LoadErrorRecordExample();
		LoadErrorRecordExample.Criteria criteria = loadErrorRecordRecordExample.createCriteria();
		criteria.andIdIn(del_ids);
		loadErrorRecordMapper.deleteByExample(loadErrorRecordRecordExample);
		loadErrorRecordMapper.fresh1();
		loadErrorRecordMapper.fresh2();
		loadErrorRecordMapper.fresh3();
	}
	
}
