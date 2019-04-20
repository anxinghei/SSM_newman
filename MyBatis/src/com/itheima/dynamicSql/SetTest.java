package com.itheima.dynamicSql;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class SetTest {

	public static void main(String[] args) {

		SqlSession sqlSession = MyBatisUtils.getSession();

		Customer customer = new Customer();
		customer.setId(4);
		customer.setUsername("Kath");
//		customer.setJobs("student");
//		customer.setPhone("3473156389");

		int rows = sqlSession.update("com.itheima.dynamicSql.CustomerMapper.updateCustomer", customer);
		if(rows>0)
			System.out.println("11111111");
		else {
			System.out.println("--------");
		}
		
		sqlSession.commit();
		sqlSession.close();
	}
}
