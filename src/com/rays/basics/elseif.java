package com.rays.basics;

public class elseif {
	public static void main(String [] args) {
		int num = 20;
		if(num % 2 == 2) {
			System.out.println("num is even=" + (num = num/2));
		}else {
			System.out.println("num is odd=" + (num = num-1));
			
		}
	}

}
