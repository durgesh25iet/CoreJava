package in.co.ray.string;

public class CountDigit {
	public static void main(String[] args) {

		String str = "go1o4g5464562le9";

		
		int count = 0;

		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
				count++;
				
			}else {
				
				System.out.println(str.charAt(i));
				
			}
		}
		
		System.out.println("total digits in string: " + count);

	}

}
