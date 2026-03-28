package StandardProgramIQ;

//The do-while loop is used to execute a block of code at least once, and then repeatedly
//as long as the specified condition is true.
public class DoWhileLoop {

    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count " + count);
            count++;
        } while (count <= 10);

    }
}
