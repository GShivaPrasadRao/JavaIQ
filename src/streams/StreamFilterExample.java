package streams;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    // toString() for printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}

public class StreamFilterExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 40000),
                new Employee("Charlie", "Finance", 75000),
                new Employee("David", "IT", 45000),
                new Employee("Emma", "HR", 80000)
        );

        // Filtering employees with salary > 50,000
        List<Employee> highPaidEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)  // Filter condition
                .collect(Collectors.toList());          // Collect to list

        // Print the filtered employees
        highPaidEmployees.forEach(System.out::println);
    }
}

