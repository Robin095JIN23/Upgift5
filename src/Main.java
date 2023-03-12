import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Volvo", "V70", 200, 2005, 5);
        vehicles[1] = new Truck("Volvo", "V70", 200, 2005, 5);
        vehicles[2] = new Motorcycle("Volvo", "V70", 200, 2005, true);


    System.out.println("Hello, welcome to the vehicle calculator");
    System.out.println("It will calculate the cheapest vehicle for you to use");
    System.out.println("Your chosen place is göteborg + malmo");
    System.out .println("the distance is 271,7 km");


        for (Vehicle vehicle : vehicles) {  //loop through the vehicles
            System.out.println("your vehicles are " + Arrays.toString(Vehicle.getVehicles(vehicles))); //print the vehicles

            if (vehicle.fuelCalc() > 1000) { //check if the vehicle is suitable for the trip
                System.out.println("The vehicle " + vehicle.brand + " " + vehicle.model + " " + vehicle.year+ " is suitable for your trip, the cost is " + vehicle.fuelCalc() + "kr");
                break;
            }
        }
    }
}





