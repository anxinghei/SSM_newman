package com.itheima.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryTest {

	public static void main(String[] args) {
		String string="com/itheima/aop/ProxyFactory.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		User user=(User)applicationContext.getBean("userProxy");
		user.addUser();
	}
}
