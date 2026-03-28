package oops;

//2.Encapsulation
//Wrapping data (variables) and code (methods) together as a single unit.
//Use of private variables and public getter/setter methods.
class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
