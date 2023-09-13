import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, "Deposit"));
        } else {
            System.out.println("Amount must be greater than zero!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdrawal"));
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }

    public void displayTransactions() {
        System.out.println("Transaction History: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Transactions:");
        for (Amount transaction : transactions) {
            System.out.println("Type: " + transaction.getTransactionType() + ", Amount: " + transaction.getAmount());
        }
    }


}
