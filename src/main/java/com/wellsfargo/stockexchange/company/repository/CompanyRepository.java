package com.wellsfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.stockexchange.company.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {

}
