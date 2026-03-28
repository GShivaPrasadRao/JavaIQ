package oops;

//Definition : One class can inherit properties and methods from another using extends.
//Analogy: A child inherits traits from their parent.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // inherited method
        d.bark();   // own method
    }
}
