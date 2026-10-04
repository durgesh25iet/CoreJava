package com.rays.exercise;

public class Student extends Person{
	
	private int mark;
	
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public int getMark() {
		return mark;
	}
	
	public String Sleep(String sleep) {
		return sleep;	
	}
	
	public String Study(String study) {
		return study;
	}
	
	
	public boolean pokemon(boolean pokemon) {
		return pokemon;
	}
	
	
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public void sum() {
		int sum = 5 + 5;
		System.out.println(sum);
	}
	
	public void iff() {
		for(int i = 0; i<=10; i++) {
		System.out.println(i);
			
		}
	}
	
	public int iff2(int a) {
		for (int i = 0; i<=10; i++) {
			 System.out.println(a*i);
		}
		return a;
		
	}
	
//	Student(int mark){
//		this.mark=mark;
//		
//	}
	

	
}
