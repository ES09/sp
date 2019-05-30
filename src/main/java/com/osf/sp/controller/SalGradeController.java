package com.osf.sp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Case;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.SalGradeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class SalGradeController {
	
	@Resource 
	private SalGradeService sgs;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/salgrades")
	public @ResponseBody List<Map<String,Object>> selectSalGrades(){
		return sgs.selectSalGradeList();
	}
	@CrossOrigin(origins = "*")
	@GetMapping("/salgrade/{caze}")
	public @ResponseBody List<Map<String,Object>> selectSalGradeOneGrade(@PathVariable String caze){
		Map<String,Object> salgrade  = new HashMap<>();
		salgrade.put("grade",caze);
		log.info("{}",salgrade);
		return sgs.selectSalGradeOneGrade(salgrade);
	}
	@PutMapping("/salgrade")  
	public @ResponseBody Integer updateSalGrade(@RequestBody Map<String,Integer> salgrade) {
		log.info("{}",salgrade);
		return sgs.updateSalGrade(salgrade);
	}
	@CrossOrigin(origins = "*")
	@DeleteMapping("/salgrade")
	public @ResponseBody Integer deleteSalGrade(@RequestBody Map<String,Object> salgrade) {
		log.info("{}",salgrade);
		return sgs.deleteSalGrade(salgrade);
	}
	@PostMapping("/salgrade")
	public @ResponseBody Integer insertSalGrade(@RequestBody Map<String,Object> salgrade) {
		log.info("{}",salgrade);
		return sgs.insertSalGrade(salgrade);
	}
}
