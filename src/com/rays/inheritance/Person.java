package com.rays.inheritance;
import java.util.Date;


public class Person {
	protected String name;
	protected String address;
	protected Date dateofbirth;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;	
	}
	public String getAddress() {
		return address;	
	}
	
	public void setDateOfBirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public Date getDateOfBirth() {
		return dateofbirth;
		
	}
	

}
