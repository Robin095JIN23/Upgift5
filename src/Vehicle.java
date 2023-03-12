abstract class Vehicle {
    public String brand;
    public String model;
    public int year;
    public int speed;
    public int doors;

    public boolean WindShield;


    public static Vehicle[] getVehicles(Vehicle[] vehicles) {
        return vehicles;
    }

    abstract double fuelCalc(); //calculate fuel consumption


    abstract float getFuelConsumption(); //get fuel consumption

    //price of fuel
    public static double fuelPrice() {
        return 12.5;
    }


    static double distance() {
        return 271.7;
    }


    abstract int getMaxSpeed(int maxSpeed);
}



