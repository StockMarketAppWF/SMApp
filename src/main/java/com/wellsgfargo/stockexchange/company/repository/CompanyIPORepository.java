package com.wellsgfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsgfargo.stockexchange.company.entity.CompanyIPO;


@Repository
public interface CompanyIPORepository extends JpaRepository<CompanyIPO, Integer> {

}
