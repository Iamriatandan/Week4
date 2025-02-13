package bankingsystem;
import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        Queue<String> withdrawalRequests = new LinkedList<>();

        // Sample accounts and withdrawal requests
        accounts.put("A001", 1000.00);
        accounts.put("A002", 1500.00);

        withdrawalRequests.add("A001");

        processWithdrawals(accounts, withdrawalRequests);
    }

    public static void processWithdrawals(Map<String, Double> accounts, Queue<String> withdrawalRequests) {
        while (!withdrawalRequests.isEmpty()) {
            String accountNumber = withdrawalRequests.poll();
            double balance = accounts.get(accountNumber);
            if (balance >= 500.00) {
                accounts.put(accountNumber, balance - 500.00);
                System.out.println("Withdrawal processed for account: " + accountNumber);
            } else {
                System.out.println("Insufficient funds for account: " + accountNumber);
            }
        }
    }
}
