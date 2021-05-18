package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("hello"));
        String word = null;
        //  System.out.println(word.toUpperCase(Locale.ROOT));   doesn't work because null value can't be converted to UpperCase
        System.out.println(isNullOrEmpty(word));
        String word2 = "";
        System.out.println(isNullOrEmpty(word2));
    }
    public static boolean isNullOrEmpty(String str){
        return (str == null || str.isEmpty());

    }
    public static String reverse(String str){
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
