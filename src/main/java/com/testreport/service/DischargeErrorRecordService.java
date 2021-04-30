package com.testreport.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testreport.bean.DischargeErrorRecord;
import com.testreport.bean.DischargeErrorRecordExample;
import com.testreport.dao.DischargeErrorRecordMapper;

@Service
public class DischargeErrorRecordService {
	
		@Autowired
		private DischargeErrorRecordMapper dischargeErrorRecordMapper;
		
		public List<DischargeErrorRecord> getDischargeErrorRecords(){
			
			List<DischargeErrorRecord> list = dischargeErrorRecordMapper.selectByExample(null);
			return list;
			
		}

		/**
		 * 保存信息
		 * @param dischargeErrorRecord
		 */
		public void saveDischargeErrorRecord(DischargeErrorRecord dischargeErrorRecord) {
			// TODO Auto-generated method stub
			
			SimpleDateFormat sdf = new SimpleDateFormat();
			sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记  
	        Date date = new Date();// 获取当前时间
			dischargeErrorRecord.setCreateTime(date);
			dischargeErrorRecordMapper.insertSelective(dischargeErrorRecord);
		}

		/*
		 * 根据id查询记录信息
		 */
		public DischargeErrorRecord getDischargeErrorRecord(Integer id) {
			// TODO Auto-generated method stub
			DischargeErrorRecord dischargeErrorRecord = dischargeErrorRecordMapper.selectByPrimaryKey(id);
			return dischargeErrorRecord;
		}

		/**
		 * 更新信息
		 * @param dischargeErrorRecord
		 */
		public void updateDischargeErrorRecord(DischargeErrorRecord dischargeErrorRecord) {
			// TODO Auto-generated method stub
			dischargeErrorRecordMapper.updateByPrimaryKeySelective(dischargeErrorRecord);
			
		} 
		
		/*
		 * 检验用户名
		 */
		public boolean checkUser(String tallyMan) {
			DischargeErrorRecordExample example = new DischargeErrorRecordExample();
			DischargeErrorRecordExample.Criteria criteria = example.createCriteria();
	        criteria.andTallyManEqualTo(tallyMan);
	        long count = dischargeErrorRecordMapper.countByExample(example);
	        return count == 0;
	    }

		

		/*
		 *	 删除记录
		 */
		public void deleteDischargeErrorRecord(Integer id) {
			// TODO Auto-generated method stub
			dischargeErrorRecordMapper.deleteByPrimaryKey(id);
			dischargeErrorRecordMapper.fresh1();
			dischargeErrorRecordMapper.fresh2();
			dischargeErrorRecordMapper.fresh3();
		}
		
		public void deleteBatch(List<Integer> del_ids) {
			// TODO Auto-generated method stub
			DischargeErrorRecordExample dischargeErrorRecordExample = new DischargeErrorRecordExample();
			DischargeErrorRecordExample.Criteria criteria = dischargeErrorRecordExample.createCriteria();
			criteria.andIdIn(del_ids);
			dischargeErrorRecordMapper.deleteByExample(dischargeErrorRecordExample);
			dischargeErrorRecordMapper.fresh1();
			dischargeErrorRecordMapper.fresh2();
			dischargeErrorRecordMapper.fresh3();
		}
}
