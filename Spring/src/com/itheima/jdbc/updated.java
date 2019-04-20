package com.itheima.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class updated {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/jdbc/jdbc.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		
		User user=new User();
		user.setId(7);
		user.setUsername("ÌïÆß");
		user.setPassword("1234567890");
		
		int num=userDao.updateUser(user);
		if(num>0)
			System.out.println("222222");
		else
			System.out.println("------");
	}
}
