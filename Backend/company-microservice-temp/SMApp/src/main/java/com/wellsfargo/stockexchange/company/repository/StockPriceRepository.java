package com.wellsfargo.stockexchange.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.stockexchange.company.entity.StockPrice;


@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice, Integer> {

	List<StockPrice> findByCompanyCode(String code);

}
