package mcq;

public class P3 {
    public static void main(String[] args) {
         int x = 10;
        System.out.println(x++); //Compilation error
        // Cannot assign value to a final variable
        int y = 10;
        System.out.println(--x);
        System.out.println(--x + y);
    }
}
