package oops;

public class Employee {

    private int employeeID;
    private String employeeName;

    // Private constructor
    private Employee(int id, String name) {
        this.employeeID = id;
        this.employeeName = name;
    }

    // Static factory method
    public static Employee createEmployee(int id, String name) {
        return new Employee(id, name);
    }


    public void display() {
        System.out.println("ID: " + employeeID + ", Name: " + employeeName);
    }


}
