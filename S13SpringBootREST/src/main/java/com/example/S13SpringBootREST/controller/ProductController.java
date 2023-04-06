package com.example.S13SpringBootREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.S13SpringBootREST.entity.product2;
import com.example.S13SpringBootREST.repository.ProductRepository;

@RestController
@RequestMapping("/apiproducts")
public class ProductController {

	@Autowired
	private ProductRepository rp;
	
	@GetMapping
	public Iterable<product2> getProducts(){
		return rp.findAll();
	}
	
	@GetMapping("/{id}")
	public product2 getProduct(@PathVariable("id")Integer id) {
		return rp.findById(id).get();
	}
	
	@PostMapping
	public product2 create(@RequestBody product2 p) {
		return rp.save(p);
	}
	
	@PutMapping
	public product2 update(@RequestBody product2 p) {
		return rp.save(p);
	}
	
}
