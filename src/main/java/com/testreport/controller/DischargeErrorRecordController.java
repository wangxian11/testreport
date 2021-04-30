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
import com.testreport.bean.DischargeErrorRecord;
import com.testreport.service.DischargeErrorRecordService;

@Controller
public class DischargeErrorRecordController {

	@Autowired
	private DischargeErrorRecordService dischargeErrorRecordService;

	/**
	 * 查询信息（分页查询）
	 * 
	 * @param pn
	 * @return
	 */
	@RequestMapping("/dischargeErrorRecords")
	@ResponseBody
	public Msg getDischargeErrorRecordWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {

		PageHelper.startPage(pn, 10);
		List<DischargeErrorRecord> dischargeErrorRecords = dischargeErrorRecordService.getDischargeErrorRecords();
		//使用PageInfo包装查询后的结果，只需要将PageInfo交给页面就行了
		//封装了分页的详细信息，包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(dischargeErrorRecords, 10);
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
	 * @param dischargeErrorRecord
	 * @return
	 */
	@PutMapping("/dischargeErrorRecord/{id}")
	@ResponseBody
	public Msg saveDischargeErrorRecord(DischargeErrorRecord dischargeErrorRecord) {

		dischargeErrorRecordService.updateDischargeErrorRecord(dischargeErrorRecord);
		return Msg.success();

	}

	/**
	 * 根据id查询信息
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/dischargeErrorRecord/{id}")
	@ResponseBody
	public Msg getDischargeErrorRecord(@PathVariable("id") Integer id) {

		DischargeErrorRecord dischargeErrorRecord = dischargeErrorRecordService.getDischargeErrorRecord(id);
		return Msg.success().add("dischargeErrorRecord", dischargeErrorRecord);
	}

	/**
	 * 保存信息
	 * 
	 * @param dischargeErrorRecord
	 * @param result
	 * @return
	 */
	@PostMapping("/dischargeErrorRecord")
	@ResponseBody
	public Msg saveDischargeErrorRecord(DischargeErrorRecord dischargeErrorRecord, BindingResult result) {
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
			dischargeErrorRecordService.saveDischargeErrorRecord(dischargeErrorRecord);
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
	@DeleteMapping("/dischargeErrorRecord/{ids}")
	public Msg deleteEmpById(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			// 
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			dischargeErrorRecordService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			dischargeErrorRecordService.deleteDischargeErrorRecord(id);
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
	@RequestMapping("/checkuserD")
	public Msg checkuser(@RequestParam("tallyMan") String tallyMan) {
		// 先判断用户名是否是合法的表达式
		String regx = "(^[a-zA-Z0-9_-]{4,16}$)|(^[\\u2E80-\\u9FFF]{2,5})";
		if (!tallyMan.matches(regx)) {
			return Msg.fail().add("va_msg", "用户名必须是4-16位英文数字或2-5位中文");
		}
		// 数据库用户名重复校验
		boolean b = dischargeErrorRecordService.checkUser(tallyMan);
		if (b) {
			return Msg.success();
		} else {
			return Msg.fail().add("va_msg", "用户名不可用");
		}
	}

}
