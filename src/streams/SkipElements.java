package streams;

import java.util.List;
import java.util.Arrays;

public class SkipElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream().skip(5).toList();
        System.out.println("Result:" + result);
    }
}
