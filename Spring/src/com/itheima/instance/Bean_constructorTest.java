package com.itheima.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean_constructorTest {

	public static void main(String[] args) {
		
		String string="com/itheima/instance/beanConstuctor.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		Bean_constructor bean_constructor=(Bean_constructor)applicationContext.getBean("bean");
		System.out.println(bean_constructor);
	}

}
