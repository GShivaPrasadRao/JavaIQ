package java8features.DefaultMethodsInInterface;

interface Vehicle {

    // Abstract method
    void start();

    // Default method
    default void fuelType() {
        System.out.println("Default fuel type: Petrol/Diesel");
    }

    //Default method 2
    default void countTyres()
    {
        System.out.println("Total of 4 tyres");
    }
}