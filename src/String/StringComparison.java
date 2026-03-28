package String;

public class StringComparison {

    public static void main(String[] args) {
        String s1="Shiva";
        String s2= "Shiva";
        String s3 = s1;

        //Equals check for the content
        if(s1.equals(s2)) {
            System.out.println("Content Comparision: Equal");
        }else {
            System.out.println("Content Comparision: Not Equal");
        }

        //== checks for the object reference
        if (s1 == s2)
        {
            System.out.println("Object Reference : Same reference");
        }
        else {
            System.out.println("Object Reference : Not same reference");
        }

        if (s1 == s3)
        {
            System.out.println("Object Reference New : Same reference");
        }
        else {
            System.out.println("Object Reference : Not same reference");
        }
    }
}
