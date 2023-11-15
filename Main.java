public class Main {

    public static void main(String[] args) {
        try {
            // Creating a PersonalAccount object
            PersonalAccount account = new PersonalAccount(7777, "Jasmin and Saikal");

            // Performing transactions
            account.deposit(1000);
            account.withdraw(500);
// This should throw InsufficientBalanceException

            // Displaying transactions
            account.displayTransactions();
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
