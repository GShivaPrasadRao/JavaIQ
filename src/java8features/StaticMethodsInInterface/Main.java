package java8features.StaticMethodsInInterface;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();

        // Calling static method (Important!)
        Vehicle.serviceInfo();
    }
}