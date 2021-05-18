package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 110;
        int num2 = 44;
        int num3 = 110;

        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is largest value");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is largest value");
        }else if (num3 >2 && num3 > 1){
            System.out.println(num3 + " is largest value");
        }else{
            System.out.println("two or more values are same");
        }
    }
}
