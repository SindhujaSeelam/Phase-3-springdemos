package com.examples.S08SpringMVCORMDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.S08SpringMVCORMDemo.Exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.entity.user2;
import com.examples.S08SpringMVCORMDemo.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/register")
	public String showregistrationpage(){
		return "userreg";
		
	}
	
	@RequestMapping("/registeruser")
	public String registeruser(@ModelAttribute("user")user2 user,ModelMap model) {
		int result;
		try {
			result = userservice.save(user);
			model.addAttribute("message","User created with id "+ result);
			model.addAttribute("users",userservice.getusers());
		} catch (UserAlreadyExistsException e) {
			model.addAttribute("message",e.getMessage());

		}
		
		return "userreg";
	}
	
	@RequestMapping("/users")
	public String displayusers(ModelMap model) {
		model.addAttribute("users",userservice.getusers());
		return "displayusers";
		
	}
}
