package com.examples.S08SpringMVCORMDemos.dao;

import java.util.List;

import com.examples.S08SpringMVCORMDemo.entity.user2;

public interface UserDao {

	int create(user2 user);
	
	List<user2> findusers();
	
	user2 finduser(String user);
}
