package com.springcore.lifecycle;

public class Car {
	private String cname;
	private String cmodel;
	private long price;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmodel() {
		return cmodel;
	}
	public void setCmodel(String cmodel) {
		this.cmodel = cmodel;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Car(String cname, String cmodel, long price) {
		super();
		System.out.println("constructor calling");
		this.cname = cname;
		this.cmodel = cmodel;
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("Initializing values");
	}
	public void destroy() {
		System.out.println("destroying object");
	}
	@Override
	public String toString() {
		return "Car [cname=" + cname + ", cmodel=" + cmodel + ", price=" + price + "]";
	}
	
	

}
