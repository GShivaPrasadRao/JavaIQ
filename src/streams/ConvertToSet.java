package streams;

import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//Convert the values to Set
public class ConvertToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,10);
        Set<Integer> uniqueNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println("Unique Numbers " + uniqueNumbers);

    }
}
