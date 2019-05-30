package com.osf.sp.service;

import java.util.List;
import java.util.Map;

public interface SalGradeService {
	List<Map<String,Object>> selectSalGradeList();
	List<Map<String,Object>> selectSalGradeOneGrade(Map<String,Object> salgrade);
	int insertSalGrade(Map<String,Object> salgrade);
	int updateSalGrade(Map<String,Integer> salgrade);
	int deleteSalGrade(Map<String,Object> salgrade);
}
