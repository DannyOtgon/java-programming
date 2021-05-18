package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter rent and month");
        double rent = scan.nextDouble();
        scan.nextLine();   // ***THIS WILL FIX THE nextLine BUG !!!************
        String month = scan.nextLine();
        System.out.println("rent = "+ rent);
        System.out.println("month = "+ month);

        double rent1 = scan.nextDouble();
        scan.nextLine();
        String month2 = scan.nextLine();
        System.out.println(rent1);
        System.out.println(month2);




    }
}
