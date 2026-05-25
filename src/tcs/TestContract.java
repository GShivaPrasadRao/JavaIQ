package tcs;

public class TestContract {

    public static void main(String[] args) {

        Employee e1 = new Employee(102, "Shiva");
        Employee e2 = new Employee(101, "Shiva");

        System.out.println(e1.equals(e2));

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}