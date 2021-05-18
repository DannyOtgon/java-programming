package day20_string_manipulation;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

/**Gray command lines => command not being used which is not good. Need Delete!*/
/**below import statement is automatically added*/

public class StringCreationMethods {
    public static void main(String[] args) {

        String word = "Anime";
        String word2 = new String ("Naruto");
        System.out.println(word);
        System.out.println(word2);
        String word3 = "";
        String word4 = new String ();
        System.out.println(word4);
        Scanner scan = new Scanner(System.in);
        String word5 = scan.next();

        String str = "";
        System.out.println(str.length());

        String car = "Lexus";
        System.out.println(car.isEmpty());
        System.out.println(str.isEmpty());



    }
}
