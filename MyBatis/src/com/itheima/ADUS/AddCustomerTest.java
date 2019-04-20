package com.itheima.ADUS;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class AddCustomerTest {

	public static void main(String[] args) throws IOException {
		// ��ȡ�����ļ�
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// ͨ�������ļ����� SqlSessionFactory ������ SqlSession
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sessionFactory.openSession();
		
		Customer customer=new Customer();
		customer.setUsername("rose");
		customer.setJobs("student");
		customer.setPhone("12423468840");
		
		int rows=session.insert("com.itheima.newman.CustomerMapper.addCustomer",customer);
		if(rows>0)
			System.out.println("1111111");
		else
			System.out.println("-------");
		
		// �ύ����
		session.commit();
		session.close();
	}
}
