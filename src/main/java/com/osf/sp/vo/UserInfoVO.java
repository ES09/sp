package com.osf.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("ui")// 해당 알리아스는 ui 됌 
public class UserInfoVO {
	private Integer uiNo;
	private String uiId;
	private String uiPwd;
	private Integer uiAge;
	private String tokken;
}
