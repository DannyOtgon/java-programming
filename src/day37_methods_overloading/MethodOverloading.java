package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(1, 2);
        sum(1, 2, 3);
        sum(10.5, 10.4);
        sum("KO", "BE");
        sum(4.6,1);

    }

    public static void sum(int num1, int num2) {
        System.out.println("sum(int num1,int num2");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("sum(int num1,int num2, int num3");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void sum(double num1, double num2) {
        System.out.println("sum(double num1,double num2");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void sum(String str1, String str2) {
        System.out.println("sum(str1,str2");
        System.out.println("Result = " + (str1 + "^*^"+str2));
    }

    public static void sum(double num1, int num2) {
        System.out.println("sum(double num1,int num2");
        System.out.println("Result = " + (num1 + num2));
    }
}
