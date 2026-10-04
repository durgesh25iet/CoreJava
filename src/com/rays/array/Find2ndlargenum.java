package com.rays.array;

public class Find2ndlargenum {
        public static void main(String []args) {
		
		int a[] = {11, 15, 14, 12, 13};
		
		int largest = 0;
		int seclarge = 0;
		
		for(int i=1; i<a.length; i++ ) {
			
			if (a[i]>largest) {
				seclarge = largest;
				largest = a[i];
			}else if(a[i]>seclarge) {
				seclarge = a[i];
			}
			
		}
		System.out.println("largest="+largest);
		System.out.println("2nd Largest="+ seclarge);
		
	}


}
