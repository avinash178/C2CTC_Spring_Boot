package com.springcore.autowiring;

public class User {

	private int id;                               // created field data
	private String name;
	private String location;

	public int getId() {                         // created setter and getter
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {                     
		this.location = location;
	}

	@Override
	public String toString() {                         // toString method to return field data
		return "User\nid=" + id + "\nname=" + name + "\nlocation=" + location;
	}

}
