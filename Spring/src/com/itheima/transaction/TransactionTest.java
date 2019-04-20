package com.itheima.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/itheima/transaction/transaction.xml");
		AccountDao accountDao=(AccountDao)applicationContext.getBean("accountDao");
		accountDao.transfer("ÌïÆß", "ÖÐµÄ", 2345);
		System.out.println("1111111");
	}
}
