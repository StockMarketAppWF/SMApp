package com.wellsgfargo.stockexchange.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wellsgfargo.stockexchange.company.entity.Company;
import com.wellsgfargo.stockexchange.company.repository.CompanyRepository;

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
	
	
	public  Company saveCompany(Company c)

	{
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


}
