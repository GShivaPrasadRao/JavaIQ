package streams;

import java.util.Arrays;
import java.util.Comparator;

/*1.Given a sentence .find the word that has the highest length
Input : String s="I am learning streams API in java"
Output : learning */
public class HighestWordInString {

    public static void main(String[] args) {
        String s= "I am learning streams API in java";
       String result = Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println("Result:"+result);
    }
}
