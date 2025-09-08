class Vehicle {
    protected int speed;
    protected int fuelCapacity;

    Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity; }
    public void start() {
        System.out.println("Vehicle started.");}
    public void displayInfo() {
        System.out.println("Speed: " + speed + " km/h, Fuel Capacity: " + fuelCapacity + " liters"); }}
class Car extends Vehicle {
    private int numberOfDoors;
    Car(int speed, int fuelCapacity, int numberOfDoors) {
        super(speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors; }
    public void showCarDetails() {
        displayInfo();
        System.out.println("Car with " + numberOfDoors + " doors.");   }}
class Bike extends Vehicle {
    private boolean hasGear;
    Bike(int speed, int fuelCapacity, boolean hasGear) {
        super(speed, fuelCapacity);
        this.hasGear = hasGear;  }
    public void showBikeDetails() {
        displayInfo();
        System.out.println("Bike with gear: " + hasGear);  }}
class Truck extends Vehicle {
    private int loadCapacity;

    Truck(int speed, int fuelCapacity, int loadCapacity) {
        super(speed, fuelCapacity);
        this.loadCapacity = loadCapacity;
    } public void showTruckDetails() {
        displayInfo();
        System.out.println("Truck load capacity: " + loadCapacity + " tons");}}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car(180, 50, 4);
        Bike bike = new Bike(120, 15, true);
        Truck truck = new Truck(100, 150, 20);
 car.start();
        car.showCarDetails();
        System.out.println();
        bike.start();
        bike.showBikeDetails();
        System.out.println();
        truck.start();
        truck.showTruckDetails();
    }
}