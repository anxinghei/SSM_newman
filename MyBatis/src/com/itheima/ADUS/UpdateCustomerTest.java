package com.itheima.ADUS;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UpdateCustomerTest {

	public static void main(String[] args) throws IOException {
		// 读取配置文件
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// 通过配置文件构建 SqlSessionFactory ，创建 SqlSession
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sessionFactory.openSession();
		
		Customer customer=new Customer();
		customer.setId(4);
		customer.setUsername("rose");
		customer.setJobs("programmer");
		customer.setPhone("98726350172");
		
		int rows=session.update("com.itheima.newman.CustomerMapper.updateCustomer",customer);
		if(rows>0)
			System.out.println("2222222");
		else
			System.out.println("-------");
		
		// 提交事务
		session.commit();
		session.close();
	}
}
