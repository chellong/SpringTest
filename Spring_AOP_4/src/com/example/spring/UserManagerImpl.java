package com.example.spring;

public class UserManagerImpl /*implements UserManager*/ {

	public void addUser(String username, String password) {
		System.out.println("---------UserManagerImpl.add()--------");
	}

	public void delUser(int userId) {
		System.out.println("---------UserManagerImpl.delUser()--------");
	}

	public String findUserById(int userId) {
		System.out.println("---------UserManagerImpl.findUserById()--------");
		return "уехЩ";
	}

	public void modifyUser(int userId, String username, String password) {
		System.out.println("---------UserManagerImpl.modifyUser()--------");
	}
}
