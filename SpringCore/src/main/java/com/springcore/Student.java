package com.springcore;

public class Student {
	
	private int studentId;                       // created field variables
	private String studentName;
	private String location;

	public int getStudentnId() {             // creating setter and getter
		return studentId;
	}

	public void setStudentId(int studetnId) {
		this.studentId = studetnId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student(int studentId, String studentName, String location) {            // constructor of using field
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.location = location;
	}

	public Student() {                          //constructor from superclass
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {                         // toString method to return field data
		return "Sid   : " + studentId + "\n" + "Sname : " + studentName + "\n" + "Scity : " + location;
	}

}
