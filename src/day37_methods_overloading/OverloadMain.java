package day37_methods_overloading;
import java.util.*;

public class OverloadMain {
    public static void main(String[] differentName) {   // main method variable name can be different
        System.out.println("hello from Real main method");
        System.out.println(Arrays.toString(differentName));       //you can print out main variable. Overloading->Edit->Add variable
        main(0);
    }

    public static void main(int num) {
        System.out.println("num = " + num);                 // Main method can be overloaded: same name but different parameter

    }
}

