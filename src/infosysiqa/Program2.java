package infosysiqa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        System.out.println(doubleNumbers(numbers));
    }

    public static List<Integer> doubleNumbers(List<String> numbers) {
        return numbers.stream()
                .map(Integer::parseInt)
                .map(n -> n * 2)
                .collect(Collectors.toList()); //toList();
    }

}
