package mcq;

public class P1 {

    public static void main(String[] args) {
        StringBuilder sb;
        sb = new StringBuilder("Java");
        sb.append(" Programming World").toString().replace("World", "galaxy");
        System.out.println(sb);

        String s = "Java Programming World".replace("World", "Galaxy");
        String str = "       Java World ".replace(" ", "");

        String input = "Hello \t World \n Java";

        String result = input.replaceAll("\\s", "");

        System.out.println(result); // HelloWorldJava
        System.out.println(str);

    }
}
