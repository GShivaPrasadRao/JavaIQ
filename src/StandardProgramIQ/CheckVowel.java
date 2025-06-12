package StandardProgramIQ;

//Program to check if a given value has the vowel or not
public class CheckVowel {

    public static boolean identifyVowel(String value) {
        //Define the vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        System.out.println("Vowel Length : "+ vowels.length);

        //Convert the string to char array
        char[] resultChars = value.toCharArray();
        System.out.println("Input length : "+resultChars.length);

        //Enhanced Nested for loop
        for (char ch : resultChars) {
            for (char vowel : vowels) {
                if (ch == vowel) {
                    return true;
                }
            }
        }

        /* Normal for loop
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            for (int j = 0; j < vowels.length; j++) {
                char vowel = vowels[j];
                if (ch == vowel) {
                    return true;
                }
            }
        }
         */

        return false;


    }

    public static void main(String[] args) {
        String value = "amukthamalyada";
        boolean result = identifyVowel(value);
        System.out.println("\"" + value + "\" has vowel: " + result); // Output: true

    }

}
