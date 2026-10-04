package com.rays.basics;

public class armstrong {
	public static void main(String[] args) {
		int num = 1634;
		int temp = num;
		int r = 0;
		int sum = 0;

		while (num != 0) {
			r = num % 10; 
			sum = sum + r * r * r * r; 
			num = num / 10; 
		}
System.out.println(sum);
		if (sum == temp) {
			System.out.println("1634 is armstrong number");
		} else {
			System.out.println("1634 is not armstrong");
		}

	}

}
