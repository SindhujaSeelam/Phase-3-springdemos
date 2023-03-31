package com.examples.S05SpringJdbcDemo.dao;

import java.util.List;

import com.examples.S05SpringJdbcDemo.entity.Employee;

public interface EmployeeDAO {

	public int create(Employee employee);
	
	public int update(Employee emp);
	
	public int delete(int id);
	
	Employee read(int id);
	
	List<Employee> read();
}
