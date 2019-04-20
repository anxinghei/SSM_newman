package com.itheima.newman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	public static void main(String[] args) {
		// 初始化容器，加载配置文件
		String string = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(string);
		// 获取实例，并调用方法
		UserService userService=(UserService)applicationContext.getBean("UserService");
		userService.say();
	}

}
