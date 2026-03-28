package infosysiqa;

public class Program1 {

    public static void main(String[] args) {
        Object obj = null;
        String s1 = String.valueOf(obj);

        System.out.println("S1 Result: " + s1); // null

        String s2 = obj.toString(); // error -Cannot invoke "Object.toString()" because "obj" is null
        System.out.println("S2 Result:" + s2);

    }


}
