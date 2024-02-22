import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private List<Transaction> transactions;

    public Account() {
        this.transactions = new ArrayList<>();
    }

    @Override
    public void deposit(int amount) {
        transactions.add(new Transaction(amount));
    }

    @Override
    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount));
    }

    @Override
    public void printStatement() {
        System.out.println("Date       || Amount   || Balance");
        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            System.out.printf("%s || %8d || %8d%n", transaction.getDate(), transaction.getAmount(), balance);
        }
    }
}
