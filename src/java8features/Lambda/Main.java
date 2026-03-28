package java8features.Lambda;

public class Main {
    public static void main(String[] args) {

        //With one params
        Vehicle v = () -> System.out.println("car is driving");
        v.drive();

        //With 2 params
        Calculator calculator = (a,b) -> a+b;
        System.out.println(calculator.add(5,10));


    }

}
