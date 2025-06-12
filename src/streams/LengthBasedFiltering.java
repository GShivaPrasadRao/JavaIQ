package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthBasedFiltering {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "apple", "dog", "banana", "sky", "java");

        // Using Stream API to filter words with length > 3
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 3)
                .collect(Collectors.toList());

        System.out.println("Words with length > 3: " + filteredWords);
    }
}
