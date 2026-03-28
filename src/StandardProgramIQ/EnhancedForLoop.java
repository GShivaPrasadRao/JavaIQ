package StandardProgramIQ;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {


    public static void main(String[] args) {
        int specifiedNumber = 5;
        ArrayList<Integer> numbers = new ArrayList<>();

        // Create a list of numbers up to the specified number
        for (int i = 1; i <= specifiedNumber; i++) {
            numbers.add(i);
        }

        System.out.println("Incrementing through numbers up to " + specifiedNumber + ":");
        for (int number : numbers) {
            System.out.println("Current number: " + number);
            // You can perform some operation with the 'number' here
        }

    }
}
