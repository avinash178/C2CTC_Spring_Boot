package com.placement.repository;

import org.springframework.data.repository.CrudRepository;

import com.placement.entities.Certificate;

public interface CertificateRepository extends CrudRepository<Certificate, Long> {
	
	public Certificate findById(long id);
	

}
