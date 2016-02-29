package com.example.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.domain.User;
import com.example.manager.UserManager;


public class UserManagerImplTest {

	@Test
	public void testAddUser() {
		
		String[] configLocations = new String[]{"applicationContext-common.xml",
				"applicationContext-beans.xml"};
		BeanFactory factory = new ClassPathXmlApplicationContext(configLocations);
		UserManager userManager = (UserManager)factory.getBean("userManager");
		
		User user1 = new User();
		user1.setName("����");
		
		User user2 = new User();
		user2.setName("����");
		try {
			userManager.addUser(user1);
			userManager.addUser(user2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
