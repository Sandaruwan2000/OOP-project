package Addvehi;

public class Car extends Vehicle {
	
	private String seats ;
	
	
	public Car(int id ,String vehicle ,String number ,String year ,String seats ,String engine ,String gear ,String kilometers ,String price ) {
		
		super(id,vehicle,number,year,engine,gear,kilometers,price);
		this.seats = seats ;
		
	}


	public String getSeats() {
		return seats;
	}


	
	

}
