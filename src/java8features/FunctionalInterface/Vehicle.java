package java8features.FunctionalInterface;

@FunctionalInterface
interface Vehicle {

    // Only ONE abstract method
    void drive();

    // Default method
    default void fuelType() {
        System.out.println("Petrol/Diesel");
    }

    // Static method
    static void serviceInfo() {
        System.out.println("Service every 6 months");
    }
}
