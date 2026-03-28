package StandardProgramIQ;

//The continue statement is used to skip the current iteration of a loop
//and continue with the next iteration.
public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            {
                if (i == 3)
                    continue;
            }
            System.out.println("Iteration " + i);
        }
    }
}