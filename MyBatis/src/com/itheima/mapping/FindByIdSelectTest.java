package com.itheima.mapping;

import org.apache.ibatis.session.SqlSession;

public class FindByIdSelectTest {

	public static void main(String[] args) {
		SqlSession session=MyBatisUtils.getSession();
		
		Person person=session.selectOne("com.itheima.mapping.PersonMapper.findPersonById",1);
		System.out.println(person);
		
		session.close();
	}
}
