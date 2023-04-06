package com.examples.S08SpringMVCORMDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.S08SpringMVCORMDemo.Exception.UserAlreadyExistsException;
import com.examples.S08SpringMVCORMDemo.entity.user2;
import com.examples.S08SpringMVCORMDemos.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public int save(user2 user) throws UserAlreadyExistsException{
		if(userdao.finduser(user.getEmail())!=null)
			throw new UserAlreadyExistsException(user.getEmail());
		return userdao.create(user);
	}

	@Override
	public List<user2> getusers() {
		return userdao.findusers();
	}

}
