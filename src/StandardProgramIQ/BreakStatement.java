package StandardProgramIQ;

//The break statement is used to exit from a loop or switch statement prematurely.
public class BreakStatement {

    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            if(i==4)
            {
                break;
            }
            System.out.println("Count "+i);
        }
    }
}
