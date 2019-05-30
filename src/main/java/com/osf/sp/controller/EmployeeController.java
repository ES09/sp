package com.osf.sp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.EmployeeService;
import com.osf.sp.vo.EmployeeVO;
import com.osf.sp.vo.UploadFileVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class EmployeeController {
	@Resource
	private EmployeeService es; 
	
	@CrossOrigin("*")
	@GetMapping("/employees")
	public @ResponseBody List<EmployeeVO> getselectList(){
		
		return es.selectEmployeeList();
	}
	@CrossOrigin("*")
	@GetMapping("/employee")
	public @ResponseBody List<EmployeeVO> getselectByNo(@RequestParam Integer employeeNo){
		log.debug("param = >{}",employeeNo);
		EmployeeVO ev = new EmployeeVO();
		ev.setEmployeeNo(employeeNo);
		return es.selectEmployeeByNo(ev);
	}
	
	@CrossOrigin("*")
	@PostMapping("/employees")
	public @ResponseBody int insertEmployee(EmployeeVO emp) {
		log.info("insert EmployeeList => {}", emp);
		log.info("thPath => {}", emp.getThPath());
		return es.insertEmployee(emp);
	}
	
	@CrossOrigin("*")
	@PutMapping("/employees")
	public @ResponseBody int updateEmployee(@RequestBody EmployeeVO emp) {
		log.info("update EmployeeList => {}", emp);
		return es.updateEmployee(emp);
	}
	
	@CrossOrigin("*")
	@DeleteMapping("/employees")
	public @ResponseBody int deleteEmployee(@RequestParam int employeeNo) {
		log.info("delete employeeNo => {}", employeeNo);
		return es.deleteEmployee(employeeNo);
	}
	
//	@CrossOrigin("*")
//	@PostMapping("/employee")
//	public @ResponseBody Integer doUpoloadFile(UploadFileVO ufvo) {
//		log.info("file => {}", ufvo);
////		String fileName = ufvo.getFile().getOriginalFilename();
////		log.info("fileName => {}", fileName);
//		return 1;
//	}
	
	
}
