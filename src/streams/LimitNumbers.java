package streams;

import java.util.Arrays;
import java.util.List;


//Limit the numbers size
public class LimitNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,14,15,16,17,18,19);
        List<Integer> result = numbers.stream().limit(4).toList();
        System.out.println("Result after limiting: "+result);
    }
}
