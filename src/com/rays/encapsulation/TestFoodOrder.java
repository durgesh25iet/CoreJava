package com.rays.encapsulation;

public class TestFoodOrder {
	public static void main(String []args) {
		
		FoodOrder a = new FoodOrder();
		a.setOrderId(112233);
		a.setCustomerName("mohit");
		a.setRestaurant("apnaSweet");
		a.setOrderAmount(50.55);
		a.setDeliveryStatus("outOfDelivery");
		
		System.out.println(a.getOrderId());
		System.out.println(a.getcustomerName());
		System.out.println(a.getRestaurant());
		System.out.println(a.getOrderAmount());
		System.out.println(a.getDeliveryStatus());
		
		
		
	}

}
