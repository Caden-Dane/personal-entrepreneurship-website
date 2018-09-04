package com.xbj.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xbj.website.model.User;
import com.xbj.website.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "user/findUser.htm")
	@ResponseBody
	public String findUser(Long id){
		User user = userService.findUserById(id);
		if(null == user){
			return "user is null !";
		}else {
			return "user is already exist !";
		}
	}
}
