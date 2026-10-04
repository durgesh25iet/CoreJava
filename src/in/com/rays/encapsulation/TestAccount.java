package in.com.rays.encapsulation;

public class TestAccount {
	public static void main(String []args) {
		
		Account a = new Account();
		a.setName("IDFC");
		a.setNumber("12345");
		a.setAccounttype("save");
		a.setBalance(15.5);
		
		System.out.println(a.getName());
		System.out.println(a.getNumber());
		System.out.println(a.getAccounttype());
		System.out.println(a.getBalance());
		
		
	}

}
