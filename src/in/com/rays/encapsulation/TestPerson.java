package in.com.rays.encapsulation;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String []args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p1 = new Person();
		p1.setName("Ram");
		p1.setDob(sdf.parse("2005-02-02"));
		p1.setAddress("Indore");
		p1.setGender("male");
		
		System.out.println("p1 name :-" +p1.getName());
		System.out.println("p1 dob :-"+p1.getDob());
		System.out.println("p1 address:-"+p1.getAddress());
		System.out.println("p1 gender :-"+ p1.getGender());
		
		
	}

}
