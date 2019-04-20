package com.itheima.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aspectJXmlTest {

	public static void main(String[] args) {
		String string="com/itheima/aspectJ/aspectJXml.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		User user=(User)applicationContext.getBean("user");
		user.addUser();
	}
}
