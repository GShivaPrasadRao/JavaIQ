package streams;

import java.util.Arrays;
import java.util.List;

public class MaximumValue {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
        // Using Stream API to find the maximum value
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(null); // orElse to handle empty list case
        System.out.println("Maximum value: " + max);
    }
}
