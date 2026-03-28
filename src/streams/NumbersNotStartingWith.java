package streams;

import java.util.Arrays;
import java.util.List;

//Find the numbers not starting with 1
public class NumbersNotStartingWith {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 13, 14, 15, 17, 25, 45);
        List<Integer> list = numbers.stream()
                .filter(num -> !String.valueOf(num).startsWith("1"))
                .toList();
        System.out.println(list);
    }
}
