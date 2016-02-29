package com.example.proxy;

public class UserManagerImplProxy implements UserManager {
	
	private UserManager userManager;
	
	public UserManagerImplProxy(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public void addUser(String username, String password) {
		checkSecurity();
		userManager.addUser(username, password);
	}

	public void delUser(int userId) {
		checkSecurity();
		userManager.delUser(userId);
	}

	public String findUserById(int userId) {
		checkSecurity();
		return userManager.findUserById(userId);
	}

	public void modifyUser(int userId, String username, String password) {
		checkSecurity();
		userManager.modifyUser(userId, username, password);
	}

	private void checkSecurity() {
		System.out.println("-------checkSecurity-------");
	}	
}
