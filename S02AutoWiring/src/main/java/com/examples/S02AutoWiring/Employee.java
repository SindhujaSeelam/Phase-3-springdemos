package com.examples.S02AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int id;
	private String name;

	@Autowired
	@Qualifier("address2")
	private Address homeaddress;
	

	@Autowired
	@Qualifier("address2")
	private Address officeaddress;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", homeaddress=" + homeaddress +  ", officeaddress=" + officeaddress +"]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
