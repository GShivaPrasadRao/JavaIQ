package java8features.FunctionalInterface;

class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }
}