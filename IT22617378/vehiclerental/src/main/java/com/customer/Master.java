package com.customer;

public class Master extends Customer {
	
	
	private String payment;
	
	
	public Master(int id, String cusid, String name, String bdate, String payment) {
		super(id, cusid, name, bdate);
		this.payment =payment ;
		
	}

	

	public String getPayment() {
		return payment;
	}

	

}
