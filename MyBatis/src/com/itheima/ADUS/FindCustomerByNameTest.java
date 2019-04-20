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
		// 读取配置文件
		String string="com/itheima/newman/mybatis-config.xml";
		InputStream inputStream=Resources.getResourceAsStream(string);
		// 通过配置文件构建 SqlSessionFactory ，创建 SqlSession
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session=sessionFactory.openSession();
		// SqlSession 执行映射文件中定义的 SQL ，返回映射结果
		List<Customer> customers=session.selectList("com.itheima.newman.CustomerMapper.findCustomerByName","j");
		for(Customer customer:customers)
			System.out.println(customer);
		// 关闭 SqlSession
		session.close();
	}
}
