public class Truck extends Vehicle {

    public Truck(String brand, String model, int year, int speed, int doors) { //constructor
        super.brand = brand;
        super.model = model;
        super.year = year;
        super.speed = speed;
        super.doors =  doors;
    }

    @Override
    double fuelCalc() {  //caöculate fuel consumption
        return distance() * (int) getFuelConsumption() * fuelPrice();
    }

    @Override
    float getFuelConsumption() {
        return 50; //this is the fuel consumption for the truck in liters per 100 km
        //the fuel consumption for the truck is 50 liters per 100 km


    }

    @Override
    int getMaxSpeed(int maxSpeed) {
        return 80;
    }


}


