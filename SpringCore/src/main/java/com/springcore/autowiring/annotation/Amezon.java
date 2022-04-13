package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Amezon {

	// @Autowired 1.you can use here on reference variable
	private User user;

	public User getUser() {
		return user;
	}

	// @Autowired 2.you can use on setter method
	public void setUser(User user) {
		this.user = user;
	}

	@Autowired      // 3 you can use on constructor 
	public Amezon(User user) {
		super();
		this.user = user;
		System.out.println("constructor used");
	}

	public Amezon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Amezon [user=" + user + "]";
	}

}
