package com.osf.sp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.sp.mapper.DeptMapper;
import com.osf.sp.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptMapper dm;
	@Override
	public List<Map<String, Object>> selectDeptList() {
		return dm.selectDeptList();
	}

}
