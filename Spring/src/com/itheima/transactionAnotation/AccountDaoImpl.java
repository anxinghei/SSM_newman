package com.itheima.transactionAnotation;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.transactionAnotation.Account;


public class AccountDaoImpl implements AccountDao{

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int addAccount(Account account) {
		String sql="insert into account(username,balance) value(?,?)";
		Object[] objects=new Object[] {
				account.getUsername(),
				account.getBalance()
		};
		int num=this.jdbcTemplate.update(sql,objects);
		return num;
	}

	@Override
	public int updateAccount(Account account) {
		String sql="update account set username=?,balance=? where id=?";
		Object[] objects=new Object[] {
				account.getUsername(),
				account.getBalance(),
				account.getId()
		};
		int num=this.jdbcTemplate.update(sql,objects);
		return num;
	}

	@Override
	public int deleteAccount(int id) {
		String sql="delete from account where id=?";
		int num=this.jdbcTemplate.update(sql,id);
		return num;
	}

	@Override
	public Account findAccount(int id) {
		String sql="select * from account where id=?";
		BeanPropertyRowMapper<Account> rowMapper=new BeanPropertyRowMapper<Account>(Account.class);
		
		return this.jdbcTemplate.queryForObject(sql, rowMapper,id);
	}

	@Override
	public List<Account> findAllAccount() {
		String sql="select * from account";
		BeanPropertyRowMapper<Account> rowMapper=new BeanPropertyRowMapper<Account>(Account.class);
		
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT,readOnly=false,rollbackFor= {ArithmeticException.class})
	public void transfer(String out, String in, int money) {
		this.jdbcTemplate.update("update account set balance=balance+? where username=?",money,in);
		int a=1/0;
		this.jdbcTemplate.update("update account set balance=balance-? where username=?",money,out);
	}
}
