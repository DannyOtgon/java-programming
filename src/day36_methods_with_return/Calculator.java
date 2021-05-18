package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2, 20.0));
        System.out.println(minus(100.0, 79.8));
        System.out.println(multiply(100, 6));
        System.out.println(divide(100.0, 25));

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;

    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;

    }
}
