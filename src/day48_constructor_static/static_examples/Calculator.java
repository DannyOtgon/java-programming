package day48_constructor_static.static_examples;

public class Calculator {


    //this is STATIC METHOD-You can call it anytime
    public static void add (int num1, int num2){
        System.out.println(num1 + num2);
    }

    //this is INSTANCE/OBJECT METHOD (you need to create object to call it)
    public void multiply (int num1, int num2){
        System.out.println(num1*num2);
    }
}
