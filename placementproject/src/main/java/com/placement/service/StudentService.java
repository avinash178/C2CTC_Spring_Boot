package com.placement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.placement.entities.Student;
import com.placement.repository.StudentRepository;

@Component
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	//get all student
	public List<Student> getAllStudents(){
		List<Student> list= (List<Student> )this.studentRepository.findAll();
		return list;
	}
	// get single student by id
	public Student getStudentById(long id) {
		Student student=null;
		try {
			student=this.studentRepository.findById(id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return student;
		
	}
	//add student
	public Student addStudent(Student student) {
		Student result=this.studentRepository.save(student);
		return result;
		
	}
	//delete student
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
	}

	//update the student
	public void updateStudent(Student student, long id) {
		student.setId(id);
		studentRepository.save(student);
	}
}
