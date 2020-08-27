package com.Java.StockApplication;

import org.springframework.stereotype.Component;

@Component
public class Security {
	private boolean logged=false;
	public void checkCreds(Admin p)
	{
		if(p.getUsername().equals("#default") && p.getPassword().equals("#default"))
			logged=true;
		else
			System.out.println("Wrong credentials");
	}
	public boolean getLogInfo()
	{
		return logged;
	}
}
