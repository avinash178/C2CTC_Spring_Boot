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

import com.placement.entities.College;
import com.placement.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	private CollegeService collegeService;
	
	@GetMapping("/colleges")                            // getting all college
	public ResponseEntity<List<College>> getColleges(){
		List<College>list= collegeService.getAllColleges();
		if (list.size()<= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("/colleges/{id}")                             //getting College by id
	public ResponseEntity<College> getCollege(@PathVariable("id") long id){
		College college=collegeService.getCollegeById(id);
		if (college == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(college));
	}
	
	@PostMapping("/colleges")
	public ResponseEntity<College> addCollege(@RequestBody College college){
		College c=null;
		try {
			c = this.collegeService.addCollege(college);
			System.out.println(college);
			return ResponseEntity.of(Optional.of(c));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}
	
	@DeleteMapping("/colleges/{collegeId}")
	public ResponseEntity<Void> deleteCollege(@PathVariable("collegeId") long collegeId){
		
		try {
			this.collegeService.deleteCollege(collegeId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
		catch(Exception e)
		{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("/colleges/{collegeId}")
	public ResponseEntity<College> updateCollege(@RequestBody College college,@PathVariable("collegeId") long collegeId){
		try {
			this.collegeService.updateCollege(college, collegeId);
			return ResponseEntity.ok().body(college);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	

	
}
