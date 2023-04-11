package com.example.Phase3project.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.Phase3project.entity.user;


public interface UserRepository extends CrudRepository<user, Integer> {

	
	user findByEmail(String email);

	Iterable<user> findByName(String suser);
}
