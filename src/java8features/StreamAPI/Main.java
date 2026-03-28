package java8features.StreamAPI;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alex", "Chris", "David","Abhijit");

        // Filter names starting with 'A'
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);   // Method reference
    }
}