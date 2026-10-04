package com.rays.constructor;

public class TestAccount {
	public static void main(String []args) {
		
//		Account a = new Account("IDFC", 123, 555);
		Account a = new Account();
		
		a.setAcName("IDFC");
		a.setAcNo(123);
		a.setPhone(555);
		
		System.out.println(a.getAcName());
		System.out.println(a.getAcNo());
		System.out.println(a.getPhoneNo());
		

		System.out.print(a.sum(4, 50));
		
	}
	
	
	
	
	

	
}
