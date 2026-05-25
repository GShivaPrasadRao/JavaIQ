package streams;

/*
3.Given a sentence .find the word that has the 2nd(Nth) highest length
	Input : String s="I am learning streams API in java"
	Output : streams
 */

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestWordInString {
    public static void main(String[] args) {
        String s="I am learning streams API in java";
        String result = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();

        System.out.println("Result:"+result);

    }
}
