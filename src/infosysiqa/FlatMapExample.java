package infosysiqa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//The flatMap method in Java is used to transform each element of a stream
// into another stream and then flatten all the resulting streams
// into a single stream. It is commonly used to process
// nested collections (e.g., lists of lists) and produce a flat structure.
public class FlatMapExample {
    public static void main(String[] args) {
        // List of lists
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // Flatten the list of lists into a single list
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream) // Convert each list into a stream and flatten
                .collect(Collectors.toList());

        System.out.println(flattenedList); // Output: [1, 2, 3, 4, 5, 6, 7, 8]
    }
}