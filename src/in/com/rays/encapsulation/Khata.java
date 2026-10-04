package in.com.rays.encapsulation;

public class Khata {
	
	private String number;
	private String accountType;
	private double balance;
	
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getAccountType() {
		return accountType;	
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdrawal(double amount) {
		balance = balance - amount;	
	}
	public double getBalance () {
		return balance;
	}
	
	public void setBalance(double balance ) {
		this.balance = balance;
		
	}	
	

}
