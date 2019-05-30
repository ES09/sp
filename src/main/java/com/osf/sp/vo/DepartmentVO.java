package com.osf.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("department")
public class DepartmentVO {
	
	private Integer departmentCode;
	private String departmentName;
	private Integer departmentParentCode;
	private String departmentActivation;
	private String departmentDescription;

}
