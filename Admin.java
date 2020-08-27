package com.Java.StockApplication;

import org.springframework.stereotype.Component;

@Component
public class Admin{
	private String username,password;
	public void setCreds(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String toString() {
		return "its working";
	}
}

