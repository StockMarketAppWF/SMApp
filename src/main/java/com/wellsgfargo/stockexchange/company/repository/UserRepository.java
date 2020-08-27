package com.wellsgfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsgfargo.stockexchange.company.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(final String email);

}
