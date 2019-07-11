package pl.marianwitkowski;

public class Car {

    private int engine;         //poj. silnika
    private String body;        //nadwozie
    private String driveType;   //rodzaj napędu
    private String interior;    //wnętrze
    private String color;       //kolor

    private void setEngine(int engine) {
        this.engine = engine;
    }

    private void setBody(String body) {
        this.body = body;
    }

    private void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    private void setInterior(String interior) {
        this.interior = interior;
    }

    private void setColor(String color) {
        this.color = color;
    }

    public static class Builder{

        private Car car;

        public Builder(){
            car = new Car();
        }

        public Builder withColor(String color){
            car.setColor(color);
            return this;
        }

        public Builder withDrive(String driveType) {
            car.setDriveType(driveType);
            return this;
        }

        public Builder withBody(String body) {
            car.setBody(body);
            return this;
        }

        public Builder withEngine(int engine) {
            car.setEngine(engine);
            return this;
        }

        public Builder withInterior(String interior) {
            car.setInterior(interior);
            return this;
        }

        public Car build(){
            return car;
        }

    }

    @Override
    public String toString() {
        return String.format("The car: Body:%s, Engine:%d, Drive:%s, Color:%s, Interior:%s",
                this.body, this.engine, this.driveType, this.color, this.interior);
    }

}
