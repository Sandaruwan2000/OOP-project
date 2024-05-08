package Addvehi;

public class Bike extends Vehicle {
	
	private final  String seats ;

	public Bike(int id ,String vehicle ,String number ,String year ,String seats ,String engine ,String gear ,String kilometers ,String price ) {
		super(id, vehicle, number, year, engine, gear, kilometers, price);
		this.seats = "2" ;
	}


	public String getSeats() {
		return seats;
	}
}
