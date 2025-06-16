package streams;

import java.util.Arrays;
import java.util.List;


//Find the unique/distinct numbers from the list
public class DistinctNumbers {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,23,23,5,89,290,2,1,2,45,98);
        List<Integer> distinctNumbers = numbers.stream().distinct().toList();
        System.out.println("DistinctNumbers:"+distinctNumbers);

    }
}
