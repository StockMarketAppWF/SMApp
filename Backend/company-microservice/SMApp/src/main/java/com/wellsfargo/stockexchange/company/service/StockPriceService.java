package com.wellsfargo.stockexchange.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.stockexchange.company.entity.StockPrice;
import com.wellsfargo.stockexchange.company.repository.StockPriceRepository;

@Service
public class StockPriceService {

	
	@Autowired
	StockPriceRepository repo;
	
	
	public List<StockPrice> getAllPrice() {
		
		List<StockPrice> prices =repo.findAll();
		return prices;
		
	}

	public Optional<StockPrice> getStockPrice(int id) {
		
	   Optional<StockPrice> price = repo.findById(id);
	   return price;
		
	}

	public StockPrice saveStockPrice(StockPrice p) {
		
		StockPrice price = repo.save(p);
		return price;
		
	}
	
	//--------------------------------------------------------------------------------
	
	//This API will be used by CompanyController for listing all prices for a company 
	
	public List<StockPrice> getStockPriceByCompanyCode(String code)
	{
		List<StockPrice> prices = repo.findByCompanyCode(code);
		return prices;
	}

}
