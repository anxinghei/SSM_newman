package com.itheima.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerDao customerDao=(CustomerDao)applicationContext.getBean("customerDao");
		Customer customer=customerDao.findCustomerById(1);
		System.out.println(customer);
	}
}
