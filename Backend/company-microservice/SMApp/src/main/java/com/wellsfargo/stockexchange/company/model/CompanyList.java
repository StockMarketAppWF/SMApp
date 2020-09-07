package com.wellsfargo.stockexchange.company.model;

import java.io.Serializable;
import java.util.List;

import com.wellsfargo.stockexchange.company.entity.Company;

public class CompanyList implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Company> companyList;
	
	public CompanyList(){
		
	}

	public CompanyList(List<Company> companyList) {
		super();
		this.companyList = companyList;
	}



	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

	@Override
	public String toString() {
		return "CompanyList [companyList=" + companyList + "]";
	}
	
	
	

}
