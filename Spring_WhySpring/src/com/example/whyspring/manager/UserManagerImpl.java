package com.example.whyspring.manager;

import com.example.whyspring.dao.UserDao;
import com.example.whyspring.dao.UserDao4OracleImpl;

public class UserManagerImpl implements UserManager {

	public void addUser(String username, String password) {
		
		//�����ǵ�Ӧ�ó�������񣨶��󣩶�λ
		//UserDao userDao = new UserDao4MySqlImpl();
		UserDao userDao = new UserDao4OracleImpl();
		userDao.addUser(username, password);
	}

}