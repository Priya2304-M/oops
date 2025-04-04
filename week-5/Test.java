public class Test {
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