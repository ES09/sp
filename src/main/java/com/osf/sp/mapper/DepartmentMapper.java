package com.osf.sp.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.osf.sp.vo.DepartmentVO;

@MapperScan
public interface DepartmentMapper {
 List<DepartmentVO> selectDepartmentList();
 List<DepartmentVO> selectDepartmentByNo(DepartmentVO dept);
 int insertDepartment(DepartmentVO dept);
 int updateDepartment(DepartmentVO dept);
 int deleteDepartment(int departmentCode);
}
