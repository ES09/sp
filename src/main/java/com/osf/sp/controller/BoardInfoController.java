package com.osf.sp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.osf.sp.service.BoradInfoService;
import com.osf.sp.vo.BoardInfoVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardInfoController {

//	@Resource
//	private BoradInfoService bis;
//	@CrossOrigin("http://localhost")
//	@GetMapping("/boardinfos")
//	public @ResponseBody List<BoardInfoVO> selectBoardInfoList(){
//		return bis.selectBoradInfoList();
//	}
//	
//	
//	@CrossOrigin("http://localhost")  
//	@PostMapping("/save")
//	public @ResponseBody int insertBoardInfo(@RequestBody BoardInfoVO bi) {
//		log.debug("param =>{}",bi);
//		return bis.insertBoardInfo(bi);
//		return 1;    
//	}
//	
//	@CrossOrigin("http://localhost")
//	@PutMapping("/update")
//	public @ResponseBody int updateBoardInfo(@RequestBody BoardInfoVO bi) {
//		log.debug("parma => {}",bi);
//		return 1;
//		return bis.updateBoardInfo(bi);
//	}
//	
//	@CrossOrigin("http://localhost")
//	@GetMapping("/boardInfo")
//	public @ResponseBody List<BoardInfoVO>  boardInfoByNum(@RequestParam int biNum){
//		log.debug("param =>  {} ",biNum);
//		BoardInfoVO bi = new BoardInfoVO();
//		bi.setBiNum(biNum);
//		return bis.selectBoradInfoByNum(bi);
//		
//	}
	
	
	
}
