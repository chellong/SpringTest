package com.example.whyspring.client;

import com.example.whyspring.manager.UserManager;
import com.example.whyspring.manager.UserManagerImpl;

public class Client {

	public static void main(String[] args) {
		//�����ǵ�Ӧ�ó�������񣨶��󣩶�λ
		UserManager userManager = new UserManagerImpl();
		userManager.addUser("����", "123");
	}

}
