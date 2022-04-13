package com.springcore.autowiring;

public class Amezon {
	
	private User user;                      // reference of User class

	public User getUser() {                 // created setter and getter 
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Amezon(User user) {                 // constructor using field data
		super();
		this.user = user;
		System.out.println("constructor used");
	}

	public Amezon() {                            /// constructor from superclass
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {                          //toString method from superclass
		return "Amezon [user=" + user + "]";
	}

	
	
	

}
