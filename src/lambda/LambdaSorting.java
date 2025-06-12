package lambda;

import java.util.*;

public class LambdaSorting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Traditional way
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted List (Traditional): " + names);

        // Using Lambda Expression
        names.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted List (Lambda): " + names);
    }
}
