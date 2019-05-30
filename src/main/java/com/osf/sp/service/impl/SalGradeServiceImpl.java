package com.osf.sp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osf.sp.mapper.SalGradeMapper;
import com.osf.sp.service.SalGradeService;
@Service
public class SalGradeServiceImpl implements SalGradeService {
	
	@Resource   // 오토와이어지 랑 비슷하게 쓰임 .(이것은 java언어테이션이여서 오토와이드 처럼 스프링에 존속되어있지 않는다 .)
	private SalGradeMapper sgm;
	
	@Override
	public List<Map<String, Object>> selectSalGradeList() {
	
		return sgm.selectSalGradeList();
	}

	@Override
	public List<Map<String, Object>> selectSalGradeOneGrade(Map<String, Object> salgrade) {
		return sgm.selectSalGradeOneGrade(salgrade);
	}

	@Override
	public int insertSalGrade(Map<String, Object> salgrade) {
		return sgm.insertSalGrade(salgrade);
	}

	@Override
	public int updateSalGrade(Map<String, Integer> salgrade) {
		return sgm.updateSalGrade(salgrade);
	}

	@Override
	public int deleteSalGrade(Map<String, Object> salgrade) {
		return sgm.deleteSalGrade(salgrade);
	}

	

}
