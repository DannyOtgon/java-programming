package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 20;
        double salesAmount = 5000.0;

        if (salesAmount <= 1000) {
            System.out.println("Goodjob, you qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;

        }
        System.out.println("Your total bonus: $" + bonus);
    }
}
