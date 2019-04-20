package com.itheima.Dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {

	@Override
	public Customer findCustomerById(int id) {
		
		return this.getSqlSession().selectOne("com.itheima.Dao.CustomerMapper.findCustomerById",id);
	}

}
