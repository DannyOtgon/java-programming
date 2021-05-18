package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(1000<1000.9);
        System.out.println(10<=10);
        System.out.println(100 != 44);
        
        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println( a > b);
        System.out.println(a < b );
        System.out.println(a <= b);
        System.out.println(a != b);
        System.out.println();
        System.out.println();

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        String name = "Danny";
        boolean Checkname = name == name;
        System.out.println("Checkname = " + Checkname);

        System.out.println();
        System.out.println();

        int num1 = 50;
        int num2 = 200;
        num2 = num1;
        System.out.println(num1);
        System.out.println(num2);




    }
}
