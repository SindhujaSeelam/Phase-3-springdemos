package com.examples.S08SpringMVCORMDemo.service;

import java.util.List;

import com.examples.S08SpringMVCORMDemo.Exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.entity.user2;

public interface UserService {

	int save(user2 user) throws UserAlreadyExistsException;
	
	List<user2> getusers();
}
