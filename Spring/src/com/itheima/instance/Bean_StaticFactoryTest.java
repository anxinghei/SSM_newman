package com.itheima.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_StaticFactoryTest {

	public static void main(String[] args) {
		
		String string="com/itheima/instance/beanFactory.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		System.out.println(applicationContext.getBean("bean"));
	}

}
