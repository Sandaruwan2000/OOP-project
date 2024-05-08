package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class customerdbutil {
	
	
	private static customerdbutil singlton = null;
	 public static Connection conn = null ; ;
	 public static Statement stmnt = null ;
	 public static ResultSet a = null ;
	 public static boolean isSuccess ;
	 
	 
	 private customerdbutil() {
		 
	 }
	 
	 public static customerdbutil getsingloton() {
		 
		 if(singlton == null) {
			 singlton = new customerdbutil() ;
		 }
		 
		 return singlton ;
	 }
	
	public static boolean insercustomer(String cusid,String name,String bdate,String payment) {
		
	
		
		 isSuccess = false;
	
		
		
		try {
			
			
			conn = dbconnector.getConnection() ;
			 stmnt = conn.createStatement();
			 
			
			String sql = "insert into customer2 values (0,'"+cusid+"','"+name+"','"+bdate+"','"+payment+"') ";
			int a = stmnt.executeUpdate(sql);
			
			
			if (a>0) {
				isSuccess=true;
			}
			else
			{
				isSuccess =false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
public static boolean search(String cusid) {
	try {
		conn = dbconnector.getConnection();
		stmnt = conn.createStatement();
		String sql = "select * from customer2 where cusid= '"+cusid+"'";
		a = stmnt.executeQuery(sql);
		
		if(a.next()) {
			isSuccess = true;
		}else {
			isSuccess = false;
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return isSuccess;
	
}
	
public static List<Customer> getcustomer(String cnumber){
	
	ArrayList<Customer>cus = new ArrayList<>();
	try {
		
		conn = dbconnector.getConnection();
		stmnt=conn.createStatement();
		String sql = "select * from customer2 where cusid='"+cnumber+"'";
		a = stmnt.executeQuery(sql);
		
		while(a.next()) {
			int id = a.getInt(1);
			String cusid = a.getString(2);
			String name = a.getString(3);
			String bdate = a.getString(4);
			String payment = a.getString(5);
			
			Customer c = Factorycard.createpayment(id, cusid, name, bdate, payment);
			if(c != null) {
				cus.add(c);
			}
			
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus;
}

public static boolean updatecustomer(String id,String cusid,String name,String bdate,String payment) {
	
	try {
		conn = dbconnector.getConnection();
		stmnt=conn.createStatement();
		String sql = "update customer2 set cusid='"+cusid+"',name='"+name+"',bdate='"+bdate+"',payment='"+payment+"'"
				+"where id='"+id+"'";
		int a = stmnt.executeUpdate(sql);
		
		if(a > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}

public static List<Customer>getcustomerDetails(String Id){
	
	ArrayList <Customer>cus=new ArrayList<>();
	
	int convertedId = Integer.parseInt(Id);
	
	try {
		conn = dbconnector.getConnection();
		stmnt=conn.createStatement();
		
		String sql ="select * from customer2 where id='"+convertedId+"'";
		a = stmnt.executeQuery(sql);
		
		while(a.next()) {
			int id = a.getInt(1);
			String cusid = a.getString(2);
			String name = a.getString(3);
			String bdate = a.getString(4);
			String payment = a.getString(5);
			



			Customer c = Factorycard.createpayment(id, cusid, name, bdate, payment);
			if(c != null) {
				cus.add(c);
			}
			
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	return cus;
}

public static boolean deletecustomer(String id) {
	
	int convid = Integer.parseInt(id);
	
	try {
		conn = dbconnector.getConnection();
		stmnt=conn.createStatement();
		
		String sql = "delete  from customer2  where id='"+convid+"'";
		int a = stmnt.executeUpdate(sql);
		
		if(a > 0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return isSuccess;
}

public void closeConnections() {
    try {
        if (a != null) {
            a.close();
        }
        if (stmnt != null) {
            stmnt.close();
        }
        if (conn != null) {
            conn.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
	
	
}
