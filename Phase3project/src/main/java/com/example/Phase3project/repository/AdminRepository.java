package com.example.Phase3project.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.Phase3project.entity.admin;


public interface AdminRepository extends CrudRepository<admin, Integer> {

	admin findAllByUsername(String username);

	void save(String newpwd);

	
}
