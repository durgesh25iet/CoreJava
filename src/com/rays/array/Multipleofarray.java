package com.rays.array;

public class Multipleofarray {
       public static void main(String []args) {
		
		int a[] = {5 , 6 , 7 , 8 , 9 , 10};
		int mul = 1;
		int i = 0;                
		
		while (i<a.length) {
			mul = mul * a[i];
			i++;
		}
		System.out.println(mul);
	}

}
