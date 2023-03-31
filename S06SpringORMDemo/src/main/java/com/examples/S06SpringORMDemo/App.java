package com.examples.S06SpringORMDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.S06SpringORMDemo.dao.ProductDAO;
import com.examples.S06SpringORMDemo.entity.product2;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//create();

		//update();

		//delete();
		
		//find();
		
		findAll();
	}

	private static void findAll() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");

		ProductDAO prdao = (ProductDAO) ctx.getBean("productdao");

		List<product2> product =prdao.findAll();
		
		System.out.println(product);
	}

	private static void find() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");

		ProductDAO prdao = (ProductDAO) ctx.getBean("productdao");

		product2 product =prdao.find(2);
		
		System.out.println(product);
	}

	private static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");

		ProductDAO prdao = (ProductDAO) ctx.getBean("productdao");

		product2 product = new product2();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("Desktop computer");
		product.setPrice(5000.113);

		prdao.delete(product);
		System.out.println("Product deleted..");

	}

	private static void update() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");

		ProductDAO prdao = (ProductDAO) ctx.getBean("productdao");

		product2 product = new product2();
		product.setId(1);
		product.setName("Computer");
		product.setDescription("Desktop computer");
		product.setPrice(35000.123);

		prdao.update(product);
		System.out.println("Product updated");

	}

	private static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/examples/S06SpringORMDemo/springconfig.xml");

		ProductDAO prdao = (ProductDAO) ctx.getBean("productdao");

		product2 product = new product2();
		product.setId(2);
		product.setName("Laptop");
		product.setDescription("personal laptop");
		product.setPrice(10000.113);

		int result = prdao.create(product);
		System.out.println(result);
	}
}
