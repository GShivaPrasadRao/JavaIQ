package java8features.FunctionalInterface;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.drive();
        car.fuelType();

        Vehicle.serviceInfo();
    }
}