package com.springcore.reference;

public class Company {

	
	private String name;
	private String type;
	private int marketPrice;
	private Employee emp; // reference of employee class
	// company class depend on employee class

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

//	public Company() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public String toString() {
		return "Company name=" + name + "\ntype=" + type + "\nmarketPrice=" + marketPrice + "\nemp=" + emp;
	}

}
