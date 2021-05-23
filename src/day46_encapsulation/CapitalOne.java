package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountHolder("John Adam");
        checkingAccount.setAccountNumber(123456987);
        checkingAccount.setType("Checking");
        checkingAccount.setBalance(1_321520.98);
        System.out.println(checkingAccount);

    }
}
