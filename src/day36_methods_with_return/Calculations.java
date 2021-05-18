package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10+45 = " + Calculator.add(10,45));
        System.out.println("minus 55-45 = " + Calculator.minus(55,45));
        System.out.println("multiply 5*5 = " + Calculator.multiply(5,5));
        System.out.println("divide 24/3 = " + Calculator.divide(24,3));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1,d2);
        System.out.println("result = " + result);
    }
}
