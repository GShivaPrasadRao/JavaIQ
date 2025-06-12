package String;

public class StringComparison {

    public static void main(String[] args) {
        String s1="Shiva";
        String s2= "Shiva";

        //Equals check for the content
        if(s1.equals(s2)) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        //== checks for the object reference
        if (s1 == s2)
        {
            System.out.println("Same reference");
        }
        else {
            System.out.println("Not same reference");
        }
    }
}
