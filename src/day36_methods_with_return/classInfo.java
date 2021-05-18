package day36_methods_with_return;
import java.util.*;

public class classInfo {
    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(age());
        System.out.println(isMarried());
        System.out.println(getRandomYear());
    }
    public static String fullName(){
        System.out.println("inside fullName method");
        return "Mike Smith";
    }
    public static int age(){
        return 29;
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
