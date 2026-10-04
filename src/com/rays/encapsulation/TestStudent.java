package com.rays.encapsulation;

public class TestStudent {
	public static void main(String[] args) {

		Student a = new Student();

		a.setName("Durgesh");
		a.setRollNumber(238093);
		a.setMark(10);
		a.setCollage("IET DAVV");

		System.out.println(a.getName());
		System.out.println(a.getRollNumber());
		System.out.println(a.getMark());
		System.out.println(a.getCollage());

	}

}
