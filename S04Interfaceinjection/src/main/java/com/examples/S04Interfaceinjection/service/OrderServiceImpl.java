package com.examples.S04Interfaceinjection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.examples.S04Interfaceinjection.dao.OrderDAO;

@Component("orderservice")
public class OrderServiceImpl implements OrderService{

	@Autowired
	@Qualifier("oracleorder")
	private OrderDAO orderdao;

	@Override
	public void placeOrder() {

		System.out.println("Ready to place order");
		
		orderdao.createOrder();
	}

}
