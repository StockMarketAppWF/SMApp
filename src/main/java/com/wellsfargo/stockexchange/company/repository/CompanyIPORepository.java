package com.wellsfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.stockexchange.company.entity.CompanyIPO;

public interface CompanyIPORepository extends JpaRepository<CompanyIPO, Integer> {

}
