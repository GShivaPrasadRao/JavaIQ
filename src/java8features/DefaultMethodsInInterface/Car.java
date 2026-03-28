package java8features.DefaultMethodsInInterface;


class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key ignition");
    }

    // Optional: Override default method
    @Override
    public void fuelType() {
        System.out.println("Car uses Petrol");
    }
}