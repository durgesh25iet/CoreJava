
package com.rays.encapsulation;

public class Student {
	
	private String name ;
	private int rollNumber;
	private int mark;
	private String collage;
	
	public void setName(String book) {
		this.name = book;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;	
	}
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public void setCollage(String collage) {
		this.collage = collage;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public int getMark() {
		return mark;
	}
	
	public String getCollage() {
		return collage;
	}
	
	

}
