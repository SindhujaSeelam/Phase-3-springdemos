package com.example.S11SpringBootDataJPA;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.S11SpringBootDataJPA.repository.ProductRepository;
import com.example.S11SpringBootDataJPA.entity.product2;


@SpringBootTest
class S11SpringBootDataJpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	//@Test
	void contextLoads() {
	}
	
	//@Test
	void createProduct() {
		product2 product = new product2();
		product.setName("Laptop");
		product.setDescription("Personal laptop ");
		product.setPrice(250000);
		
		ProductRepository pr= context.getBean(ProductRepository.class);
		pr.save(product);
	}
	
	//@Test
	void readProduct() {
		
		ProductRepository pr= context.getBean(ProductRepository.class);
		Optional<product2> op = pr.findById(3);
		if(op.isPresent()) {
			product2 p=op.get();
			System.out.println(p);
		}else {
			System.out.println("Id not found");
		}
	}

	//@Test
	void updateProduct() {
		
		ProductRepository pr= context.getBean(ProductRepository.class);
		Optional<product2> op = pr.findById(2);
		if(op.isPresent()) {
			product2 p=op.get();
			System.out.println(p);
			p.setPrice(10000);
			pr.save(p);
		}else {
			System.out.println("Id not found");
		}
	}
	
	//@Test
	void readAllProducts() {
	
		ProductRepository pr= context.getBean(ProductRepository.class);
		List<product2> p =(List<product2>) pr.findAll();
		System.out.println(p);
	}
	
	@Test
	void readAllProductsByName() {
	
		ProductRepository pr= context.getBean(ProductRepository.class);
		List<product2> p =(List<product2>) pr.findByName("laptop");
		System.out.println(p);
	}
}
