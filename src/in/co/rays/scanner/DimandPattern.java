package in.co.rays.scanner;

public class DimandPattern {
	public static void main(String[]args) {
		
		int n = 5;
		//Part 1: upar wali line 
		System.out.print(" ");
		for (int j = 1; j <= n - 1; j++) {
			System.out.print("* ");
		}
		System.out.println();
		
		
		
		//Part 2: neeche ulta triangle
		for (int i = 0; i<n; i++) {
			for(int s = 1; s<= i; s++) {
				System.out.print(" ");	
			}
			for(int j = 1; j<=n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}


