public class Motorcycle extends Vehicle {

    public Motorcycle(String Brand, String Model, int year, int Speed, boolean WindShield) { //constructor
        super.brand = Brand;
        super.model = Model;
        super.year = year;
        super.speed = Speed;
        super.WindShield = WindShield;
    }


    @Override //this is the fuel consumption for the motorcycle in liters per 100 km
    double fuelCalc() {
        return distance() * (int) getFuelConsumption() * fuelPrice();
    }

    @Override
    float getFuelConsumption() {
        return 40;
    }


    @Override
    int getMaxSpeed(int maxSpeed) {
        return 40;
    }

}