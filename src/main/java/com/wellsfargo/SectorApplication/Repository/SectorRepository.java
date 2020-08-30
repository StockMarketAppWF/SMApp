package com.wellsfargo.SectorApplication.Repository;

import org.springframework.data.repository.CrudRepository;

import com.wellsfargo.SectorApplication.Entity.Sector;

public interface SectorRepository extends CrudRepository<Sector, String> {
}
