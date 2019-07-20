package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

	    VehicleFactory vehicleFactory = new VehicleFactory();

	    Vehicle vehicle1 = vehicleFactory.createVehicle("Audi");
        Vehicle vehicle2 = vehicleFactory.createVehicle("BMW");
        Vehicle vehicle3 = vehicleFactory.createVehicle("Mercedes");

        vehicle1.go();
        vehicle2.go();
        vehicle3.go();
    }
}
