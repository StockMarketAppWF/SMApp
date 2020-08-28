package com.wellsfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.stockexchange.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
