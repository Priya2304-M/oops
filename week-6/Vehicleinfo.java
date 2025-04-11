// Base class
class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Subclass
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number Of Doors: " + numberOfDoors);
    }
}

// Main class
public class Vehicleinfo{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("mahander", 100);
        System.out.println("Vehicle Details:");
        vehicle.displayInfo();

        System.out.println("\nCar Details:");
        Car car = new Car("Thar", 180, 5);
        car.displayInfo();
        System.out.println("priya");
    }
}
