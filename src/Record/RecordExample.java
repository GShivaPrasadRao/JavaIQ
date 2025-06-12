package Record;

public class RecordExample {
    public static void main(String[] args) {
        // Creating an instance of the Employee record
        Employee emp = new Employee(101, "John Doe", 75000.0);

        // Accessing record fields (automatically generated getters)
        System.out.println("ID: " + emp.id());
        System.out.println("Name: " + emp.name());
        System.out.println("Salary: " + emp.salary());

        // Default toString() implementation
        System.out.println(emp);  // Output: Employee[id=101, name=John Doe, salary=75000.0]
    }
}
