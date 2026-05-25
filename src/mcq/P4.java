package mcq;

import java.util.HashSet;

public class P4 {
    public static void main(String[] args) {
        HashSet<String> set1 =  new HashSet<>();
        set1.add("Java");
        set1.add("Python");
        set1.add("Javascript");
        System.out.println("Set1:"+set1);

        HashSet<String> set2 = new HashSet<>();
        set2.add("Python");
        set2.add("Java");
        set2.add("Javascript");
        System.out.println("Set2:"+set2);

        System.out.println(set1.equals(set2));
    }
}
