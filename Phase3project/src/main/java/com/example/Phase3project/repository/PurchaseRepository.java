package com.example.Phase3project.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.Phase3project.entity.purchase;



public interface PurchaseRepository extends CrudRepository<purchase, Integer> {

	Iterable<purchase> findByCategoryAndDate(String category, String date);

	

	
}
