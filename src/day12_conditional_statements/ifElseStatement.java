package day12_conditional_statements;

public class ifElseStatement {
    public static void main(String[] args) {
        if(10 > 5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }

        int count = 25;
        if (count > 30) {
            System.out.println("COUNT IS MORE THAN 30");
        }else {
            System.out.println("COUNT IS LESS THAN 30");

            System.out.println();

            byte age = 25;
            if (age >= 18) {
                System.out.println("Eligible to vote");
                System.out.println("Age is greater or equal to 18");
            }else{
                System.out.println("Not Eligible to vote");
                System.out.println("Age is less than 18");

            }
        }
    }
}
