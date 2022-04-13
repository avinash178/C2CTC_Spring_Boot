package com.springcore.reference;

public class Employee {

	private String name;
	private String department;
	private long salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	@Override
	public String toString() {
		return "Employee name=" + name + "\ndepartment=" + department + "\nsalary=" + salary ;
	}
	
	
	
}
