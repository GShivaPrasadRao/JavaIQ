package streams;
/*
5.Given a sentence .find the occurrence of each word
	Input : String s="I am learning streams API in java java"
	Output : {I = 1,am = 1, learning= 1,streams = 1, API= 1,java=2}
 */

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurenceCount {
    public static void main(String[] args) {
        String s ="I am learning streams API in java java";
        Map<String,Long> ans = Arrays.stream(s.split(" "))
             .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println(ans);
    }
}
