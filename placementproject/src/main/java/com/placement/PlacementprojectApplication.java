package com.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.placement.repository.CertificateRepository;
import com.placement.repository.CollegeRepository;
import com.placement.repository.StudentRepository;
import com.placement.repository.UserRepository;

@SpringBootApplication
public class PlacementprojectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PlacementprojectApplication.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		CollegeRepository collegeRepository = context.getBean(CollegeRepository.class);
		CertificateRepository certificateRepository = context.getBean(CertificateRepository.class);
		UserRepository userRepository =context.getBean(UserRepository.class);
	}

}
