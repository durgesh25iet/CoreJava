package com.rays.inheritance;

public class Student extends Person{
	
	private String rollNO;
	private int marks;
	
	public void setRollNO (String rollNO) {
		this.rollNO = rollNO;	
	}
	public String getRollNO() {
		return rollNO;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	
	

}
