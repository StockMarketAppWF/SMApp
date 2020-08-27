package com.wellsgfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsgfargo.stockexchange.company.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
