package Addvehi;

public class VehicleFactory {

    public static Vehicle createVehicle(int id, String vehicle, String number, String year, String seats, String engine, String gear, String kilometers, String price) {
        if ("car".equals(vehicle) || "van".equals(vehicle)) {
            return new Car(id, vehicle, number, year, seats, engine, gear, kilometers, price);
        } 
        else if ("bike".equals(vehicle)) {
            return new Bike(id, vehicle, number, year, seats, engine, gear, kilometers, price);
        }
        return null; 
    }
}
