package com.itheima.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class added {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/jdbc/jdbc.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		
		User user=new User();
		user.setUsername("ÌïÆß");
		user.setPassword("985725904");
		
		int num=userDao.addUser(user);
		if(num>0)
			System.out.println("1111111");
		else
			System.out.println("------");
	}
}
