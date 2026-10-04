package in.co.rays.scanner;

import java.util.Scanner;

public class Calculatorscannerclasss {
	public static void main(String []args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		String opr = sc.next();
		int b = sc.nextInt();
		
		switch (opr) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
			break;
		default:
			System.out.println("koi operator nhi hai");
	}
		sc.close();

}
}
