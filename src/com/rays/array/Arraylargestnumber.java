package com.rays.array;

public class Arraylargestnumber {
	public static void main(String []args) {
		
		int a[] = {11, 12, 13, 14, 15};
		
		int large = 0;
		
		for(int i = 0; i<a.length; i++) {
			
			if(a[i]>large) {
				large = a[i];
			}
			
			
		}
		System.out.println(large);
	}

}
