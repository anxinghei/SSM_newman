package com.itheima.dynamicSql;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class ForeachTest {

	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisUtils.getSession();
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(1);
		ids.add(4);
		ids.add(3);
		ids.add(3);		
		List<Customer> customers=sqlSession.selectList("com.itheima.dynamicSql.CustomerMapper.findCustomerById",ids);
		for(Customer customer:customers)
			System.out.println(customer);
		
		sqlSession.close();
	}
}
