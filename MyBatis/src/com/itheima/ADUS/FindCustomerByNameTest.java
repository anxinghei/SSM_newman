package com.itheima.ADUS;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FindCustomerByNameTest {

	public static void main(String[] args) throws IOException {
		// ��ȡ�����ļ�
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// ͨ�������ļ����� SqlSessionFactory ������ SqlSession
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sessionFactory.openSession();
		// SqlSession ִ��ӳ���ļ��ж���� SQL ������ӳ����
		List<Customer> customers=session.selectList("com.itheima.newman.CustomerMapper.findCustomerByName","j");
		for(Customer customer:customers)
			System.out.println(customer);
		// �ر� SqlSession
		session.close();
	}
}
