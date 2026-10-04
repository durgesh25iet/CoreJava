package com.rays.string;

public class isdrugeshstringpalidrome {
	public static void main(String [] args) {
		
		String name = "durgesh";
		String reverse = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("reverse word:"+reverse);
	
		if (name.equals(reverse)) {       //if (name==reverse) {
			System.out.println("durgesh is stringpalidorme");	
		}else {
			System.out.println("durgesh is not stringpalidrome");	
		}
		
	}

}
