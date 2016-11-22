package com.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String home(){
		System.out.println("ÄÈ½º");
		return "helloHome";
	}
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("name","hello springBoot1234");
		return "hello";
		
	  }

}
