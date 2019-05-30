package com.osf.sp.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.EmpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmpController {
	@Resource
	private EmpService es;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/emps")
	public @ResponseBody List<Map<String,Object>> getList(@RequestParam int deptNo){
		log.debug("deptNo - >{}" ,deptNo);
		return es.selectEmpList(deptNo);
	}
}
