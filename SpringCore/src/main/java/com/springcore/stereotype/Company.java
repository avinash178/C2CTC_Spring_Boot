package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("object1")
public class Company {
	@Value("TATA")
	private String name;
	@Value("238442214")
	private long uniqeId;
	@Value("India")
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getUniqeId() {
		return uniqeId;
	}

	public void setUniqeId(long uniqeId) {
		this.uniqeId = uniqeId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company\nname=" + name + "\nuniqeId=" + uniqeId + "\nlocation=" + location;
	}

}
