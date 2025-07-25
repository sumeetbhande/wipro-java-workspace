package oops;

//Vehicle.java
class Vehicle {
 String brand;
 int speed;

 // Constructor
 public Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 // Method to be overridden
 public void showDetails() {
     System.out.println("Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

//Car.java
class Car extends Vehicle {
 int numberOfDoors;

 // Constructor
 public Car(String brand, int speed, int numberOfDoors) {
     super(brand, speed);
     this.numberOfDoors = numberOfDoors;
 }

 // Override showDetails()
 @Override
 public void showDetails() {
     System.out.println("Car Details:");
     super.showDetails();
     System.out.println("Doors: " + numberOfDoors);
     System.out.println("---------------------");
 }
}

//Bike.java
class Bike extends Vehicle {
 boolean hasCarrier;

 // Constructor
 public Bike(String brand, int speed, boolean hasCarrier) {
     super(brand, speed);
     this.hasCarrier = hasCarrier;
 }

 // Override showDetails()
 @Override
 public void showDetails() {
     System.out.println("Bike Details:");
     super.showDetails();
     System.out.println("Carrier: " + (hasCarrier ? "Yes" : "No"));
     System.out.println("---------------------");
 }
}

//Main class
public class VehicleTest {
 public static void main(String[] args) {
     // Create Car and Bike objects
     Car car = new Car("Toyota", 180, 4);
     Bike bike = new Bike("Honda", 120, true);

     // Display details
     car.showDetails();
     bike.showDetails();
 }
}
