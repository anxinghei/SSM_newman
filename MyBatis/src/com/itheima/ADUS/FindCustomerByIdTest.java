package com.itheima.ADUS;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FindCustomerByIdTest {

	public static void main(String[] args) throws IOException {
		// ��ȡ�����ļ�
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// ͨ�������ļ����� SqlSessionFactory ������ SqlSession
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sessionFactory.openSession();
		// SqlSession ִ��ӳ���ļ��ж���� SQL ������ӳ����
		Customer customer=session.selectOne("com.itheima.newman.CustomerMapper.findCustomerById",1);
		System.out.println(customer);
		// �ر� SqlSession
		session.close();
	}
}
