package com.rays.exercise;

public class TestPerson {
	public static void main(String []args) {
		
		Student s = new Student();
		
		s.name= "Durgesh";
		s.age = 22;
		s.setMark(55);
		System.out.println("Name: "+s.name);
		System.out.println("Age: "+s.age);
		System.out.println("Mark:"+s.getMark());
		System.out.println("=================================================================");
		
		System.out.println(s.Study("Maths"));
		System.out.println(s.Sleep("Aadhi raat ko"));
		System.out.println("+++");
		s.pokemon(false);
		System.out.println(s.pokemon(true));
		System.out.println(s.sum(5, 8));
		s.sum();
		s.iff();
		s.iff2(4);
		
		
		
		
		
	}

}
