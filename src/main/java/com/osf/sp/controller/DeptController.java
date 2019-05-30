package com.osf.sp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	private DeptService ds;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/depts")
	public @ResponseBody List<Map<String,Object>> getDepts(){
		return ds.selectDeptList();
	}
}
