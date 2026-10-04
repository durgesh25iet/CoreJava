package in.com.rays.constructor;

public class Account {
	private String acName;
	private int acNo;
	private int phoneNo;
	
//	public Account(String acName, int acNo, int phoneNo) {
//		this.acName = acName;
//		this.acNo = acNo;
//		this.phoneNo = phoneNo;		
//	}
	
	public void setAcName(String acName) {
		this.acName = acName;
	}
	
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public void setPhone(int phoneNO) {
		this.phoneNo = phoneNO;
	}
	
	public String getAcName() {
		return acName;
	}
	public int getAcNo() {
		return acNo;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	
		
	}
	

}
