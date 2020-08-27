package com.wellsgfargo.stockexchange.company.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="company_ipo")
public class CompanyIPO {

	
	int company_id;
	
	@Column(name="ipos_id")
	int iposId;
	
	CompanyIPO(){
		
	}

	public CompanyIPO(int company_id, int iposId) {
		super();
		this.company_id = company_id;
		this.iposId = iposId;
	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public int getIposId() {
		return iposId;
	}

	public void setIposId(int iposId) {
		this.iposId = iposId;
	}

	@Override
	public String toString() {
		return "CompanyIPO [company_id=" + company_id + ", iposId=" + iposId + "]";
	}
	
	
	
}
