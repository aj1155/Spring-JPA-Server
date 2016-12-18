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
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userDao;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> list(Model model){
		List<User> list = userDao.findAll();
		return list;
	}

}
