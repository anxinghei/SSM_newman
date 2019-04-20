package com.itheima.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanAnotationTest {

	public static void main(String[] args) {
		
		String string="com/itheima/assemble/beanAnotation.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		
		beanAnotationController controller=(beanAnotationController)applicationContext.getBean("beanAnotationController");
		controller.save();
	}

}
