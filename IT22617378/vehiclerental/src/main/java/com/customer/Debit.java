package com.customer;

public class Debit extends Customer {

private String payment;
	
	
	public Debit(int id, String cusid, String name, String bdate, String payment) {
		super(id, cusid, name, bdate);
		this.payment =payment ;
	}

	

	public String getPayment() {
		return payment;
	}
	
}
