package pl.marianwitkowski;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType){
        if(vehicleType == null){
            return null;
        }

        if(vehicleType.equalsIgnoreCase("AUDI")){
            return new Audi();

        } else if(vehicleType.equalsIgnoreCase("BMW")){
            return new Bmw();

        } else if(vehicleType.equalsIgnoreCase("MERCEDES")){
            return new Mercedes();
        }
        return null;
    }

}



