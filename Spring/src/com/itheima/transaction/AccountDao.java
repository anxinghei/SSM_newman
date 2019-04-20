package com.itheima.transaction;

import java.util.List;

import com.itheima.transactionAnotation.Account;

public interface AccountDao {

	public int addAccount(Account account);

	public int updateAccount(Account account);

	public int deleteAccount(int id);

	public Account findAccount(int id);

	public List<Account> findAllAccount();
	
	public void transfer(String out,String in,int money);
}
