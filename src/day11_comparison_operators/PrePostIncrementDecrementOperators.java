package day11_comparison_operators;

import java.sql.SQLOutput;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = ++num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 10;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
