package com.osf.sp.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.osf.sp.vo.EmployeeVO;

@MapperScan
public interface EmployeeMapper {
 List<EmployeeVO> selectEmployeeList();
 List<EmployeeVO> selectEmployeeByNo(EmployeeVO ev);
 int insertEmployee(EmployeeVO ev);
 int updateEmployee(EmployeeVO ev);
 int updateEmployeeFile(int employeeNo, String employeePath);
 int deleteEmployee(int employeeNo);
}
