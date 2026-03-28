package streams;

import java.util.*;
import java.util.stream.Collectors;

/*
👉 You need to:

Take only successful transactions ✅
Group them by city 🏙️
For each city:
Get total amount
Get max transaction
Pick top 3 cities by total amount 🏆

Filter → Group → Calculate → Sort → Top 3
 */

class TransactionCities {
    private String userId;
    private double amount;
    private String city;
    private boolean success;

    public TransactionCities(String userId, double amount, String city, boolean success) {
        this.userId = userId;
        this.amount = amount;
        this.city = city;
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
        return "Transaction: {" +
                "userId='" + userId + '\'' +
                ", city='" + city + '\'' +
                ", amount=" + amount +
                ", success=" + success +
                '}';
    }
}

public class PracticeTransaction {
    public static void main(String[] args) {
        //Create the list of transactions
        List<TransactionCities> transactionCitiesList = Arrays.asList(
                //Hyderabad
                new TransactionCities("1", 1000.0, "Hyderabad", true),
                new TransactionCities("2", 2000.0, "Hyderabad", false),
                new TransactionCities("3", 5000.0, "Hyderabad", true),

                //Bangalore
                new TransactionCities("4", 2000.0, "Bangalore", true),
                new TransactionCities("5", 2000.0, "Bangalore", false),
                new TransactionCities("6", 6000.0, "Bangalore", true),

                //Delhi
                new TransactionCities("7", 3000.0, "Delhi", true),
                new TransactionCities("8", 2000.0, "Delhi", false),
                new TransactionCities("9", 7000.0, "Delhi", true),

                //Chennai
                new TransactionCities("10", 4000.0, "Chennai", true),
                new TransactionCities("11", 2000.0, "Chennai", false),
                new TransactionCities("12", 8000.0, "Chennai", true)


        );

        // STEP 0: Original Data
        System.out.println("----STEP 0:Original Transactions:----");
        transactionCitiesList.forEach(System.out::println);
        System.out.println('\n');

        //Step 1: filter the successful transactions
        List<TransactionCities> successTxns = transactionCitiesList.stream().
                filter(t -> t.isSuccess()).
                toList();


        System.out.println("---     🛑 STEP 1: AFTER FILTERING (Success Only): ---");

        successTxns.forEach(System.out::println);


        // STEP 2: Group by City & Calculate Sum and Max
        Map<String, DoubleSummaryStatistics> groupByCityStats =
                transactionCitiesList.stream()
                .filter(t -> t.isSuccess()) // 🛑 THIS LINE IS THE KEY
                .collect(Collectors.groupingBy(TransactionCities::getCity,
                        Collectors.summarizingDouble(TransactionCities::getAmount)
                ));

        System.out.println('\n' +"--- 📂 STEP 2: AFTER GROUPING BY CITY Total and Highest Transaction ---");
        groupByCityStats.forEach((City, stats) -> {
            System.out.println(City + " -> [Total Sum: " + stats.getSum() + ", Max: " + stats.getMax() + "]");
        });
        System.out.println();


        // ⚖️ STEP 3: Sort the Map Entries by Sum (Descending)
        List<Map.Entry<String, DoubleSummaryStatistics>> sortedList =
                groupByCityStats.entrySet().stream()
                .sorted((entry1,
                         entry2) ->
                        Double.compare(
                        entry2.getValue().getSum(),
                        entry1.getValue().getSum()
                ))
                .collect(Collectors.toList());

        System.out.println("--- ⚖️ STEP 3: AFTER SORTING BY TOTAL AMOUNT (High to Low) ---");
        sortedList.forEach(entry ->
                System.out.println(entry.getKey() + " (Total Sum: " + entry.getValue().getSum() + ")")
        );
        System.out.println();


        // 🏆 STEP 4: Limit to Top 3 Cities
        List<Map.Entry<String, DoubleSummaryStatistics>> top3Cities =
                sortedList.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("--- 🏆 STEP 4: FINAL ANSWER (Top 3 Cities) ---");
            top3Cities.forEach(entry -> {
                System.out.println("Rank " + (top3Cities.indexOf(entry) + 1) + ": " + entry.getKey()
                        + " | Total Sum: " + entry.getValue().getSum()
                        + " | Single Highest: " + entry.getValue().getMax());
            });
    }
}
