package com.wellsgfargo.stockexchange.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wellsgfargo.stockexchange.company.entity.CompanyIPO;
import com.wellsgfargo.stockexchange.company.repository.CompanyIPORepository;

public class CompanyIPOService {
	
	@Autowired
	CompanyIPORepository repo;
	
	@GetMapping("/ipo/all")
	public List<CompanyIPO> getAllCompanyIPO()
	{
		List<CompanyIPO> ipos=repo.findAll();
		return ipos;
	}
	@GetMapping("/ipo/{id}")
	public Optional<CompanyIPO> getCompanyIPO(int id)

	{
		Optional<CompanyIPO> CompanyIPO=repo.findById(id);
		return CompanyIPO;
	}
	
	@PostMapping("/ipo")
	public  CompanyIPO saveIPO(CompanyIPO c)

	{
		c.setIposId(0);
		CompanyIPO CompanyIPO = repo.save(c);
		return CompanyIPO;
	}
	
	@PutMapping("/ipo")
	public CompanyIPO updateIPO(CompanyIPO c)

	{
		CompanyIPO CompanyIPO = repo.save(c);
		return CompanyIPO;
	}
	
	@DeleteMapping("/ipo/{id}")
	public String deleteIPO(int id)

	{
		Optional<CompanyIPO> c =repo.findById(id);
		
		if(c!=null)
			{
			repo.deleteById(id);
			return "Deleted CompanyIPO with id "+id ;
			}
		else
			return "Invalid CompanyIPO id";
	}


}
