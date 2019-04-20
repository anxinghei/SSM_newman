package com.itheima.Mapper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerMapper customerMapper=applicationContext.getBean(CustomerMapper.class);
		Customer customer=customerMapper.findCustomerById(2);
		System.out.println(customer);
	}
}
