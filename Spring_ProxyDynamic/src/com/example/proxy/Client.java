package com.example.proxy;

/**
 * OCP
 * ����չ���Ŷ��޸Ĺر�
 * @author ���ɵĺ���
 *
 */
public class Client {

	public static void main(String[] args) {
		SecurityHandler hander = new SecurityHandler();
		/**
		 * ����ʵ��interface
		 */
		UserManager useraManager = (UserManager)hander.createProxyInstance(new UserManagerImpl());
		useraManager.addUser("����", "123");
	}

}