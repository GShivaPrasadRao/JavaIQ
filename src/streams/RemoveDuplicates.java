package streams;

import java.util.Arrays;
import java.util.List;

//Remove the duplicates from the list
public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 22, 34, 44, 55, 66, 77, 22, 45, 55);
        List<Integer> result = numbers.stream()
                                .distinct().toList();
        System.out.println("Result:" + result);

    }
}
