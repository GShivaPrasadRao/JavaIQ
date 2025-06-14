package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAscendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 10, 20, 30, 55, 76, 23, 59, 92);
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List:" + sortedList);
    }
}
