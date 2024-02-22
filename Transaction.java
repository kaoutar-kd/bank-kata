import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private int amount;
    private String date;

    public Transaction(int amount) {
        this.amount = amount;
        this.date = new SimpleDateFormat("MM/dd/yyyy").format(new Date()); 
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
