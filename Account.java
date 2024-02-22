import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Transaction> transactions;

    public Account() {
        this.transactions = new ArrayList<>();
    }

    public void deposit(int amount, String date) {
        Transaction transaction = new Transaction(amount, date);
        transactions.add(transaction);
    }

    public void withdraw(int amount, String date) {
        Transaction transaction = new Transaction(-amount, date);
        transactions.add(transaction);
    }

    public void printStatement() {
        StatementPrinter.print(transactions);
    }

    // Inner class to represent a transaction
    private static class Transaction {
        private int amount;
        private String date;

        public Transaction(int amount, String date) {
            this.amount = amount;
            this.date = date;
        }

        public int getAmount() {
            return amount;
        }

        public String getDate() {
            return date;
        }
    }

    // Inner class to handle statement printing
    private static class StatementPrinter {
        public static void print(List<Transaction> transactions) {
            // Implement statement printing logic here
            // You can format the output as specified in the acceptance test
            // For simplicity, let's just print the transactions for now
            for (Transaction transaction : transactions) {
                System.out.println(transaction.getDate() + " | " + transaction.getAmount());
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000, "10-01-2012");
        account.deposit(2000, "13-01-2012");
        account.withdraw(500, "14-01-2012");
        account.printStatement();
    }
}
