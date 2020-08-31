package com.wellsfargo.stockexchange.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.stockexchange.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(final String email);
	
	User findByRole(final String role);

}
