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

import com.placement.entities.Student;
import com.placement.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")                            // getting all student
	public ResponseEntity<List<Student>> getStudents(){
		List<Student>list= studentService.getAllStudents();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("/students/{id}")                             //getting Student by id
	public ResponseEntity<Student> getStudent(@PathVariable("id") long id){
		Student student=studentService.getStudentById(id);
		if (student == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
		return ResponseEntity.of(Optional.of(student));
	}
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student s=null;
		try {
			s = this.studentService.addStudent(student);
			System.out.println(student);
			return ResponseEntity.of(Optional.of(s));
			
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}
	
	@DeleteMapping("/students/{studentId}")
	public ResponseEntity<Void> deleteStudent(@PathVariable("studentId") long studentId){
		
		try {
			this.studentService.deleteStudent(studentId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			}
		catch(Exception e)
		{
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
	}
	
	@PutMapping("/students/{studentId}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("studentId") long studentId){
		try {
			this.studentService.updateStudent(student, studentId);
			return ResponseEntity.ok().body(student);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	
	
	
	

}
