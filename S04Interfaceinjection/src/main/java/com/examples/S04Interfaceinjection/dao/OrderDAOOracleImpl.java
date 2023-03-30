package com.examples.S04Interfaceinjection.dao;

import org.springframework.stereotype.Component;

@Component("oracleorder")
public class OrderDAOOracleImpl implements OrderDAO {

	@Override
	public void createOrder() {

		System.out.println("Open connection to Oracle");
		System.out.println("Run insert statement on Oracle ");
		System.out.println("Order created");
	}

}
