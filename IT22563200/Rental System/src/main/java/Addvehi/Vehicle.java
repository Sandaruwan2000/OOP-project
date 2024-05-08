package Addvehi;


public   class  Vehicle extends Super{
	
	
	private int id  ;
	private String vehicle  ;
	private String number ;
	private String year ;
	private String engine ;
	private String gear ;
	private String kilometers ;
	private String price ;
	
	
	
	
	public Vehicle(int id, String vehicle, String number, String year, String engine, String gear, String kilometers,
			String price) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.number = number;
		this.year = year;
		this.engine = engine;
		this.gear = gear;
		this.kilometers = kilometers;
		this.price = price;
		
	}





	public String getVehicle() {
		return vehicle;
	}



	public String getNumber() {
		return number;
	}




	public String getYear() {
		return year;
	}




	public String getEngine() {
		return engine;
	}



	public String getGear() {
		return gear;
	}



	public String getKilometers() {
		return kilometers;
	}



	public String getPrice() {
		return price;
	}





	@Override
	public int getId() {
		return id;
	}



	





	
	
	
}
