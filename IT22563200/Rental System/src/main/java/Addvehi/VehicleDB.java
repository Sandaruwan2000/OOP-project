package Addvehi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;






public class VehicleDB {
	
	
	private static VehicleDB singlton = null;
	
	
	public static Connection conn = null;
	public static Statement stmnt = null;
	public static ResultSet a = null;
	public static boolean issuccess;
	
	
	private VehicleDB() {
		
	}
	
	
	public static VehicleDB getInstance() {
        if (singlton == null) {
        	singlton = new VehicleDB();
        }
        return singlton;
    }
	
	public static boolean addvehicle(String vehicle ,String number ,String year ,String seats ,String engine ,String gear ,String kilometers,String price) {
		
		issuccess = false;
		
		
		 
		 try {
			 
			 
			conn = DBconnector.getConnection() ;
			 stmnt = conn.createStatement() ;
			String sql ="insert into adds values (0,'"+vehicle+"','"+number+"','"+year+"','"+seats+"','"+engine+"','"+gear+"','"+kilometers+"','"+price+"')";
			int a = stmnt.executeUpdate(sql) ;
			
			if(a > 0) {
				issuccess = true ;
			}else {
				issuccess = false ;
			}
		 }
		 
		 catch(Exception e){
			 
			 e.printStackTrace(); 
		 }
		
		return issuccess ;
		
		}
	
	public static boolean search(String number) {
		
		 try {
			 
			 
				conn = DBconnector.getConnection() ;
				 stmnt = conn.createStatement() ;
				String sql ="select * from adds where number='"+number+"'";
				 a = stmnt.executeQuery(sql) ;
				
				if(a.next()) {
					issuccess = true ;
				}else {
					issuccess = false ;
				}
			 }
			 
			 catch(Exception e){
				 
				 e.printStackTrace(); 
			 }
			
			return issuccess ;
			
			}
	
	public static List<Vehicle> getvehicle(String vnumber){
		
		ArrayList<Vehicle> veh = new ArrayList<>();
		 try {
			 
			 
				conn = DBconnector.getConnection() ;
				 stmnt = conn.createStatement() ;
				String sql ="select * from adds where number='"+vnumber+"'";
				 a = stmnt.executeQuery(sql) ;
				
				while(a.next()) {
					
					int id =a.getInt(1) ;
					String vehicle = a.getString(2) ;
					String number = a.getString(3) ;
					String year = a.getString(4) ;
					String seats = a.getString(5) ;
					String engine = a.getString(6) ;
					String gear = a.getString(7) ;
					String kilometers = a.getString(8) ;
					String price = a.getString(9) ;
					
					
					Vehicle v = VehicleFactory.createVehicle(id, vehicle, number, year, seats, engine, gear, kilometers, price);
	                if (v != null) {
	                    veh.add(v);
	                }
				}
			 }
			 
			 catch(Exception e){
				
				 
			 }
			
			return veh ;
			
			}
	
	public static boolean updatevehicle(String id,String vehicle ,String number ,String year ,String seats ,String engine ,String gear ,String kilometers,String price) {
		
		
		try {
			 
			 
			conn = DBconnector.getConnection() ;
			 stmnt = conn.createStatement() ;
			String sql ="update  adds set  vehicle='"+vehicle+"',number='"+number+"',year='"+year+"',seats='"+seats+"',engine='"+engine+"',gear='"+gear+"',kilometers='"+kilometers+"',price='"+price+"'"
					+ "where id='"+id+"'";
			int a = stmnt.executeUpdate(sql) ;
			
			if(a > 0) {
				issuccess = true ;
			}else {
				issuccess = false ;
			}
		 }
		 
		 catch(Exception e){
			 
			 e.printStackTrace(); 
		 }
		
		
				return issuccess ;
			}


	public static boolean deletevehicle(String id) {
		
		int id_converter=Integer.parseInt(id) ;
		
		try { 
			conn = DBconnector.getConnection() ;
			 stmnt = conn.createStatement() ;
			String sql ="delete from adds where id='"+id_converter+"' " ;
					
			int a = stmnt.executeUpdate(sql) ;
			
			if(a > 0) {
				issuccess = true ;
			}else {
				issuccess = false ;
			}
		 }
		 
		 catch(Exception e){
			 
			 e.printStackTrace(); 
		 }
			
			return issuccess ;
		
		
		}
	
	public static boolean entry(String number) {
		
		 try {
			 
			 
				conn = DBconnector.getConnection() ;
				 stmnt = conn.createStatement() ;
				String sql ="select * from adds where number='"+number+"'";
				 a = stmnt.executeQuery(sql) ;
				
				if(a.next()) {
					issuccess = true ;
				}else {
					issuccess = false ;
				}
			 }
			 
			 catch(Exception e){
				 
				 e.printStackTrace(); 
			 }
			
			return issuccess ;
			
			}
	
	public static List<Vehicle> listvehicle() {
	    ArrayList<Vehicle> veh = new ArrayList<>();
	    try {
	        conn = DBconnector.getConnection();
	        stmnt = conn.createStatement();
	        String sql = "select * from adds"; 
	        a = stmnt.executeQuery(sql);

	        while (a.next()) {
	            int id = a.getInt(1);
	            String vehicle = a.getString(2);
	            String number = a.getString(3);
	            String year = a.getString(4);
	            String seats = a.getString(5);
	            String engine = a.getString(6);
	            String gear = a.getString(7);
	            String kilometers = a.getString(8);
	            String price = a.getString(9);

	            Vehicle v = VehicleFactory.createVehicle(id, vehicle, number, year, seats, engine, gear, kilometers, price);
                if (v != null) {
                    veh.add(v);
                }
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	       
	    }

	    return veh;
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
