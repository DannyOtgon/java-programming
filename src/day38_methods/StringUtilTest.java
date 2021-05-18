package day38_methods;
/**
 * import all static methods. so that you can just call by method name, without classname.
 */

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");

            System.out.println(isPalindrome("Civic"));
            System.out.println("Is RaceCar palindrome? " + isPalindrome("Racecar"));
            System.out.println("Is Kayaki palindrome? " + isPalindrome("Kayaki"));
            System.out.println("Is NASA palindrome? " + isPalindrome("nasa"));
            String word = "java";
            System.out.println(StringUtils.reverse(word));
        }
    }
    public static boolean isPalindrome (String str){
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
            if (reverse.equalsIgnoreCase(str)) {
            return true;
            }

        }
        return false;
    }
}
