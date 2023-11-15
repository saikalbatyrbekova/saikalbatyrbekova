import java.util.ArrayList;
class PersonalAccount {
    private double balance;
    private String accountHolder;
    private ArrayList<Amount> transactions;

    public PersonalAccount(double initialBalance, String accountHolder) {
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Amount(amount, "Deposit"));
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance to withdraw " + amount);
        }
        balance -= amount;
        transactions.add(new Amount(amount, "Withdrawal"));
    }

    public void displayTransactions() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Transaction History:");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": " + transaction.getAmount());
        }
        System.out.println("Current Balance: " + balance);
    }
}
