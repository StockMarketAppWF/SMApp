package com.Java.StockApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Admin a=(Admin)context.getBean("admin");
    	a.setCreds("#default", "#default");
    	Security s=(Security)context.getBean("security");
    	s.checkCreds(a);
    	if(s.getLogInfo())
    	{
    		System.out.println("Admin logged in");
    	}
    	else
    	{
    		System.out.println("Error");
    	}
    }
}
