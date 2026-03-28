package oops;

public class EmployeeMain {

    public static void main(String[] test) {
       // Employee employee = new Employee(1,"shiva"); // ❌ Compile-time error
        Employee emp = Employee.createEmployee(101, "Shiva");
        emp.display();

    }
}
