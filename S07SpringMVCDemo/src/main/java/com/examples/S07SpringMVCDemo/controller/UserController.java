package com.examples.S07SpringMVCDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVCDemo.model.User;

@Controller
public class UserController {

	@RequestMapping("/register")

	public ModelAndView showRegisterationpage() {
		
		ModelAndView modelView=new ModelAndView();
				
		modelView.setViewName("userregister");
		return modelView;
	}
	
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)

	public ModelAndView signupuser(@ModelAttribute("user") User user) {
		
		ModelAndView modelView=new ModelAndView();
			
		modelView.addObject("user",user);
		modelView.setViewName("userregisterresult");
		return modelView;
	}
}
