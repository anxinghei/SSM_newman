package com.itheima.ADUS;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UpdateCustomerTest {

	public static void main(String[] args) throws IOException {
		// ��ȡ�����ļ�
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// ͨ�������ļ����� SqlSessionFactory ������ SqlSession
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
		
		// �ύ����
		session.commit();
		session.close();
	}
}
