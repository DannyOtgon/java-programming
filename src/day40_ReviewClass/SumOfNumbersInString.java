package day40_ReviewClass;
/*
in a String vale a5bc12def100g  set up method to add 5+12+100
 */
public class SumOfNumbersInString {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100g"));
    }

    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {           // Wrapper class Char, checks if every character is a number/digit.
                num += str.charAt(i);

                if (!Character.isDigit(str.charAt(i = 1))) {
                    sum += Integer.parseInt(num);
                }
            }
        }
        return sum;
    }
}

/**
 * int sum = 0;
 *         String num = ""; // 1
 *
 *         for (int i = 0; i < str.length(); i++) {
 *
 *             if (Character.isDigit(str.charAt(i))) { // checks if every character is a number (digit)
 *                 num += str.charAt(i);
 *
 *                 if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
 *                     sum += Integer.parseInt(num);
 *                     num = ""; // resets our String for the number
 *                 }
 *
 *             }
 *         }
 *
 *         return sum;
 */



