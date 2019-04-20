package com.itheima.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class findAll {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/jdbc/jdbc.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		
		List<User> users=userDao.findAllUser();
		for(User user:users)
			System.out.println(user);
	}
}
