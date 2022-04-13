package com.springcore.constructor;

public class Certificate {
	private int Cid;
	private String Cname;
	private String Duration;
	public Certificate(int cid, String cname, String duration) {
		super();
		Cid = cid;
		Cname = cname;
		Duration = duration;
	}
	@Override
	public String toString() {
		return "Certificate Data \nCid=" + Cid + "\nCname=" + Cname + "\nDuration=" + Duration;
	}
	
	
	
	
	

}
