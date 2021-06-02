package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.user = "John";
        user1.spend(25);
        user1.showBalance();

        BankAccount user2 = new BankAccount();
        user2.user = "Stacey";
        user2.showBalance();
        user2.spend(1000);
        user1.showBalance();
    }
}
