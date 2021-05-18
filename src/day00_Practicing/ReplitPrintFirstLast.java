package day00_Practicing;

import java.util.*;

public class ReplitPrintFirstLast {
    public static void main(String[] args) {
        String[] words ={"hello", "why", "by", "apple" , "note"};
        System.out.println(Arrays.toString(words));

        for (int i=0; i<words.length; i++){
            System.out.print(words[i].charAt(0));
            System.out.print(words[i].charAt(words[i].length()-1)+"\n");

        }

    }
}
