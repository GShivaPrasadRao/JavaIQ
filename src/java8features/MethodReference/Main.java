package java8features.MethodReference;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names = Arrays.asList("John", "Alex", "Chris");

        // Without method reference using Lambda
        // names.sort((a, b) -> a.compareTo(b));

        // With Method Reference
        names.sort(String::compareTo);

        System.out.println(names);
    }
}