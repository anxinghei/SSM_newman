package com.itheima.ADUS;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DeleteCustomerTest {

	public static void main(String[] args) throws IOException {
		// ��ȡ�����ļ�
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// ͨ�������ļ����� SqlSessionFactory ������ SqlSession
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sessionFactory.openSession();
		
		int rows=session.delete("com.itheima.newman.CustomerMapper.deleteCustomer",5);
		if(rows>0)
			System.out.println("3333333");
		else
			System.out.println("-------");
		
		// �ύ����
		session.commit();
		session.close();
	}
}
