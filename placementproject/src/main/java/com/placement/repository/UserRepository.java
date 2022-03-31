package com.placement.repository;

import org.springframework.data.repository.CrudRepository;

import com.placement.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findById(long id);

}
