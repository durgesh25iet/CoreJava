package com.rays.string;

public class Calculator {
	public static void main(String []args) {
		
        String opr = "*";
        
        int a = 15;
        int b = 5;
		
		switch (opr) {
		case "+":
			System.out.println(a+b);
//			break;
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
	}
	

}
