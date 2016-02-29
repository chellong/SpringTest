package com.example.spring.manager;

import com.example.spring.dao.UserDao;

public class UserManagerImpl implements UserManager{

	private UserDao dao;
	
	public UserManagerImpl() {
	}
	
	public UserManagerImpl(UserDao dao) {
		this.dao = dao;
	}
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void addUser(String username, String userpwd) {
		
		/**
		 * 服务(对象)定位
		 * 由自己负责
		 */
		dao.addUser(username, userpwd);
	}

}
