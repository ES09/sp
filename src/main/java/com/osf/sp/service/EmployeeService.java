package com.osf.sp.service;

import java.util.List;

import com.osf.sp.vo.EmployeeVO;

public interface EmployeeService {
	List<EmployeeVO> selectEmployeeList();
	List<EmployeeVO> selectEmployeeByNo(EmployeeVO ev);
	 int insertEmployee(EmployeeVO ev);
	 int updateEmployee(EmployeeVO ev);
	 int updateEmployeeFile(EmployeeVO ev, int employeeNo, String employeePath);
	 int deleteEmployee(int employeeNo);
	 
}
