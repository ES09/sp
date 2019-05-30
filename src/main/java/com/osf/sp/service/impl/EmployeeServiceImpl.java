package com.osf.sp.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.osf.sp.mapper.EmployeeMapper;
import com.osf.sp.service.EmployeeService;
import com.osf.sp.vo.EmployeeVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
	@Resource
	private EmployeeMapper em;
	private final String BASE_PATH = "D:\\study\\workspace3\\sp\\src\\main\\webapp\\resources\\imgs\\";
	
	@Override
	public List<EmployeeVO> selectEmployeeList() {
		return em.selectEmployeeList();
	}
	
	@Override
	public List<EmployeeVO> selectEmployeeByNo(EmployeeVO ev) {
		return em.selectEmployeeByNo(ev);
	}
	
	@Override
	public int insertEmployee(EmployeeVO ev) {
		MultipartFile mf = ev.getThPath();
		String originName = mf.getOriginalFilename();
		String extName = "";
		if(originName.lastIndexOf(".")!=-1) {
			extName = originName.substring(originName.lastIndexOf("."));
		}
		String fileName = System.currentTimeMillis() + extName;
		log.info("filName => {}", fileName);
		File saveFile = new File(BASE_PATH + fileName);
		try {
			Files.copy(mf.getInputStream(), saveFile.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		ev.setEmployeePath("/imgs/" + fileName);
		return em.insertEmployee(ev);
	}
	
	@Override
	public int updateEmployee(EmployeeVO ev) {
		return em.updateEmployee(ev);
	}
	
	@Override
	public int updateEmployeeFile(EmployeeVO ev, int employeeNo, String employeePath) {
		MultipartFile mf = ev.getThPath();
		String originName = mf.getOriginalFilename();
		String extName = "";
		if(originName.lastIndexOf(".")!=-1) {
			extName = originName.substring(originName.lastIndexOf("."));
		}
		String fileName = System.currentTimeMillis() + extName;
		log.info("filName => {}", fileName);
		File saveFile = new File(BASE_PATH + fileName);
		try {
			Files.copy(mf.getInputStream(), saveFile.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		ev.setEmployeePath("/imgs/" + fileName);
		return 0;
	}
	
	@Override
	public int deleteEmployee(int employeeNo) {
		return em.deleteEmployee(employeeNo);
	}

	
	

}
