package com.example.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring.manager.UserManager;

/**
 * DI����ע�� 
 * @author ���ɵĺ���
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		//BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		UserManager manager = (UserManager) factory.getBean("userManager");
		manager.addUser("1", "1");
	}

}
