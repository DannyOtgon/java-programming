package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Mongolia";
        System.out.println(word.toLowerCase(Locale.ROOT));
        System.out.println(word.toLowerCase());

        System.out.println(word.toUpperCase());
        System.out.println("USA".toLowerCase());

        System.out.println("================================================");
        String term = "CyberTek";
        System.out.println(term.toLowerCase());
        System.out.println(term);
        term = term.toLowerCase();
        System.out.println(term);

        System.out.println("========================================================");


    }
}
