package in.com.rays.inheritance;

public class Library {
	
	private int bookID;
	private String title;
	private String author;
	private boolean availability;
	private String location;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}
	
	public Library(int bookID, String title, String author, boolean availability) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.availability = availability;	
	}
	
//	public Library(String location ) {
//		this.location = location;	
//	}
//	
	public String getLocation() {
		return location;
		
	}
	public int getBookID() {
		return bookID;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean getAvailability() {
		return availability;
	}
	
	public int sum(int a, int b ) {
		int sum = a + b;
		return sum;	
	}
	
	public int multiply(int a, int b, int c){
		int multi = a*b*c;
		return multi;
		
	}
	
		
	

}
