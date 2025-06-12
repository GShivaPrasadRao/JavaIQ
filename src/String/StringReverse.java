package String;


//Program to reverse of a given string
public class StringReverse {

    public static String reverseStr(String input) {

        if (input == null || input == " ")
            throw new IllegalArgumentException("Null is not valid input");
        StringBuilder out = new StringBuilder();

        //Converting the input string into an array of characters.
        char[] result = input.toCharArray();

        //Iterating through this character array starting from the last character and moving towards the first.
        for (int i = result.length - 1; i >= 0; i--) {

            out.append(result[i]);//Appending each character encountered during the reverse iteration to a StringBuilder object
        }

        //out will contain the reversed version of the original string.
        return out.toString();
    }

    public static void main(String[] args) {


        String input = "shivaprasad";
        String reverse = reverseStr(input);
        System.out.println("Reverse for the given string :" + reverse);
    }

}
