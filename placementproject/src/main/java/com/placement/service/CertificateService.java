package com.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.placement.entities.Certificate;
import com.placement.entities.College;
import com.placement.repository.CertificateRepository;

@Component
public class CertificateService {
	
	@Autowired
	private CertificateRepository certiRepository;

	//get all certificate
		public List<Certificate> getAllCertificate(){
			List<Certificate> list=(List<Certificate>) this.certiRepository.findAll();
			return list;
		}
		
		//get single certificate by id
		public Certificate getCertificateById(long id) {
			Certificate certificate=null;
			try {
				certificate=this.certiRepository.findById(id);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return certificate;
		}
		//add certificate
		public Certificate addCertificate(Certificate certi) {
			Certificate result=this.certiRepository.save(certi);	
			return result;
		
		}
		
		//delete college
		public void deleteCertificate(long id) {
		
			certiRepository.deleteById(id);
			
		}
		//update the certificate
				public void updateCertificate(Certificate certificate, long id) {
					certificate.setId(id);
					certiRepository.save(certificate);
				}
		
		
		
	
}
