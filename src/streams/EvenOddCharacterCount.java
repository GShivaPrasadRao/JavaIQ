package streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Epam question
public class EvenOddCharacterCount {

    public static void main(String[] args) {
        String input = "Hello World";

        Map<Character, Long> charCount = input.chars()
                .filter(ch -> !Character.isWhitespace(ch))     // ignore spaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));

        charCount.forEach((ch, count) -> {
            String countString = String.valueOf(count);
            boolean isEven = isBooleanEven(countString);

            System.out.println(ch + " : " + count +
                    " → " + (isEven ? "Even" : "Odd"));
        });
    }

    // Your required method
    static boolean isBooleanEven(String str) {
        return str.length() % 2 == 0;   // even → true, odd → false
    }
}
