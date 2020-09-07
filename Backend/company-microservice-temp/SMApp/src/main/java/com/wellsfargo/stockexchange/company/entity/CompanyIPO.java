package com.wellsfargo.stockexchange.company.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ipo")
public class CompanyIPO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ipos_id")
	int iposId;
	
	@Column(name="company_id")
	int companyId;

	@Column(name = "stock_exchange")
	String stockExchange;

	@Column(name = "price")
	float price;

	@Column(name = "number_of_shares")
	int numberOfShares;

	@Column(name = "open_date_time")
	Date openDate;

	@Column(name = "remarks")
	String remarks;
	
	
	CompanyIPO() {

	}

	public CompanyIPO(int iposId, int companyId, String stockExchange, float price, int numberOfShares, Date openDate,
			String remarks) {
		super();
		this.iposId = iposId;
		this.companyId = companyId;
		this.stockExchange = stockExchange;
		this.price = price;
		this.numberOfShares = numberOfShares;
		this.openDate = openDate;
		this.remarks = remarks;
	}



	public int getIposId() {
		return iposId;
	}

	public void setIposId(int iposId) {
		this.iposId = iposId;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@Override
	public String toString() {
		return "CompanyIPO [iposId=" + iposId + ", companyId=" + companyId + ", stockExchange=" + stockExchange
				+ ", price=" + price + ", numberOfShares=" + numberOfShares + ", openDate=" + openDate + ", remarks="
				+ remarks + "]";
	}
	
	
	
	

	

}
