package com.springcore.constructor;

public class PersonData {
	private String Name;
	private int Age;
	private String Sex;
	private String Address;
	private Certificate certi;

	public PersonData(String name, int age, String sex, String address, Certificate certi) {
		super();
		Name = name;
		Age = age;
		Sex = sex;
		Address = address;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "PersonData \nName=" + Name + "\nAge=" + Age + "\nSex=" + Sex + "\nAddress=" + Address + "\n"
				+ certi;
	}

}
