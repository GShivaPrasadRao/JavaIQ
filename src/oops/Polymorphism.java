package oops;

//Definition: The ability of a single function, method, or
// operator to behave differently based on the input.

//Types:
// Compile-time (Method Overloading)
//Runtime (Method Overriding)
class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class MethodOverriding {
    void sound() {
        System.out.println("Sound");
    }
}

class Child extends MethodOverriding {
    void behaviour() {
        System.out.println("Snoring");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(5, 10));       // 15
        System.out.println(m.add(2.5, 3.5));    // 6.0
    }
}
