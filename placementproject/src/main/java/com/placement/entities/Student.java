package com.placement.entities;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Check;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.type.TrueFalseType;

@Entity
public class Student  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name="Student_Id")
	private long id;
	private String name;
	private long roll;
	private String qualification;
	private String course;
	private int year;
	private long hallTicketNo;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="College_ID",nullable=true)
	private College college;
	
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)        // cascade all 
	@JoinColumn(name="Certificate_Id",nullable=true)
	private Certificate certificate;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public long getHallTicketNo() {
		return hallTicketNo;
	}
	public void setHallTicketNo(long hallTicketNo) {
		this.hallTicketNo = hallTicketNo;
	}
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	public Student(long id, String name, long roll, String qualification, String course, int year, long hallTicketNo,
			College college, Certificate certificate) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.qualification = qualification;
		this.course = course;
		this.year = year;
		this.hallTicketNo = hallTicketNo;
		this.college = college;
		this.certificate = certificate;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
				+ ", course=" + course + ", year=" + year + ", hallTicketNo=" + hallTicketNo + ", college=" + college
				+ ", certificate=" + certificate + "]";
	}
	
	
	
	
	
	
	
	

}
