class Car extends Vehicle {


    private String volvo;
    private String v70;
    private int i;
    private int i1;
    private int i2;

    public Car(String brand, String model, int year, int speed, int doors) { //constructor
        super.brand = brand;
        super.model = model;
        super.year = year;
        super.speed = speed;
        super.doors =  doors;


    }


    @Override
    double fuelCalc() {
        return distance() * (int) getFuelConsumption() * fuelPrice();
    }

    @Override
    float getFuelConsumption() {
        return 20;
    }
    @Override
    int getMaxSpeed(int maxSpeed) {
        return 200;
    }
}
