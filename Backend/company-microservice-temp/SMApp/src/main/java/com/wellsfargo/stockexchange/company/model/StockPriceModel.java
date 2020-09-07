package com.wellsfargo.stockexchange.company.model;

import java.time.LocalDate;

public class StockPriceModel{

  private int id;
  
  private String companyCode;
  
  private String stockExchange;
  
  private float currentPrice;
  
  LocalDate date;
  
  String time;
  
  StockPriceModel(){}

public StockPriceModel(String companyCode, String stockExchnage, float currentPrice, LocalDate date, String time) {
	super();
	this.companyCode = companyCode;
	this.stockExchange = stockExchnage;
	this.currentPrice = currentPrice;
	this.date = date;
	this.time = time;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCompanyId() {
	return companyCode;
}

public void setCompanyId(String companyCode) {
	this.companyCode = companyCode;
}

public String getStockExchange() {
	return stockExchange;
}

public void setStockExchange(String stockExchnage) {
	this.stockExchange = stockExchnage;
}

public float getCurrentPrice() {
	return currentPrice;
}

public void setCurrentPrice(float currentPrice) {
	this.currentPrice = currentPrice;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

@Override
public String toString() {
	return "StockPrice [companyId=" + companyCode + ", stockExchange=" + stockExchange + ", currentPrice="
			+ currentPrice + ", date=" + date + ", time=" + time + "]";
}
  
  
  
  

}
