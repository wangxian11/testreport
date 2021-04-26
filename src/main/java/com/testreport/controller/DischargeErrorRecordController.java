package com.testreport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testreport.bean.Msg;
import com.testreport.bean.dischargeErrorRecord;
import com.testreport.service.DischargeErrorRecordService;

@Controller
public class DischargeErrorRecordController {
	
	@Autowired
	private DischargeErrorRecordService dischargeErrorRecordService;
	
	@RequestMapping("/dischargeErrorRecords")
	@ResponseBody
	public Msg getDischargeErrorRecordWithJson(@RequestParam(value="pn",defaultValue="1") Integer pn) {
			PageHelper.startPage(pn, 5);
			List<dischargeErrorRecord> dischargeErrorRecords = dischargeErrorRecordService.getdischargeErrorRecords();
			//ʹ��PageInfo��װ��ѯ��Ľ����ֻ��Ҫ��PageInfo����ҳ�������
			//��װ�˷�ҳ����ϸ��Ϣ�����������ǲ�ѯ���������ݣ�����������ʾ��ҳ��
			PageInfo page = new PageInfo(dischargeErrorRecords, 5);
			return Msg.sucess().add("pageInfo", page);
	}

}
