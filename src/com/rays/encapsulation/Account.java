package com.rays.encapsulation;

public class Account {
	
	private String name;
	private String number;
	private String accounttype;
	private double balance;
	
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccounttype(){
		return accounttype;
	} 
	
	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	


}
