package streams;

import java.util.Arrays;

/*
2.Remove duplicates from the string and return in the same order
	Input : String s="dabcadefg"
	Output : dabcefg
 */
public class RemoveDuplicatesString {
    public static void main(String[] args) {
        String s= "dabcadefg";
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
