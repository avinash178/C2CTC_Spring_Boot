package com.placement.repository;

import org.springframework.data.repository.CrudRepository;

import com.placement.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	public Student findById(long id);
}
