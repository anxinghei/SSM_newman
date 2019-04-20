package com.itheima.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class deleted {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/jdbc/jdbc.xml");
		UserDao userDao=(UserDao)applicationContext.getBean("userDao");
		
		int num=userDao.deleteUser(3);
		if(num>0)
			System.out.println("3333333");
		else
			System.out.println("------");
	}
}
