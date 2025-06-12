package lambda;

public class LambdaExample {
    public static void main(String[] args) {
        // Traditional Anonymous Class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running using Anonymous Class");
            }
        };

        // Lambda Expression
        Runnable r2 = () -> System.out.println("Running using Lambda!");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
