package com.example.proxy;

/**
 * OCP
 * 对扩展开放对修改关闭
 * @author 北飞的候鸟
 *
 */
public class Client {

	public static void main(String[] args) {
		SecurityHandler hander = new SecurityHandler();
		/**
		 * 必须实现interface
		 */
		UserManager useraManager = (UserManager)hander.createProxyInstance(new UserManagerImpl());
		useraManager.addUser("张三", "123");
	}

}
