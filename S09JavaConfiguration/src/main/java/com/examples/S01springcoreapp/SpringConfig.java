package com.examples.S01springcoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public Employee emp1() {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("John");
		return emp;
	}
	
	@Bean
	public Employee emp2() {
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("Max");
		return emp;
	}
	
	@Bean
	public Employee emp3() {
		Employee emp=new Employee();
		emp.setId(3);
		emp.setName("Kevin");
		return emp;
	}
	
	@Bean
	public Employee emp4() {
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("Smith");
		List<String> departments = new ArrayList<>();
		departments.add("HR");
		departments.add("Admin");
		departments.add("Sales");
		emp.setDepartments(departments);
		return emp; 
		
	}
	
	@Bean
	public Employee emp5() {
		
		Employee emp=new Employee();
		emp.setId(5);
		emp.setName("Jonathan");
		return emp;
	}
	
	@Bean
	public Employee emp6() {
		
		Employee emp=new Employee();
		emp.setId(6);
		emp.setName("Amy");
		return emp;
	}
	
	@Bean
	public Employee emp7() {
		
		Employee emp=new Employee();
		emp.setId(7);
		emp.setName("Michael");
		Address address = new Address();
		address.setCity("chennai");
		address.setState("TN");
		address.setPincode("123456");
		emp.setAddress(address);
		return emp;
	}
}
