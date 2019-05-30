package com.osf.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	@GetMapping("/test")
	public @ResponseBody Integer doTest() {
		return  1;
	}
	@GetMapping("/views/test")
	public String goPage() {
		return "/views/test";
	}
}
