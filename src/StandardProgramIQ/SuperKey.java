package StandardProgramIQ;

class Employee {
    Employee() {
        System.out.println("Employee constructor called");
    }
}

class Developer extends Employee {
    Developer() {
        super(); // Calls parent constructor
        System.out.println("Developer constructor called");
    }
}


public class SuperKey {
    public static void main(String[] args) {
        Developer dev = new Developer();
    }
}