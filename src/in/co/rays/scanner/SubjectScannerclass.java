package in.co.rays.scanner;

import java.util.Scanner;

public class SubjectScannerclass {
	public static void main(String []args){
		
		Scanner sc = new Scanner (System.in);
		
		String subject = sc.next();
		
		switch(subject) {
		
		case "Maths":
			System.out.println("ohh wow maths, your subject is:\n english\n hindi\n maths\n physics\n chemestry\n ");
			break;
		case "Bio":
			System.out.println("ohh wow bio, your subject is:\n english\n hindi\n bio\n physics\n chemestry\n ");
			break;
		case "Commarce":
			System.out.println("ohh wow commerce, your subject is:\n english\n hindi\n Accountancy\n Business Studies\n Economics\n ");
			break;
		case "Art":
			System.out.println("ohh wow Art, your subject is:\n english\n hindi\n Accountancy\n Business Studies\n Economics\n ");
		default:
			System.out.println("is related koi subject nhi hai koi or si school me jao");
			sc.close();
		}
	}

}
