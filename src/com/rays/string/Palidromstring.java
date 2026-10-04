package com.rays.string;

public class Palidromstring {
	public static void main(String []args) {
		
		String name = "kanak";
		String reverse = "";
		
		for (int i = name.length()-1; i>=0; i--) {
			reverse = reverse + name.charAt(i);
		}
		
		System.out.println("Ulta word:" + reverse);
		
		if (name.equals(reverse)) {
			System.out.println("kanak is string palidrome");
		}else {
			System.out.println("kanak is not palidrome");
		}
	}

}
