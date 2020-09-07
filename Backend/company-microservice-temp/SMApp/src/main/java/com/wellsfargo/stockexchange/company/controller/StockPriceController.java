package com.wellsfargo.stockexchange.company.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellsfargo.stockexchange.company.entity.StockPrice;
import com.wellsfargo.stockexchange.company.service.StockPriceService;


@RestController
@RequestMapping("/stockprice")
public class StockPriceController {
	
	@Autowired
	StockPriceService service;
	
	@GetMapping("/all")
	public List<StockPrice> getAllPrice()
	{
		List <StockPrice> prices =service.getAllPrice();
		return prices;
	}
	@GetMapping("/{id}")
	public Optional<StockPrice> getStockPrice(@PathVariable int id)

	{
		Optional<StockPrice> stockPrice =service.getStockPrice(id);
		return stockPrice;
	}
	
	@PostMapping
	public  StockPrice saveStockPrice(@RequestBody StockPrice c)

	{
		StockPrice stockPrice = service.saveStockPrice(c);
		return stockPrice;
	}
	


}
