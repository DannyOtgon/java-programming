package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double hoursWeek1 = scan.nextDouble();
        double hourlyRate1 = scan.nextDouble();
        double weeklySalary1 = hoursWeek1* hourlyRate1;

        System.out.println("weeklySalary = "+ weeklySalary1);
        System.out.println("Monthly salary = " + weeklySalary1 * 4);
        System.out.println("Annual salary = " + weeklySalary1 * 52);

        scan.close();





    }
}
