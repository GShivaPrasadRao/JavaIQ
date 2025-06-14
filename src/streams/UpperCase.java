package streams;

import java.util.Arrays;
import java.util.List;

public class UpperCase {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "apple", "dog", "banana", "sky", "java");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase) // Convert each word to uppercase
                .toList(); // Collect the results into a list

        System.out.println("Words in uppercase: " + upperCaseWords);
    }
}
