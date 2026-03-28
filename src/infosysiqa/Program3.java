package infosysiqa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3);
        List<List<Integer>> num1 = Arrays.asList(num);
        System.out.println(flattenListOfLists(num1));
    }

    public static List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .toList();
//                .collect(Collectors.toList());

    }

}
