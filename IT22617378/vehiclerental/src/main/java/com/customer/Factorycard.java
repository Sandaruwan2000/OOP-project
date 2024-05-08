package com.customer;

public class Factorycard {
	
	public static Customer createpayment(int id,String cusid,String name,String bdate,String payment) {
		
		if("master".equals(payment)) {
			return new Master(id,cusid,name,bdate,payment) ;
		}else if("debit".equals(payment)) {
			
			return new Debit(id,cusid,name,bdate,payment) ;
		}
		return null ;
	}

}
