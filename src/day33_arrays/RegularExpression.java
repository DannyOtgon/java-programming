package day33_arrays;
import java.util.*;

public class RegularExpression {
    public static void main(String[] args) {

        String word = "java1html2sql";
        String [] strArr2 = word.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
