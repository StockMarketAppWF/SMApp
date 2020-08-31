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
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.stockexchange.company.entity.CompanyIPO;
import com.wellsfargo.stockexchange.company.service.CompanyIPOService;


@RestController
public class CompanyIPOController {
	
	@Autowired
	CompanyIPOService service;
	
	@GetMapping("/ipo/all")
	public List<CompanyIPO> getAllCompanyIPO()
	{
		List<CompanyIPO> ipos=service.getAllCompanyIPO();
		return ipos;
	}
	@GetMapping("/ipo/{id}")
	public Optional<CompanyIPO> getCompanyIPO(@PathVariable int id)

	{
		Optional<CompanyIPO> CompanyIPO=service.getCompanyIPO(id);
		return CompanyIPO;
	}
	
	@PostMapping("/ipo")
	public  CompanyIPO saveIPO(@RequestBody CompanyIPO c)

	{
		CompanyIPO CompanyIPO = service.saveIPO(c);
		return CompanyIPO;
	}
	
	@PutMapping("/ipo")
	public CompanyIPO updateIPO(@RequestBody CompanyIPO c)

	{
		CompanyIPO CompanyIPO = service.updateIPO(c);
		return CompanyIPO;
	}
	
	@DeleteMapping("/ipo/{id}")
	public String deleteIPO(@PathVariable int id)

	{
		Optional<CompanyIPO> c =service.getCompanyIPO(id);
		
		if(c!=null)
			{
			service.deleteIPO(id);
			return "Deleted CompanyIPO with id "+id ;
			}
		else
			return "Invalid CompanyIPO id";
	}


}
