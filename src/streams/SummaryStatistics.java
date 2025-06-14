package streams;

import java.util.List;
import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SummaryStatistics {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        IntSummaryStatistics summaryStatistics = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Summary Statistics : "+ summaryStatistics);
    }
}
