package com.skhu.Ian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skhu.Ian.model.User;
import com.skhu.Ian.repository.UserRepository;


@Controller
public class MainController {
	
	@Autowired
	private UserRepository userRepository;

	
	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "helloHome";
	}
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("name","hello springBoot1234");
		return "hello";
		
	}
	

}
