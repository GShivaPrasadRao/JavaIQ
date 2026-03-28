package epamiqa;

import java.util.*;
import java.util.stream.*;

public class EasyEvenOdd {

    public static void main(String[] args) {
        String input = "Hello World";

        input.chars()
                .filter(c -> c != ' ')                      // ignore spaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .forEach((ch, count) -> {

                    boolean even = isBooleanEven(count.toString());
                    System.out.println(ch + " : " + count + " → " + (even ? "Even" : "Odd"));
                });
    }

    // Simplest possible logic
    static boolean isBooleanEven(String str) {
        return Integer.parseInt(str) % 2 == 0;
    }
}
