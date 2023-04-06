package com.examples.S08SpringMVCORMDemos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.examples.S08SpringMVCORMDemo.entity.user2;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public int create(user2 user) {
int result=(int) hibernateTemplate.save(user);
return result;
}
	@Override
	public List<user2> findusers() {
		return hibernateTemplate.loadAll(user2.class);
	}
	@Override
	public user2 finduser(String email) {

		user2 result=null;
		List<?> users=hibernateTemplate.find("from user2 u where u.email=?0", email);
		if(users!=null&&users.size()>0) 
			result=(user2) users.get(0);
		return result;
			
	
	}

}
