package com.Java.StockApplication;
import java.util.*;
public class Stocks {
	static List<String> l=new ArrayList();
	public void displayStocks()
	{
		System.out.println("Available Stocks :\n"+l);
	}
	public void addStock(String s)
	{
		l.add(s);
		System.out.println("Successfully Added");
	}
}
