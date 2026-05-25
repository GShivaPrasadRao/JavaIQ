package multithreading;

/*Synchronization in Java is a mechanism that ensures that only one thread
can access a shared resource (like a variable, object, or method) at a time. It prevents
concurrent threads from interfering with each other while modifying shared data.
* */
class Table {
    // Only one thread can execute this at a time
    synchronized void printTable(int n) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + (n * i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class SynchronizedMethod {
    public static void main(String args[]) {
         Table obj = new Table(); // Shared resource

        Thread t1 = new Thread(() -> obj.printTable(5), "Thread-1");
        Thread t2 = new Thread(() -> obj.printTable(100), "Thread-2");

        t1.start();
        t2.start();
    }
}
