package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter speed limit");
        int speedLimit1 = scan.nextInt();

        System.out.println ("Enter current speed");
        int currentSpeed1 = scan.nextInt();
        int overTheLimit1 = currentSpeed1 - speedLimit1;
        System.out.println ("You are driving " + overTheLimit1 +  "mph over the speed limit");
    }
}
