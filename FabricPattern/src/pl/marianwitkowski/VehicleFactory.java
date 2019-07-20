package pl.marianwitkowski;

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleType){
        String s = "  AUDI   ";
        s = s.toString(); // "AUDI"
        if(vehicleType == null || vehicleType.trim().length()==0){
            return null;
        }

        if(vehicleType.trim().equalsIgnoreCase("AuDi")){
            return new Audi();

        } else if(vehicleType.trim().equalsIgnoreCase("bmw")){
            return new Bmw();

        } else if(vehicleType.trim().equalsIgnoreCase("MERCEDES")){
            return new Mercedes();
        }
        return null;
    }

}



