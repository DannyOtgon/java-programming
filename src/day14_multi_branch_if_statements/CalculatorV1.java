package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 2.5;
        char operator = '*';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if (operator == '/'){
            System.out.println(num1 / num2);
        } else {
            System.out.println("Lets Code Java");
        }
        System.out.println("============_______________==============");
        System.out.println("Lets Code Java");

    }
}
