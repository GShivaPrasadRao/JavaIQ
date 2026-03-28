package java8features.StaticMethodsInInterface;

interface Vehicle {

    void start();

    // Static method
    static void serviceInfo() {
        System.out.println("All vehicles require regular servicing");
    }
}