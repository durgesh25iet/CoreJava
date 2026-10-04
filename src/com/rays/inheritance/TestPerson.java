package com.rays.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson{
	
	public static void main(String []args) throws ParseException{
		
		Doctor d = new Doctor();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		
		d.setName("Durgesh");
		d.setDateOfBirth(sdf.parse("25-10-2004"));
		d.setAddress("Indore");
		d.setRegistrationNO("D121212");
		
		System.out.println(d.getName());
		System.out.println(d.getRegistrationNO());
		System.out.println(d.getAddress());
		System.out.println(sdf.format(d.getDateOfBirth()));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Student s = new Student ();
		
		s.setName("Mohit");
		s.setRollNO("17");
		s.setMarks(10);
		s.setAddress("Rewa Park");
		s.setDateOfBirth(sdf.parse("12-12-2006"));
		
		System.out.println(s.getName());
		System.out.println(s.getRollNO());
		System.out.println(s.getMarks());
		System.out.println(s.getAddress());
		System.out.println(sdf.format(s.getDateOfBirth()));
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Businessman b = new Businessman();
		
		b.setName("Arihant");
		b.setAddress("Rewa park");
		b.setDateOfBirth(sdf.parse("01-03-2005"));
		b.setIncome(100000.00);
		
		System.out.println(b.getName());
		System.out.println(b.getAddress());
		System.out.println(sdf.format(b.getDateOfBirth()));
		System.out.println(b.getIncome());
			
		
	}

}
