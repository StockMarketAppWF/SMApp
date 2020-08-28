package com.wellsfargo.stockexchange.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.stockexchange.company.entity.Company;
import com.wellsfargo.stockexchange.company.repository.CompanyRepository;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyRepository repo;
	
	@GetMapping("/all")
	public List<Company> getAllCompany(@PathVariable int id)
	{
		List<Company> companies=repo.findAll();
		return companies;
	}
	@GetMapping("/{id}")
	public Optional<Company> getCompany(@PathVariable int id)

	{
		Optional<Company> company=repo.findById(id);
		return company;
	}
	
	@PostMapping("/")
	public  Company saveEmployee(@RequestBody Company c)

	{
		Company company = repo.save(c);
		return company;
	}
	
	@PutMapping("/")
	public Company updateEmployee(@RequestBody Company c)

	{
		Company company = repo.save(c);
		return company;
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id)

	{
		Optional<Company> c =repo.findById(id);
		
		if(c!=null)
			{
			repo.deleteById(id);
			return "Deleted company with id "+id ;
			}
		else
			return "Invalid company id";
	}

}
