package mcq;

public class P2 {

    public static void main(String[] args) {
        try{
            throw new Exception("Exception occured");

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
