package com.customer;

public class Customer extends User {
	private int id;
	private String cusid;
	private String name;
	private String bdate;
	
	
	public Customer(int id, String cusid, String name, String bdate ) {
		
		this.id = id;
		this.cusid = cusid;
		this.name = name;
		this.bdate = bdate;
		
	}

	
	

	public String getCusid() {
		return cusid;
	}

	

	public String getName() {
		return name;
	}

	

	public String getBdate() {
		return bdate;
	}

	

	




	@Override
	public int getId() {
		
		return id;
	}

	}
	


