package com.zhaojun.spring.daoImpl;

import com.zhaojun.spring.dao.UserDao;
import com.zhaojun.spring.model.User;

public class UserDaoImpl implements UserDao{
	@Override
	public void save(User user){
		System.out.println("hello,spring");
	}

	public UserDaoImpl() {
		super();
		System.out.println("UserDaoImpl≥ı ºªØ");
	}
	
}
