package com.osf.sp.vo;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UploadFileVO {
	
	MultipartFile file;
	String username;
	String userage;

}
