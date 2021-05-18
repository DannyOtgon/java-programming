package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {

        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(currentSpeed==speedLimit);

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20;
        System.out.println("Current speed = " + currentSpeed);
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can I Afford? = " + canAfford);

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke? = " + isBroke);






    }
}
