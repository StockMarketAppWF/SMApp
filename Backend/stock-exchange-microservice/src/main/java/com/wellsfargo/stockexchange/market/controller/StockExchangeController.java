package com.wellsfargo.stockexchange.market.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.stockexchange.market.entity.Company;
import com.wellsfargo.stockexchange.market.entity.Exchange;
import com.wellsfargo.stockexchange.market.service.StockExchangeService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class StockExchangeController {
	
	@Autowired
	private StockExchangeService stockExchangeService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/stockexchange/getstockexchangelist")
	public List<Exchange> getAllStockExchange()
	{
		List<Exchange> exchanges = new ArrayList<>();
		exchanges= stockExchangeService.getAllStockExchange();
		return exchanges;
	}
	

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/stockexchange/addstockexchange")
	public Exchange addStockExchange(@RequestBody Exchange exchange)
	{
		if(exchange == null)
			System.out.println("Exchange is null");
		else {
		System.out.println(exchange);
		stockExchangeService.addStockExchange(exchange);
		}
		
		return exchange;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/stockexchange/getcompanylist/{id}")
	public List<Company> getCompaniesList(@PathVariable int id)
	{
		return stockExchangeService.getCompaniesList(id);
	}

	 
}

