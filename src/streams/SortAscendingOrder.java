package streams;

import java.util.Arrays;
import java.util.List;

public class SortAscendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 10, 20, 30, 55, 76, 23, 59, 92);
        List<Integer> sortedList = numbers.stream().sorted().toList();
        System.out.println("Sorted List:" + sortedList);
    }
}
