package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "Java";

        if (todaysClass.equals("Java"))
            System.out.println("Java is fun");
        else
            System.out.println("It is not java. It is" + todaysClass);

        int a = 1;
        if (a==1){
            System.out.println("a is 1");
            System.out.println("1 is a");
        }

    }
}
