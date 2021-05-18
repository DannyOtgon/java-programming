package day35_methods_with_param;

public class MethodWithInputs {
    public static void main(String[] args) {
        displayValue(123);
        displayValue(2343);
        displayValue(0);
        int count = 99;
        displayValue(count);
        displayValue(count+1);
        System.out.println("===================");

        greetByName("Danny");

    }
    public static void displayValue (int num){
        System.out.println("value is: " + num);
    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+", how are you today?");
    }

}
