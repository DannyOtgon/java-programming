package day26_loops;

import java.util.*;

public class PrintCharsReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        for (int i = 0; i<word.length();i++){
            System.out.print(word.charAt(i));
        }


    }
}
