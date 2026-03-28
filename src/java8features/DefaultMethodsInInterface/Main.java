package java8features.DefaultMethodsInInterface;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();       // Calls overridden method
        car.fuelType();    // Calls overridden default method
        car.countTyres(); //Calls count of tyres
    }
}

