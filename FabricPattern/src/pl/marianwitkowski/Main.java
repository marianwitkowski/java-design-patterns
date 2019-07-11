package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

	    VehicleFactory vehicleFactory = new VehicleFactory();

	    Vehicle vehicle1 = vehicleFactory.getVehicle("Audi");
        Vehicle vehicle2 = vehicleFactory.getVehicle("BMW");
        Vehicle vehicle3 = vehicleFactory.getVehicle("Mercedes");

        vehicle1.go();
        vehicle2.go();
        vehicle3.go();
    }
}
