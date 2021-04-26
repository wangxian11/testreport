package com.testreport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testreport.bean.dischargeErrorRecord;
import com.testreport.dao.dischargeErrorRecordMapper;

@Service
public class DischargeErrorRecordService {
	
		@Autowired
		private dischargeErrorRecordMapper dischargeErrorRecordMapper;
		
		public List<dischargeErrorRecord> getdischargeErrorRecords(){
			List<dischargeErrorRecord> list = dischargeErrorRecordMapper.selectByExample(null);
			return list;
			
		} 
}
