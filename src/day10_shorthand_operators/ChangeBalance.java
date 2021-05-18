package day10_shorthand_operators;
import java.util.Scanner;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance is  \t\t\t\t$" + balance);
        double baklava = 22.50;
        System.out.println("Baklava is  \t\t\t\t$" + baklava);
        balance = balance - baklava;
        System.out.println("Balance after baklava is    $" + balance);

        System.out.println();

        double kenafa = 44.45;
        System.out.println("kenafa = \t\t\t\t\t$"+kenafa);
        balance = balance - kenafa;
        System.out.println("Balance after kenafa is $\t" + balance);
        
        kenafa = kenafa /2;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance after second kenafa= $" + balance );

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea * 4;
        System.out.println("balance after 4 icedtea= $" + balance );




        

    }
}
