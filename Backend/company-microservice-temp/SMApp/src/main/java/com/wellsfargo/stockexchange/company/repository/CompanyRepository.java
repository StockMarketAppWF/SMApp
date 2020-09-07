package com.wellsfargo.stockexchange.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.stockexchange.company.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
	
	public List<Company> findBySectorId(String sectorId);

	public List<Company> findByStockExchangeId(int stockId);

}
