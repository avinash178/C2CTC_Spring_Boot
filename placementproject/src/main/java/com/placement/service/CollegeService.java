package com.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.placement.entities.College;
import com.placement.entities.Student;
import com.placement.repository.CollegeRepository;

@Component
public class CollegeService {
	
	@Autowired
	private CollegeRepository crepository;
	
	//get all college
	public List<College> getAllColleges(){
		List<College> list=(List<College>) this.crepository.findAll();
		return list;
	}
	
	//get single college by id
	public College getCollegeById(long id) {
		College college=null;
		try {
			college=this.crepository.findByid(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return college;
	}
	//add college
	public College addCollege(College college) {
		College result=this.crepository.save(college);
		return result;
		
	}
	//delete college
	public void deleteCollege(long id) {
		crepository.deleteById(id);
	}
	
	//update the college
		public void updateCollege(College college, long id) {
			college.setId(id);
			crepository.save(college);
		}

}
