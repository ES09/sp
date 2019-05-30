package com.osf.sp.mapper;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface SalGradeMapper {
	List<Map<String,Object>> selectSalGradeList();
	List<Map<String,Object>> selectSalGradeOneGrade(Map<String,Object> salgrade);
	int insertSalGrade(Map<String,Object> salgrade);
	int updateSalGrade(Map<String,Integer> salgrade);
	int deleteSalGrade(Map<String,Object> salgrade);

}
