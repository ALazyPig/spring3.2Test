package com.zhaojun.spring.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.zhaojun.spring.model.User;

@ContextConfiguration("classpath:beans.xml")
public class UserDaoTest extends AbstractJUnit4SpringContextTests{
	
	private UserDao userDao;

	@Test
	public void userDaoTest() {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		userDao.save(new User());
	}

	@Test
	public void userDaoTest1() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = (UserDao) context.getBean("userDao");
		userDao.save(new User());
		this.userDaoTest();
	}

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource(name = "userDao")
	public void setUserDao(UserDao userDao) {
		System.out.println("×¢Èëµ½userDaoÖÐ");
		this.userDao = userDao;
	}

}
