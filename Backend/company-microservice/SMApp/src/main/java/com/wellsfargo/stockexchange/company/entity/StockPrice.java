package com.wellsfargo.stockexchange.company.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stock_price_table")
public class StockPrice {
	
	  @Id
	  private int id;
	  
	  @Column(name="stock_exchange")
	  private String stockExchange;
	  
	  @Column(name="companyCode")
	  private String companyCode;
	  
	  @Column(name ="current_price")
	  private float currentPrice;
	  
	  @Column(name="date")
	  private LocalDate date;
	  
	  @Column(name="time")
	  private String time;
	  
	  
	  StockPrice(){}
	public StockPrice(int id, String stockExchange, String companyCode, float currentPrice, LocalDate date, String time) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
		this.companyCode = companyCode;
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

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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
		return "StockPrice [id=" + id + ", stockExchange=" + stockExchange + ", companyCode=" + companyCode
				+ ", currentPrice=" + currentPrice + ", date=" + date + ", time=" + time + "]";
	}

	
	  
	  

	
	  
	  

}
