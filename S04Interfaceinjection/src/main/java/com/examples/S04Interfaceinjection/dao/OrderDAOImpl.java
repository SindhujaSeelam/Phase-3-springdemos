package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("MySQL")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Open connection to MySQL");
		System.out.println("Run insert statement on MySQL ");
		System.out.println("Order created");
	}

}
