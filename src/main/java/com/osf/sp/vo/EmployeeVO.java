package com.osf.sp.vo;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Alias("emp")
public class EmployeeVO {
	
	private Integer employeeNo;
	private String employeeName;
	private String employeePassword;
	private String personalContact;
	private String extensionNumber;
	private String employeeEmail;
	private Integer employeeBirth;
	private String finalEducationState;
	private String finalEducation;
	private String employeeBankName;
	private String employeeBankCode;
	private String dateOfEntry;
	private String dateOfDeparture;
	private Integer employeeUsageStatus;
	private String employeePath;
	private MultipartFile thPath;
	

}
