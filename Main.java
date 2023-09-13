// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(7777, "Jasmin and Saikal");

        account.deposit(1000);
        account.withdraw(500);
        account.deposit(200);
        account.withdraw(300);
        account.withdraw(500);

        account.displayTransactions();
    }
}