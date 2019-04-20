package com.itheima.dynamicSql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class WhereTest {

	public static void main(String[] args) {

		SqlSession sqlSession = MyBatisUtils.getSession();

		Customer customer = new Customer();
		customer.setUsername("J");
//		customer.setJobs("student");

		List<Customer> customers = sqlSession
				.selectList("com.itheima.dynamicSql.CustomerMapper.findCustomerByNameAndJobsTrim", customer);
		for (Customer customer2 : customers)
			System.out.println(customer2);

		sqlSession.close();
	}
}
