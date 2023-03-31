package com.examples.S06SpringORMDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.examples.S06SpringORMDemo.entity.product2;

@Component("productdao")
public class ProductDAOImpl implements ProductDAO{

	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(product2 product) {
		Integer result=(Integer) hibernateTemplate.save(product);
		return result;
	}

	@Override
	@Transactional
	public void update(product2 product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(product2 product) {
		hibernateTemplate.delete(product);
	}

	@Override
	public product2 find(int id) {
		return hibernateTemplate.get(product2.class,id);
		
	}

	@Override
	
	public List<product2> findAll() {
		
		return hibernateTemplate.loadAll(product2.class) ;
	}

}
