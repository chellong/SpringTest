package com.example.usermgr.web.forms;

import org.apache.struts.action.ActionForm;

public class LoginActionForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8622849213443533059L;

	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
