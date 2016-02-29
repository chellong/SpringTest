package com.example.proxy;

public class Client {

	public static void main(String[] args) {
		
		UserManager manager = new UserManagerImplProxy(new UserManagerImpl());
		manager.addUser("1", "1");
		manager.delUser(1);
		manager.findUserById(1);
		
	}
}
