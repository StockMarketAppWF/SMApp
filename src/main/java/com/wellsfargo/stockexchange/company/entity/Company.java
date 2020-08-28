package com.wellsfargo.stockexchange.company.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Company")
public class Company {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="ceo")
	String ceo;
	
	@Column(name="sector_id")
    String sectorId;
	
	@Column(name="brief")
	String brief;
	
	@Column(name="code")
	String code;
	
	@Column(name="contant_id")
	int contant_id;
	
	@Column(name="stock_exchange_id")
	int stockExchangeId;
	
	Company(){}

	public Company(int id, String name, String ceo, String sectorId, String brief, String code, int contant_id,
			int stockExchangeId) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.sectorId = sectorId;
		this.brief = brief;
		this.code = code;
		this.contant_id = contant_id;
		this.stockExchangeId = stockExchangeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getContant_id() {
		return contant_id;
	}

	public void setContant_id(int contant_id) {
		this.contant_id = contant_id;
	}

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", ceo=" + ceo + ", sectorId=" + sectorId + ", brief=" + brief
				+ ", code=" + code + ", contant_id=" + contant_id + ", stockExchangeId=" + stockExchangeId + "]";
	}
	
	


}

