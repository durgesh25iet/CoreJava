package in.com.rays.encapsulation;

public class FoodOrder {
	
	private int orderID;
	private String customerName ;
	private String restaurant;
	private double orderAmount;
	private String deliveryStatus;
	
	public void setOrderId (int orderId) {
		this.orderID = orderId;
	}
	
	public int getOrderId () {
		return orderID;
	}
	
	public void setCustomerName (String customerName) {
		this.customerName = customerName;
		
	}
	
	public String getcustomerName() {
		return customerName;
	}
	
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;		
	}
	
	public String getRestaurant() {
		return restaurant;
	}
	
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
		
	}
	 public double getOrderAmount () {
		 return orderAmount;
	 }
	 
	 public void setDeliveryStatus(String deliveryStatus) {
		 this.deliveryStatus = deliveryStatus;
	 }
	 
	 public String getDeliveryStatus() {
		 return deliveryStatus;
	 }

}
