package com.placement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placement.entities.Certificate;
import com.placement.entities.College;
import com.placement.service.CertificateService;

@RestController
public class CertificateController {

	@Autowired
	private CertificateService certificateservice;
	
	@GetMapping("/certificates")                            // getting all college
	public ResponseEntity<List<Certificate>> getCertificate(){
		List<Certificate>list= certificateservice.getAllCertificate();
		if (list.size()<= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	@GetMapping("/certificates/{id}")                             //getting College by id
	public ResponseEntity<Certificate> getCertificate(@PathVariable("id") long id){
		Certificate certificate=certificateservice.getCertificateById(id);
		if (certificate == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(certificate));
	}
	
	@PostMapping("/certificates")
	public ResponseEntity<Certificate> addCertificate(@RequestBody Certificate certificate){
		Certificate c=null;
		try {
			c = this.certificateservice.addCertificate(certificate);
			System.out.println(certificate);
			return ResponseEntity.of(Optional.of(c));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}
	
	@DeleteMapping("/certificates/{certificateId}")
	public ResponseEntity<Void> deleteCertificate(@PathVariable("certificateId") long certificateId){
		
		try {
			this.certificateservice.deleteCertificate(certificateId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
		catch(Exception e)
		{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	@PutMapping("/certificates/{ceriticateId}")
	public ResponseEntity<Certificate> updateCertificate(@RequestBody Certificate certificate, @PathVariable("certificateId") long certificateId){
		try {
			this.certificateservice.updateCertificate(certificate, certificateId);
			return ResponseEntity.ok().body(certificate);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
}
