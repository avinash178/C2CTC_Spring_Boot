package com.placement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PreRemove;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Certificate {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name="Certificate_Id")
	private long id;
	private int year;
	
	@GeneratedValue(generator = "college2")
	@GenericGenerator(name="college2",strategy="college2")
	@ManyToOne(cascade = CascadeType.ALL)						// college can many certificate in it 
	@JoinColumn(name="College_id",nullable=true)
	private College college;
	
	@GeneratedValue(generator = "student2")
	@GenericGenerator(name="student2",strategy = "student2")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_ID",nullable=true)
	private Student student;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	
	

}
