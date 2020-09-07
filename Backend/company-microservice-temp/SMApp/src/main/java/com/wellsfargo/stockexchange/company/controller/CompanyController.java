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
import com.wellsfargo.stockexchange.company.entity.CompanyIPO;
import com.wellsfargo.stockexchange.company.entity.StockPrice;
import com.wellsfargo.stockexchange.company.model.CompanyList;
import com.wellsfargo.stockexchange.company.service.CompanyIPOService;
import com.wellsfargo.stockexchange.company.service.CompanyService;
import com.wellsfargo.stockexchange.company.service.StockPriceService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	CompanyService service;
	
	@Autowired
	CompanyIPOService ipoService;
	
	@Autowired
	StockPriceService stockPriceService;
	
	@GetMapping("/all")
	public List<Company> getAllCompany()
	{
		List<Company> companies=service.getAllCompany();
		return companies;
	}
	@GetMapping("/{id}")
	public Optional<Company> getCompany(@PathVariable int id)

	{
		Optional<Company> company=service.getCompany(id);
		return company;
	}
	
	//----------------------------------------------------------------------------------
	
	//MICROSERVICE API CONSUMED BY SECTOR 
	
	@GetMapping("/sector/{sectorId}")
	public CompanyList getCompanyBySectorId(@PathVariable String sectorId)

	{
		List<Company> companies=service.getCompanyBySector(sectorId);
		
		CompanyList list =new CompanyList();
		list.setCompanyList(companies);
		return list;
	}
	
	//---------------------------------------------------------------------------------------
	
	//MICROSERVICE API CONSUMED BY STOCK
	
	@GetMapping("/stock/{stockId}")
	public CompanyList getCompanyByStockId(@PathVariable int stockId)

	{
		List<Company> companies=service.getCompanyByStock(stockId);
		
		CompanyList list =new CompanyList();
		list.setCompanyList(companies);
		return list;
	}
	
	//--------------------------------------------------------------------------------------------
	
	@PostMapping
	public  Company saveCompany(@RequestBody Company c)

	{
		Company company = service.saveCompany(c);
		return company;
	}
	
	@PutMapping
	public Company updateCompany(@RequestBody Company c)

	{
		Company company = service.updateCompany(c);
		return company;
	}
	
	@DeleteMapping("/{id}")
	public String deleteCompany(@PathVariable int id)

	{
		Optional<Company> c =service.getCompany(id);
		
		if(c!=null)
			{
			service.deleteCompany(id);
			return "Deleted company with id "+id ;
			}
		else
			return "Invalid company id";
	}
	
	//--------------------------------------------------
	
	//API to list all the IPOs by company id

	@GetMapping("/ipo/{companyId}")
	public List<CompanyIPO> getIPOByCompanyCode(@PathVariable int companyId)
	{
		List<CompanyIPO> ipos = ipoService.getIPOByCompanyId(companyId);
		return ipos;
	}
	
	//-----------------------------------------------------
	
	//API to list all stock prices by company code
	
	@GetMapping("/stockprice/{companyCode}")
	public List<StockPrice> getStockPriceByCompanyCode(@PathVariable String companyCode)
	{
		List<StockPrice> prices = stockPriceService.getStockPriceByCompanyCode(companyCode);
		return prices;
	}
	
	

}
