package StandardProgramIQ;

public class PalindromeString {
    public static void checkPalindrome(String s){
        StringBuilder reverse = new StringBuilder(new StringBuilder(s).reverse().toString());
        System.out.println("Entered word:" + reverse);
        if(reverse.toString().equals(s))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }


    public static void main(String[] args) {
        String s = "radar";
        checkPalindrome(s);
    }
}
