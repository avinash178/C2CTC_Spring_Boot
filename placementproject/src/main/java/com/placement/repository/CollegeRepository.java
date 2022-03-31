package com.placement.repository;

import org.springframework.data.repository.CrudRepository;

import com.placement.entities.College;

public interface CollegeRepository  extends CrudRepository<College, Long>{
	public College findByid(long id);

}
