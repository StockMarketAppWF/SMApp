package com.wellsfargo.stockexchange.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.stockexchange.company.entity.Company;
import com.wellsfargo.stockexchange.company.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository repo;

	public List<Company> getAllCompany()
	{
		List<Company> companies=repo.findAll();
		return companies;
	}

	public Optional<Company> getCompany(int id)

	{
		Optional<Company> company=repo.findById(id);
		return company;
	}
	
	public List<Company> getCompanyBySector(String sectorId) {
		
		List<Company> companies = repo.findBySectorId(sectorId);
		return companies;
	}
	
	
	public  Company saveCompany(Company c)

	{
		c.setId(0);
		Company company = repo.save(c);
		return company;
	}
	
	
	public Company updateCompany(Company c)

	{
		Company company = repo.save(c);
		return company;
	}
	

	public void deleteCompany(int id)

	{
		
			repo.deleteById(id);
	}

	public List<Company> getCompanyByStock(int stockId) {
		
		List<Company> companies = repo.findByStockExchangeId(stockId);
		return companies;
		
	}

	


}
