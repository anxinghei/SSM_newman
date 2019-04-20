package com.itheima.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class findOne {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/jdbc/jdbc.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		
		User user=userDao.findUser(1);
		System.out.println(user);
	}
}
