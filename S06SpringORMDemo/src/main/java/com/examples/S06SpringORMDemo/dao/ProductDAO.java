package com.examples.S06SpringORMDemo.dao;

import java.util.List;

import com.examples.S06SpringORMDemo.entity.product2;

public interface ProductDAO {

	int create(product2 product);
	
	void update(product2 product);
	
	void delete(product2 product);
	
	product2 find(int id);
	
	List<product2> findAll();
}
