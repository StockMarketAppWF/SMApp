
package com.wellsfargo.stockexchange.market.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Exchange")
public class Exchange {
	
    @Id
    @Column(name = "exchange_id")
    private int exchangeId;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String brief;
    @Column(name="remarks")
    private String remarks;
    
    public Exchange() {
		super();
	}

	@OneToMany(mappedBy = "exchange", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<StockPrice> stockPrices;
  
   
    public List<StockPrice> getStockPrices() {
		return stockPrices;
	}

	public void setStockPrices(List<StockPrice> stockPrices) {
		this.stockPrices = stockPrices;
	}

	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "company_exchanges",
            joinColumns = { @JoinColumn(name = "exchange_id") },
            inverseJoinColumns = { @JoinColumn(name = "company_id") })
    private List<Company> company = new ArrayList<Company>();
    

	public Exchange(int exchangeId, String address, String brief, String remarks) {
		super();
		this.exchangeId = exchangeId;
		this.address = address;
		this.brief = brief;
		this.remarks = remarks;
	}

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public int getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(int exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
