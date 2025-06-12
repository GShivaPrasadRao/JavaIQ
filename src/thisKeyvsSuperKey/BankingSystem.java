package thisKeyvsSuperKey;//Example code for this and super keys in java

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println(accountHolder + "'s Account Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountHolder, double balance, double interestRate) {
        super(accountHolder, balance); // Calling parent constructor
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = super.balance * (interestRate / 100);
        System.out.println("Interest for " + super.accountHolder + ": $" + interest);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", 10000, 5);
        savings.displayBalance(); // Calls Superclass Method
        savings.calculateInterest(); // Uses Superclass Variable
    }
}
