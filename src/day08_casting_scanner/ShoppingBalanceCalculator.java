package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        short price3 = 15;
        double remainingBalance = balance - price1 - price2 - price3;

        System.out.println(remainingBalance);
        System.out.println("Your initial balance $"+balance);
        System.out.println("Your initial balance $"+remainingBalance);

        //I want to print my remaining balance without change. 219.68

        int balanceWithNoCents =  ( int) remainingBalance;
        System.out.println(balanceWithNoCents);

        //2 types of casting: IMPLICIT & EXPLICIT
        //IMPLICIT: casting happens automatically when we assign small data type into larger one
        //EXPLICIT: we need to use parenthesis and specify what primitive type we want to cast/convert

        byte num1 = 10;
        short num2= num1;
        System.out.println(num2);

    }
}
