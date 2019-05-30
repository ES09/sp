package com.osf.sp.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.UserInfoService;
import com.osf.sp.vo.ParamVO;
import com.osf.sp.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class UserInfoController {

	@Resource 
	private UserInfoService uis;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/userinfo")
	public @ResponseBody int insertUserInfo(@RequestBody UserInfoVO ui){
		log.debug("param = >{}",ui);
		return uis.insertUserInfo(ui);
//		return 1;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/userinfos")
	public @ResponseBody List<UserInfoVO> selectUserIofoList(){
		List<UserInfoVO> list = uis.selectUserIofoList();
		log.debug("Userinfo - >{}",list);
		return list;
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/userinfo")
	public @ResponseBody List<UserInfoVO> selectUserIofoByuiID(@RequestParam String uiId){
		log.debug("param = >{}",uiId);
		UserInfoVO ui = new UserInfoVO();
		ui.setUiId(uiId);		
		return uis.selectUserIofo(ui);
	}	
	
	@CrossOrigin(origins = "*")
	@PostMapping("/userinfos")
	public @ResponseBody int deleteUserInfo(ParamVO param) {
		log.debug("param - > {}",param);
		return uis.save(param);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/login")
	public @ResponseBody UserInfoVO doLogin(@RequestBody UserInfoVO ui) {
		log.debug("param =>{}",ui);
		return uis.selectUserInfoByLogin(ui);
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/join")
	public @ResponseBody int doJoin(@RequestBody UserInfoVO ui) {
		log.debug("param =>{}",ui);
		return uis.insertUserInfo(ui);
	}
}
