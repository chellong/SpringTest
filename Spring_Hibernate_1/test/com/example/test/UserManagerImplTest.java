package com.example.test;

import org.junit.Test;

import com.example.domain.User;
import com.example.manager.UserManager;
import com.example.manager.UserManagerImpl;


public class UserManagerImplTest {

	@Test
	public void testAddUser() {
		UserManager userManager = new UserManagerImpl();
		
		User user = new User();
		user.setName("����");
		
		userManager.addUser(user);
		
	}

}
