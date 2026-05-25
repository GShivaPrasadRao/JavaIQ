package streams;

import java.util.Arrays;
import java.util.Comparator;

/*

4.Given a sentence .find the word count that has the 2nd highest length
	Input : String s="I am learning streams API in java"
	Output : 6

 */
public class SecondHighestWordCount {
    public static void main(String[] args) {
        String s="I am learning streams API in java";
       int count = Arrays.stream(s.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Count:"+count);


    }
}
