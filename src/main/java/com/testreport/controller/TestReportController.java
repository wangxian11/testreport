package com.testreport.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testreport.bean.Msg;
import com.testreport.bean.TestReport;
import com.testreport.service.TestReportService;

@Controller
public class TestReportController {

	@Autowired
	private TestReportService testReportService;
	
	@RequestMapping("/testReports")
	@ResponseBody
	public Msg getTestReportWithJson(@RequestParam(value="pn",defaultValue="1") Integer pn) {
			
			
			PageHelper.startPage(pn, 5);
			List<TestReport> testReports = testReportService.getTestReports();
			//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
			//封装了分页的详细信息，包括有我们查询出来的数据，传入连续显示的页数
			PageInfo page = new PageInfo(testReports, 5);
			System.out.println("-----------******-----------");
			return Msg.success().add("pageInfo", page);
			
	}
	
	/**
	 * 解决方案
     * 要能支持直接发送PUT之类的请求，还要封装请求体中的数据
     * 1、配置上HttpputFormContentFilter；
     * 2、作用：将请求体中的数据解析包装成一个map。
     * 3、request被重新包装，request.getParameter()被重写，就会从自己封装的map中取数据
	 * 更新信息
	 * @param testReport
	 * @return
	 */
	@PutMapping("/testReport/{id}")
	@ResponseBody
	public Msg saveTestReport(TestReport testReport) {

		testReportService.updateTestReport(testReport);
		return Msg.success();

	}

	/**
	 * 根据id查询信息
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/testReport/{id}")
	@ResponseBody
	public Msg getTestReport(@PathVariable("id") Integer id) {

		TestReport testReport = testReportService.getTestReport(id);
		return Msg.success().add("testReport", testReport);
	}

	/**
	 * 保存信息
	 * 
	 * @param testReport
	 * @param result
	 * @return
	 */
	@PostMapping("/testReport")
	@ResponseBody
	public Msg saveTestReport(TestReport testReport, BindingResult result) {
		if (result.hasErrors()) {
			Map<String, Object> map = new HashMap<>();
			// 校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名：" + fieldError.getField());
				System.out.println("错误信息：" + fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			testReportService.saveTestReport(testReport);
			return Msg.success();
		}

	}

	/**
	 * 单个批量二合一
     * 批量删除：1-2-3
     * 单个删除：1
	 * 
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@DeleteMapping("/testReport/{ids}")
	public Msg deleteEmpById(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			// 
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			testReportService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			testReportService.deleteTestReport(id);
		}
		return Msg.success();
	}

	/**
	 * 检查用户信息
	 * 
	 * @param tallyMan
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkuserT")
	public Msg checkuser(@RequestParam("tester") String tester) {
		// 先判断用户名是否是合法的表达式
		String regx = "(^[a-zA-Z0-9_-]{4,16}$)|(^[\\u2E80-\\u9FFF]{2,5})";
		if (!tester.matches(regx)) {
			return Msg.fail().add("va_msg", "用户名必须是4-16位英文数字或2-5位中文");
		}
		// 数据库用户名重复校验
		boolean b = testReportService.checkUser(tester);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", "用户名不可用");
		}
	}

	
	
	
	
}
