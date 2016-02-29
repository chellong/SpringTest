package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserManagerImpl manager = (UserManagerImpl) beanFactory.getBean("userManager");
		manager.delUser(1);
		manager.addUser("1", "1");
		String name = manager.findUserById(1);
		System.out.println(name);
	}

}
