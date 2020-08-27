package com.wellsgfargo.stockexchange.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsgfargo.stockexchange.company.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(final String role);

}
