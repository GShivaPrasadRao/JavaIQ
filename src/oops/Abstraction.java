package oops;

//Hiding internal details and showing only essential features.
//Achieved using abstract classes or interfaces.
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
