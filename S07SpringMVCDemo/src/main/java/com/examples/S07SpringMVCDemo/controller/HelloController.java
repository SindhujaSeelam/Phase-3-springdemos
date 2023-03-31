package com.examples.S07SpringMVCDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.S07SpringMVCDemo.model.Employee;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("id",123);
		modelView.addObject("name","Ken");
		modelView.addObject("salary",1000);
		
		modelView.setViewName("hello");
		return modelView;
	}
	
	@RequestMapping("/readobject")
	public ModelAndView read2() {
		
		ModelAndView modelView=new ModelAndView();
		
		Employee emp=new Employee();
		emp.setId(1234);
		emp.setName("Mary");
		emp.setSalary(3456);
		modelView.addObject("employee",emp);
		
		modelView.setViewName("hello");
		return modelView;
}
	
	@RequestMapping("/employees")
	public ModelAndView read3() {
		
		List<Employee> emps=new ArrayList<Employee>();
		ModelAndView modelView=new ModelAndView();
		
		Employee emp=new Employee();
		emp.setId(1234);
		emp.setName("Mary");
		emp.setSalary(3456);
		
		emps.add(emp);
		
		emp.setId(12345);
		emp.setName("Ken");
		emp.setSalary(43456);
		
		emps.add(emp);
		
		emp.setId(123456);
		emp.setName("RK");
		emp.setSalary(653456);
		
		emps.add(emp);
		
		
		modelView.addObject("employees",emps);
		
		modelView.setViewName("employees");
		return modelView;
}
}
