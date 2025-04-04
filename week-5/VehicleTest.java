class Vehicle {
    String brand;
    int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void start() {
        System.out.println(brand + " vehicle is starting...");
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    int numberOfDoors;
    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); 
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();  
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Bike extends Vehicle {
    boolean hasGears;
    public Bike(String brand, int speed, boolean hasGears) {
        super(brand, speed);  
        this.hasGears = hasGears;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();  
        System.out.println("Has Gears: " + (hasGears ? "Yes" : "No"));
    }
}
class Truck extends Vehicle {
    double capacity;
    public Truck(String brand, int speed, double capacity) {
        super(brand, speed); 
        this.capacity = capacity;
    }
    public void showTruckDetails() {
        displayDetails();  
        System.out.println("Capacity: " + capacity + " tons");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
        // Create car, bike, and truck objects
        Car car = new Car("Toyota", 150, 4);
        Bike bike = new Bike("Yamaha", 80, true);
        Truck truck = new Truck("Volvo", 90, 15.5);

        car.start();
        bike.start();
        truck.start();

        System.out.println("\nCar Details:");
        car.displayDetails();

        System.out.println("\nBike Details:");
        bike.displayDetails();

        System.out.println("\nTruck Details:");
        truck.showTruckDetails();
        System.out.println("priya");
    }
}