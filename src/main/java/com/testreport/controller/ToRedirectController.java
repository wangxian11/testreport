package com.testreport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ToRedirectController {

	@RequestMapping(value = "/dischargeErrorRecordList",method = RequestMethod.GET)
	public String toDischargeErrorRecordList() {
		
		/*
		 * ModelAndView dischargeErrorRecordList = new
		 * ModelAndView("dischargeErrorRecordList");
		 */
		  return "dischargeErrorRecordList";
	}
	
	@RequestMapping(value = "/loadErrorRecordList",method = RequestMethod.GET)
	public String toLoadErrorRecordList() {
		
		  return "loadErrorRecordList";
	}
	
	@RequestMapping(value = "/reportRecordList",method = RequestMethod.GET)
	public String toReportRecordList() {
		
		  return "reportRecordList";
	}
	
}
