package com.demo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginForm {
	
	@NotEmpty
	@Size(min = 4, max = 12)
	private String username;
	
	@NotEmpty
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
