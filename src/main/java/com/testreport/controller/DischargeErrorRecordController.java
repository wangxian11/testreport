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
			//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
			//封装了分页的详细信息，包括有我们查询出来的数据，传入连续显示的页数
			PageInfo page = new PageInfo(dischargeErrorRecords, 5);
			return Msg.sucess().add("pageInfo", page);
	}

}
