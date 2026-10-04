package in.com.rays.inheritance;

public class TestParking {
	public static void main(String[] arg) {

		Parking a = new Parking();

		a.setParkingNO(10);
		a.setId(1);
		a.setArea(30);
		a.setParkingPrice(100);

		System.out.println(a.getArea());
		System.out.println(a.getParkingNO());
		System.out.println(a.getParkingPrice());
		System.out.println(a.getID());

	}

}
