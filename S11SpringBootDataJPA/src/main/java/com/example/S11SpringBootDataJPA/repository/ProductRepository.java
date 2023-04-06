package com.example.S11SpringBootDataJPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.S11SpringBootDataJPA.entity.product2;

public interface ProductRepository extends CrudRepository<product2, Integer> {

	List<product2>findByName(String name);
}
