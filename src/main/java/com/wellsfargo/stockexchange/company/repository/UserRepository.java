package com.wellsfargo.stockexchange.company.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.stockexchange.company.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(final String email);

}
