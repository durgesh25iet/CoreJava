package com.rays.encapsulation;

public class TestKhata {
	public static void main(String []args) {
		
		Khata a = new Khata();
		a.setAccountType("savingAcc");
		a.setNumber("abc123");
	
		a.setBalance(4000);
		a.deposit(7000);
		System.out.println(a.getAccountType());
		System.out.println(a.getNumber());
		System.out.println(a.getBalance());
		
		
	}

}
