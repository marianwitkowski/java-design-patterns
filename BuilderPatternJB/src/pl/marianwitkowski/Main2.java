package pl.marianwitkowski;

public class Main2 {

    public static void main(String[] args) {

        Car car1 = new Car.Builder()
                .withBody("COUPE")
                .withEngine(3500)
                .withColor("RED")
                .withDrive("REAR")
                .withInterior("LEATHER")
                .build();
        System.out.println(car1);

        Car car2 = new Car.Builder()
                .withBody("COMBI")
                .withEngine(1800)
                .withColor("BLACK")
                .withDrive("FRONT")
                .withInterior("VELVET")
                .build();
        System.out.println(car2);


        Car car3 = new Car.Builder()
                .withBody("SUV")
                .withEngine(2500)
                .withColor("WHITE")
                .withDrive("4X4")
                .withInterior("ALCANTARA")
                .build();
        System.out.println(car3);

    }
}
