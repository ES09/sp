package com.osf.sp.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osf.sp.mapper.EmpMapper;
import com.osf.sp.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {
	@Resource 
	private EmpMapper em;
	@Override
	public List<Map<String, Object>> selectEmpList(int deptNo) {
		// TODO Auto-generated method stub
		return em.selectEmpList(deptNo);
	}
	
}
