package com.rays.inheritance;

public class LibraryTest {
	public static void main(String []args) {
		
		Library l = new Library(123, "Man Search for meaning", "Victor Frankl", true);
		
		System.out.println(l.getBookID());
		System.out.println(l.getTitle());
		System.out.println(l.getAuthor());
		System.out.println(l.getAvailability());
		
		int sum = l.sum(5, 10);
		System.out.println(sum);
		
		int sum2 = l.sum(1, 2);
		System.out.println(sum2);
		
		int sum3 = l.sum(5,6);
		System.out.println(sum3);
		
		int multi = l.multiply(5, 5, 1);
		System.out.println(multi);
		
		Library d = new Library();
//		System.out.println(d.getLocation());
		
		
	}

}
