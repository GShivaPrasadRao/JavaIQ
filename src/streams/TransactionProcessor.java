package streams;

import java.util.*;
import java.util.stream.Collectors;

class Transaction {
    String userId;
    String city;
    double amount;
    boolean success;

    public Transaction(String userId, String city, double amount, boolean success) {
        this.userId = userId;
        this.city = city;
        this.amount = amount;
        this.success = success;
    }

    public String getCity() {
        return city;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class TransactionProcessor {
    public static void main(String[] args) {
        //list of values
        List<Transaction> transactions = Arrays.asList(
                //Hyderabad
                new Transaction("1", "Hyderabad", 1000.0, true),
                new Transaction("2", "Hyderabad", 2000.0, false),
                new Transaction("3", "Hyderabad", 5000.0, true),

                //Bangalore
                new Transaction("4", "Bangalore", 2000.0, true),
                new Transaction("5", "Bangalore", 2000.0, false),
                new Transaction("6", "Bangalore", 6000.0, true),

                //Delhi
                new Transaction("7", "Delhi", 3000.0, true),
                new Transaction("8", "Delhi", 2000.0, false),
                new Transaction("9", "Delhi", 7000.0, true),

                //Chennai
                new Transaction("10", "Chennai", 4000.0, true),
                new Transaction("11", "Chennai", 2000.0, false),
                new Transaction("12", "Chennai", 8000.0, true)
        );


        // 1, 2, & 3: Filter, Group, and Summarize (Sum + Max)
        Map<String, DoubleSummaryStatistics> cityStats = transactions.stream()
                .filter(Transaction::isSuccess)
                .collect(Collectors.groupingBy(
                        Transaction::getCity,
                        Collectors.summarizingDouble(Transaction::getAmount)
                ));

        // 4. Sort by Total Amount (Descending) and get Top 3
        List<Map.Entry<String, DoubleSummaryStatistics>> topCities = cityStats.entrySet().stream()
                .sorted((entry1, entry2) -> Double.compare(
                        entry2.getValue().getSum(), // Descending order
                        entry1.getValue().getSum()
                ))
                .limit(3)
                .collect(Collectors.toList());

        // Display Results
        topCities.forEach(entry -> {
            System.out.println("City: " + entry.getKey());
            System.out.println(" - Total Amount: " + entry.getValue().getSum());
            System.out.println(" - Highest Transaction: " + entry.getValue().getMax());
        });
    }
}