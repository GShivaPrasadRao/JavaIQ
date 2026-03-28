package infosysiqa;

// This program demonstrates the use of a functional interface in Java.
// A functional interface is an interface that contains exactly
// one abstract method.
// It can be used as the assignment target for a lambda expression or method reference.
@FunctionalInterface
interface CheckNumber {
    boolean test(int n);
}

public class Program4 {
    public static void main(String[] args) {
        // The lambda expression implements this method to check
        // if a number is even.
        CheckNumber flag = n -> n % 2 == 0;

        System.out.println(flag.test(4));

        System.out.println(flag.test(7));

    }
}

