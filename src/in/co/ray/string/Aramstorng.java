package in.co.ray.string;

public class Aramstorng {
	public static void main(String [] args) {
		
		int num = 153;
		
		int a = num%10; //rem=3 qutieent 15; 
		int b = (num/10)%10;
		int c = num/100;
		
		int sum = a*a*a+b*b*b+c*c*c;
		
		if (num==sum) {
			System.out.println("153 is armstrong num");
		}else {
			System.out.println("153 is not armstrong num");
		}
	}

}

