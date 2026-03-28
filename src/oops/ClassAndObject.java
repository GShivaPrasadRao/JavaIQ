package oops;

//Definition Class :A class is a blueprint or template for creating objects.
//Definition Object: An object is an instance of a class.
//In the below example Car is an class where brand and speed are attributes,
// drive is a function

//A class is like a blueprint of a house, and an object is the actual house built from that blueprint.


class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car myCar = new Car(); //Here we're creating the car object i.e,myCar
        myCar.brand = "Toyota"; // We've given the attribute as Toyota
        myCar.speed = 100;  // Another attribute is speed
        myCar.drive(); // function of the car
    }

}
