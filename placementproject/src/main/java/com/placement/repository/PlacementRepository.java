package com.placement.repository;

import org.springframework.data.repository.CrudRepository;

import com.placement.entities.Placement;

public interface PlacementRepository extends CrudRepository<Placement, Long>{
	
	public Placement findById(long id);

}
