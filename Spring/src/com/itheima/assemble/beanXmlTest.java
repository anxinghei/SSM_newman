package com.itheima.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanXmlTest {

	public static void main(String[] args) {
	
		String string="com/itheima/assemble/beanXml.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		System.out.println("����ע�룺"+applicationContext.getBean("user1"));
		System.out.println("��ֵע�룺"+applicationContext.getBean("user2"));
				
	}

}
